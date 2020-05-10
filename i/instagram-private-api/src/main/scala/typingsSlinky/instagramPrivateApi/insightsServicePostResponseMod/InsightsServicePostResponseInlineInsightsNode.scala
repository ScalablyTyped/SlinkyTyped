package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseInlineInsightsNode extends js.Object {
  var error: Null = js.native
  var metrics: InsightsServicePostResponseMetrics = js.native
  var state: String = js.native
}

object InsightsServicePostResponseInlineInsightsNode {
  @scala.inline
  def apply(error: Null, metrics: InsightsServicePostResponseMetrics, state: String): InsightsServicePostResponseInlineInsightsNode = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseInlineInsightsNode]
  }
  @scala.inline
  implicit class InsightsServicePostResponseInlineInsightsNodeOps[Self <: InsightsServicePostResponseInlineInsightsNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: InsightsServicePostResponseMetrics): Self = {
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

