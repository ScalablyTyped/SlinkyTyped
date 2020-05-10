package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentBuildVersionsResponse extends js.Object {
  /**
    *  The list of component summaries for the specified semantic version. 
    */
  var componentSummaryList: js.UndefOr[ComponentSummaryList] = js.native
  /**
    *  The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListComponentBuildVersionsResponse {
  @scala.inline
  def apply(): ListComponentBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentBuildVersionsResponse]
  }
  @scala.inline
  implicit class ListComponentBuildVersionsResponseOps[Self <: ListComponentBuildVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentSummaryList(value: ComponentSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSummaryList")(js.undefined)
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
    @scala.inline
    def withRequestId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(js.undefined)
        ret
    }
  }
  
}

