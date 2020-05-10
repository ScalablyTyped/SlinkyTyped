package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopProcessingJobRequest extends js.Object {
  /**
    * The name of the processing job to stop.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
}

object StopProcessingJobRequest {
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName): StopProcessingJobRequest = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProcessingJobRequest]
  }
  @scala.inline
  implicit class StopProcessingJobRequestOps[Self <: StopProcessingJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessingJobName(value: ProcessingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

