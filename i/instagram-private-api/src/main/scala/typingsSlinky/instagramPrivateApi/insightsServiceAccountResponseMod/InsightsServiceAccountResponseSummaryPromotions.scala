package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseSummaryPromotions extends js.Object {
  var edges: js.Array[_] = js.native
}

object InsightsServiceAccountResponseSummaryPromotions {
  @scala.inline
  def apply(edges: js.Array[_]): InsightsServiceAccountResponseSummaryPromotions = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseSummaryPromotions]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseSummaryPromotionsOps[Self <: InsightsServiceAccountResponseSummaryPromotions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

