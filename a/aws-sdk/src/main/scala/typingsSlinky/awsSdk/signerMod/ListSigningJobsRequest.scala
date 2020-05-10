package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSigningJobsRequest extends js.Object {
  /**
    * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If additional items exist beyond the number you specify, the nextToken element is set in the response. Use the nextToken value in a subsequent request to retrieve additional items. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * String for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The ID of microcontroller platform that you specified for the distribution of your code image.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.native
  /**
    * A status value with which to filter your results.
    */
  var status: js.UndefOr[SigningStatus] = js.native
}

object ListSigningJobsRequest {
  @scala.inline
  def apply(): ListSigningJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningJobsRequest]
  }
  @scala.inline
  implicit class ListSigningJobsRequestOps[Self <: ListSigningJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformId(value: PlatformId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedBy(value: RequestedBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SigningStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

