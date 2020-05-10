package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStateMachineOutput extends js.Object {
  /**
    * The date and time the state machine was updated.
    */
  var updateDate: js.Date = js.native
}

object UpdateStateMachineOutput {
  @scala.inline
  def apply(updateDate: js.Date): UpdateStateMachineOutput = {
    val __obj = js.Dynamic.literal(updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineOutput]
  }
  @scala.inline
  implicit class UpdateStateMachineOutputOps[Self <: UpdateStateMachineOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

