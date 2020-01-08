package typingsSlinky.awsDashSdk.clientsStepfunctionsMod

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
}

