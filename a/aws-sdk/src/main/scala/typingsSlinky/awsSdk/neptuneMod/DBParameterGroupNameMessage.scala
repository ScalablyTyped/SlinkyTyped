package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroupNameMessage extends js.Object {
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
}

object DBParameterGroupNameMessage {
  @scala.inline
  def apply(): DBParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroupNameMessage]
  }
  @scala.inline
  implicit class DBParameterGroupNameMessageOps[Self <: DBParameterGroupNameMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(js.undefined)
        ret
    }
  }
  
}

