package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponsePromotionsUnit extends js.Object {
  var summary_promotions: InsightsServiceAccountResponseSummaryPromotions = js.native
}

object InsightsServiceAccountResponsePromotionsUnit {
  @scala.inline
  def apply(summary_promotions: InsightsServiceAccountResponseSummaryPromotions): InsightsServiceAccountResponsePromotionsUnit = {
    val __obj = js.Dynamic.literal(summary_promotions = summary_promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponsePromotionsUnit]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponsePromotionsUnitOps[Self <: InsightsServiceAccountResponsePromotionsUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummary_promotions(value: InsightsServiceAccountResponseSummaryPromotions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary_promotions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

