package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseInlineInsightsNode extends js.Object {
  var metrics: PostsInsightsFeedResponseMetrics = js.native
  var state: String = js.native
}

object PostsInsightsFeedResponseInlineInsightsNode {
  @scala.inline
  def apply(metrics: PostsInsightsFeedResponseMetrics, state: String): PostsInsightsFeedResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseInlineInsightsNode]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseInlineInsightsNodeOps[Self <: PostsInsightsFeedResponseInlineInsightsNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetrics(value: PostsInsightsFeedResponseMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

