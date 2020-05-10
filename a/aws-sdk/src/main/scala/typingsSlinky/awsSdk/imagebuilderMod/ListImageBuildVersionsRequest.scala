package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImageBuildVersionsRequest extends js.Object {
  /**
    *  The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image whose build versions you want to retrieve. 
    */
  var imageVersionArn: ImageVersionArn = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListImageBuildVersionsRequest {
  @scala.inline
  def apply(imageVersionArn: ImageVersionArn): ListImageBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(imageVersionArn = imageVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageBuildVersionsRequest]
  }
  @scala.inline
  implicit class ListImageBuildVersionsRequestOps[Self <: ListImageBuildVersionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageVersionArn(value: ImageVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: RestrictedInteger): Self = {
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
    def withNextToken(value: NonEmptyString): Self = {
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

