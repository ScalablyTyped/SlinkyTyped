package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroupMember extends js.Object {
  /**
    * The ID for an origin in an origin group.
    */
  var OriginId: String = js.native
}

object OriginGroupMember {
  @scala.inline
  def apply(OriginId: String): OriginGroupMember = {
    val __obj = js.Dynamic.literal(OriginId = OriginId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMember]
  }
  @scala.inline
  implicit class OriginGroupMemberOps[Self <: OriginGroupMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

