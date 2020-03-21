package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResponse extends js.Object {
  /**
    * A section of the response body that provides information about the job that is created.
    */
  var Job: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Job] = js.native
}

object CreateJobResponse {
  @scala.inline
  def apply(Job: Job = null): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobResponse]
  }
}

