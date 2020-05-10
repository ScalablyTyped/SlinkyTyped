package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStateMachineOutput extends js.Object {
  /**
    * The date the state machine is created.
    */
  var creationDate: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the created state machine.
    */
  var stateMachineArn: Arn = js.native
}

object CreateStateMachineOutput {
  @scala.inline
  def apply(creationDate: js.Date, stateMachineArn: Arn): CreateStateMachineOutput = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStateMachineOutput]
  }
  @scala.inline
  implicit class CreateStateMachineOutputOps[Self <: CreateStateMachineOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMachineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMachineArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

