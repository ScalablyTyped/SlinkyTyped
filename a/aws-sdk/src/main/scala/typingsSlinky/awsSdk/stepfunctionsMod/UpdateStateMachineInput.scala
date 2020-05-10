package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStateMachineInput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: js.UndefOr[Definition] = js.native
  /**
    * The LoggingConfiguration data type is used to set CloudWatch Logs options.
    */
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the state machine.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine.
    */
  var stateMachineArn: Arn = js.native
}

object UpdateStateMachineInput {
  @scala.inline
  def apply(stateMachineArn: Arn): UpdateStateMachineInput = {
    val __obj = js.Dynamic.literal(stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineInput]
  }
  @scala.inline
  implicit class UpdateStateMachineInputOps[Self <: UpdateStateMachineInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateMachineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMachineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfiguration(value: LoggingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

