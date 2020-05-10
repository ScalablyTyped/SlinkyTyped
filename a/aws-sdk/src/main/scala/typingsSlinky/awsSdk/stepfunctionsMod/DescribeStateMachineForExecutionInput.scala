package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStateMachineForExecutionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the execution you want state machine information for.
    */
  var executionArn: Arn = js.native
}

object DescribeStateMachineForExecutionInput {
  @scala.inline
  def apply(executionArn: Arn): DescribeStateMachineForExecutionInput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStateMachineForExecutionInput]
  }
  @scala.inline
  implicit class DescribeStateMachineForExecutionInputOps[Self <: DescribeStateMachineForExecutionInput] (val x: Self) extends AnyVal {
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
  }
  
}

