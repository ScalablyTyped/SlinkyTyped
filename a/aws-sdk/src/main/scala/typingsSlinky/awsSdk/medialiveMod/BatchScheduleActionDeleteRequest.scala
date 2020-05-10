package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionDeleteRequest extends js.Object {
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: listOfString = js.native
}

object BatchScheduleActionDeleteRequest {
  @scala.inline
  def apply(ActionNames: listOfString): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
  @scala.inline
  implicit class BatchScheduleActionDeleteRequestOps[Self <: BatchScheduleActionDeleteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionNames(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

