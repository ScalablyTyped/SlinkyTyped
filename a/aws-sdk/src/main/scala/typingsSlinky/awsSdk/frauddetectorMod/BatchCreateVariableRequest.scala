package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateVariableRequest extends js.Object {
  /**
    * The list of variables for the batch create variable request.
    */
  var variableEntries: VariableEntryList = js.native
}

object BatchCreateVariableRequest {
  @scala.inline
  def apply(variableEntries: VariableEntryList): BatchCreateVariableRequest = {
    val __obj = js.Dynamic.literal(variableEntries = variableEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateVariableRequest]
  }
  @scala.inline
  implicit class BatchCreateVariableRequestOps[Self <: BatchCreateVariableRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariableEntries(value: VariableEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableEntries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

