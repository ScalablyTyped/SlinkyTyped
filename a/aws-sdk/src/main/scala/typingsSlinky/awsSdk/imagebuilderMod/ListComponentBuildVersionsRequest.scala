package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentBuildVersionsRequest extends js.Object {
  /**
    *  The component version Amazon Resource Name (ARN) whose versions you want to list. 
    */
  var componentVersionArn: ComponentVersionArn = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListComponentBuildVersionsRequest {
  @scala.inline
  def apply(componentVersionArn: ComponentVersionArn): ListComponentBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(componentVersionArn = componentVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentBuildVersionsRequest]
  }
  @scala.inline
  implicit class ListComponentBuildVersionsRequestOps[Self <: ListComponentBuildVersionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentVersionArn(value: ComponentVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentVersionArn")(value.asInstanceOf[js.Any])
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

