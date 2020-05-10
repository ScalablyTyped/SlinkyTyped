package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutThirdPartyJobFailureResultInput extends js.Object {
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  /**
    * Represents information about failure details.
    */
  var failureDetails: FailureDetails = js.native
  /**
    * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
    */
  var jobId: ThirdPartyJobId = js.native
}

object PutThirdPartyJobFailureResultInput {
  @scala.inline
  def apply(clientToken: ClientToken, failureDetails: FailureDetails, jobId: ThirdPartyJobId): PutThirdPartyJobFailureResultInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
  }
  @scala.inline
  implicit class PutThirdPartyJobFailureResultInputOps[Self <: PutThirdPartyJobFailureResultInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureDetails(value: FailureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobId(value: ThirdPartyJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

