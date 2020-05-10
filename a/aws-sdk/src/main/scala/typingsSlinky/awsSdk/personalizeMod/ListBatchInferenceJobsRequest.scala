package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBatchInferenceJobsRequest extends js.Object {
  /**
    * The maximum number of batch inference job results to return in each page. The default value is 100.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution version from which the batch inference jobs were created.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
}

object ListBatchInferenceJobsRequest {
  @scala.inline
  def apply(): ListBatchInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsRequest]
  }
  @scala.inline
  implicit class ListBatchInferenceJobsRequestOps[Self <: ListBatchInferenceJobsRequest] (val x: Self) extends AnyVal {
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
    def withSolutionVersionArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionVersionArn")(js.undefined)
        ret
    }
  }
  
}

