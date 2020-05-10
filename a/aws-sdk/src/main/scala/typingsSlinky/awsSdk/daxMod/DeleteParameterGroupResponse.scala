package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParameterGroupResponse extends js.Object {
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.native
}

object DeleteParameterGroupResponse {
  @scala.inline
  def apply(): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
  @scala.inline
  implicit class DeleteParameterGroupResponseOps[Self <: DeleteParameterGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletionMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionMessage")(js.undefined)
        ret
    }
  }
  
}

