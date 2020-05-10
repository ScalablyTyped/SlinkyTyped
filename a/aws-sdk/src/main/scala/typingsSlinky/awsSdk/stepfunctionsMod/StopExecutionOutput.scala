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
  @scala.inline
  implicit class StopExecutionOutputOps[Self <: StopExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStopDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

