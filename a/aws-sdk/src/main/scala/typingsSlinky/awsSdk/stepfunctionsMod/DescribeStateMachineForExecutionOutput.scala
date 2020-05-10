package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineForExecutionOutput extends js.Object {
  /**
    * The Amazon States Language definition of the state machine. See Amazon States Language.
    */
  var definition: Definition = js.native
  var loggingConfiguration: js.UndefOr[LoggingConfiguration] = js.native
  /**
    * The name of the state machine associated with the execution.
    */
  var name: Name = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution. 
    */
  var roleArn: Arn = js.native
  /**
    * The Amazon Resource Name (ARN) of the state machine associated with the execution.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The date and time the state machine associated with an execution was updated. For a newly created state machine, this is the creation date.
    */
  var updateDate: js.Date = js.native
}

object DescribeStateMachineForExecutionOutput {
  @scala.inline
  def apply(definition: Definition, name: Name, roleArn: Arn, stateMachineArn: Arn, updateDate: js.Date): DescribeStateMachineForExecutionOutput = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionOutput]
  }
  @scala.inline
  implicit class DescribeStateMachineForExecutionOutputOps[Self <: DescribeStateMachineForExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: Definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMachineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMachineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDate")(value.asInstanceOf[js.Any])
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
  }
  
}

