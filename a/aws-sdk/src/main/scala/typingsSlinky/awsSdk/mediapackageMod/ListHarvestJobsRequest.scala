package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHarvestJobsRequest extends js.Object {
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[string] = js.native
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[string] = js.native
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.MaxResults] = js.native
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListHarvestJobsRequest {
  @scala.inline
  def apply(): ListHarvestJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
  @scala.inline
  implicit class ListHarvestJobsRequestOps[Self <: ListHarvestJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeStatus(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

