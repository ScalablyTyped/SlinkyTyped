package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportTaskRunnerHeartbeatOutput extends js.Object {
  /**
    * Indicates whether the calling task runner should terminate.
    */
  var terminate: Boolean = js.native
}

object ReportTaskRunnerHeartbeatOutput {
  @scala.inline
  def apply(terminate: Boolean): ReportTaskRunnerHeartbeatOutput = {
    val __obj = js.Dynamic.literal(terminate = terminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatOutput]
  }
  @scala.inline
  implicit class ReportTaskRunnerHeartbeatOutputOps[Self <: ReportTaskRunnerHeartbeatOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTerminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

