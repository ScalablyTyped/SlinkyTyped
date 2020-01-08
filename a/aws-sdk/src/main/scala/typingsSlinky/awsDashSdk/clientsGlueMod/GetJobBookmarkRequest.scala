package typingsSlinky.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobBookmarkRequest extends js.Object {
  /**
    * The name of the job in question.
    */
  var JobName: typingsSlinky.awsDashSdk.clientsGlueMod.JobName = js.native
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typingsSlinky.awsDashSdk.clientsGlueMod.RunId] = js.native
}

object GetJobBookmarkRequest {
  @scala.inline
  def apply(JobName: JobName, RunId: RunId = null): GetJobBookmarkRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    if (RunId != null) __obj.updateDynamic("RunId")(RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobBookmarkRequest]
  }
}

