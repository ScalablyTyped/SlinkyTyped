package typingsSlinky.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunResponse extends js.Object {
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typingsSlinky.awsDashSdk.clientsGlueMod.JobRun] = js.native
}

object GetJobRunResponse {
  @scala.inline
  def apply(JobRun: JobRun = null): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    if (JobRun != null) __obj.updateDynamic("JobRun")(JobRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunResponse]
  }
}

