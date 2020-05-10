package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFlowTemplatesRequest extends js.Object {
  /**
    * An array of objects that limit the result set. The only valid filter is DEVICE_MODEL_ID.
    */
  var filters: js.UndefOr[FlowTemplateFilters] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object SearchFlowTemplatesRequest {
  @scala.inline
  def apply(): SearchFlowTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowTemplatesRequest]
  }
  @scala.inline
  implicit class SearchFlowTemplatesRequestOps[Self <: SearchFlowTemplatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: FlowTemplateFilters): Self = {
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
  }
  
}

