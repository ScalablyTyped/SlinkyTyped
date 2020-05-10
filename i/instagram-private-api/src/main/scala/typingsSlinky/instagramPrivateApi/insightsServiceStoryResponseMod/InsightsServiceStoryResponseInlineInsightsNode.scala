package typingsSlinky.instagramPrivateApi.insightsServiceStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceStoryResponseInlineInsightsNode extends js.Object {
  var metrics: Null = js.native
  var state: String = js.native
}

object InsightsServiceStoryResponseInlineInsightsNode {
  @scala.inline
  def apply(metrics: Null, state: String): InsightsServiceStoryResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceStoryResponseInlineInsightsNode]
  }
  @scala.inline
  implicit class InsightsServiceStoryResponseInlineInsightsNodeOps[Self <: InsightsServiceStoryResponseInlineInsightsNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetrics(value: Null): Self = {
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

