package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroup extends js.Object {
  /**
    * A complex type that contains information about the failover criteria for an origin group.
    */
  var FailoverCriteria: OriginGroupFailoverCriteria = js.native
  /**
    * The origin group's ID.
    */
  var Id: String = js.native
  /**
    * A complex type that contains information about the origins in an origin group.
    */
  var Members: OriginGroupMembers = js.native
}

object OriginGroup {
  @scala.inline
  def apply(FailoverCriteria: OriginGroupFailoverCriteria, Id: String, Members: OriginGroupMembers): OriginGroup = {
    val __obj = js.Dynamic.literal(FailoverCriteria = FailoverCriteria.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroup]
  }
  @scala.inline
  implicit class OriginGroupOps[Self <: OriginGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailoverCriteria(value: OriginGroupFailoverCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailoverCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: OriginGroupMembers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

