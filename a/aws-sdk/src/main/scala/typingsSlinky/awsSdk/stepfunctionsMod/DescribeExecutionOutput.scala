package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExecutionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that id entifies the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The string that contains the JSON input data of the execution.
    */
  var input: SensitiveData = js.native
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The JSON output data of the execution.  This field is set only if the execution succeeds. If the execution fails, this field is null. 
    */
  var output: js.UndefOr[SensitiveData] = js.native
  /**
    * The date the execution is started.
    */
  var startDate: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the executed stated machine.
    */
  var stateMachineArn: Arn = js.native
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus = js.native
  /**
    * If the execution has already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[js.Date] = js.native
}

object DescribeExecutionOutput {
  @scala.inline
  def apply(
    executionArn: Arn,
    input: SensitiveData,
    startDate: js.Date,
    stateMachineArn: Arn,
    status: ExecutionStatus
  ): DescribeExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExecutionOutput]
  }
  @scala.inline
  implicit class DescribeExecutionOutputOps[Self <: DescribeExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: SensitiveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateMachineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMachineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ExecutionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: SensitiveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withStopDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDate")(js.undefined)
        ret
    }
  }
  
}

