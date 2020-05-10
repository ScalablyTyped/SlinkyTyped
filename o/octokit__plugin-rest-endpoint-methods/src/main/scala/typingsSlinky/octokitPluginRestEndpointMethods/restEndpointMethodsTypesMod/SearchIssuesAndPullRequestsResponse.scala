package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIssuesAndPullRequestsResponse extends js.Object {
  var incomplete_results: Boolean = js.native
  var items: js.Array[SearchIssuesAndPullRequestsResponseItemsItem] = js.native
  var total_count: Double = js.native
}

object SearchIssuesAndPullRequestsResponse {
  @scala.inline
  def apply(
    incomplete_results: Boolean,
    items: js.Array[SearchIssuesAndPullRequestsResponseItemsItem],
    total_count: Double
  ): SearchIssuesAndPullRequestsResponse = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponse]
  }
  @scala.inline
  implicit class SearchIssuesAndPullRequestsResponseOps[Self <: SearchIssuesAndPullRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomplete_results(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete_results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SearchIssuesAndPullRequestsResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

