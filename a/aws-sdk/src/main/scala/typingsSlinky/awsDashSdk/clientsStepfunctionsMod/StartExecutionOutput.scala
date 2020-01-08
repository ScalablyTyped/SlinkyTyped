package typingsSlinky.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartExecutionOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn = js.native
  /**
    * The date the execution is started.
    */
  var startDate: js.Date = js.native
}

object StartExecutionOutput {
  @scala.inline
  def apply(executionArn: Arn, startDate: js.Date): StartExecutionOutput = {
    val __obj = js.Dynamic.literal(executionArn = executionArn.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartExecutionOutput]
  }
}

