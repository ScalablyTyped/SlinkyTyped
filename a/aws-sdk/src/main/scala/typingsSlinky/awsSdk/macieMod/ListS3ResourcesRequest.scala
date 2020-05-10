package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListS3ResourcesRequest extends js.Object {
  /**
    * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The Amazon Macie member account ID whose associated S3 resources you want to list. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListS3ResourcesRequest {
  @scala.inline
  def apply(): ListS3ResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3ResourcesRequest]
  }
  @scala.inline
  implicit class ListS3ResourcesRequestOps[Self <: ListS3ResourcesRequest] (val x: Self) extends AnyVal {
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
    def withMemberAccountId(value: AWSAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberAccountId")(js.undefined)
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
  }
  
}

