package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeJobInput extends js.Object {
  /**
    * The unique system-generated ID of the job for which you want to confirm receipt.
    */
  var jobId: JobId = js.native
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response of the PollForJobs request that returned this job.
    */
  var nonce: Nonce = js.native
}

object AcknowledgeJobInput {
  @scala.inline
  def apply(jobId: JobId, nonce: Nonce): AcknowledgeJobInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeJobInput]
  }
  @scala.inline
  implicit class AcknowledgeJobInputOps[Self <: AcknowledgeJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: Nonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

