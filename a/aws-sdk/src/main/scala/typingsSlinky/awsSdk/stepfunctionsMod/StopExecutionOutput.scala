package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopExecutionOutput extends js.Object {
  /**
    * The date the execution is stopped.
    */
  var stopDate: js.Date = js.native
}

object StopExecutionOutput {
  @scala.inline
  def apply(stopDate: js.Date): StopExecutionOutput = {
    val __obj = js.Dynamic.literal(stopDate = stopDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopExecutionOutput]
  }
}

