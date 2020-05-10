package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEC2RecommendationProjectedMetricsResponse extends js.Object {
  /**
    * An array of objects that describe a projected metrics.
    */
  var recommendedOptionProjectedMetrics: js.UndefOr[RecommendedOptionProjectedMetrics] = js.native
}

object GetEC2RecommendationProjectedMetricsResponse {
  @scala.inline
  def apply(): GetEC2RecommendationProjectedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2RecommendationProjectedMetricsResponse]
  }
  @scala.inline
  implicit class GetEC2RecommendationProjectedMetricsResponseOps[Self <: GetEC2RecommendationProjectedMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecommendedOptionProjectedMetrics(value: RecommendedOptionProjectedMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedOptionProjectedMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedOptionProjectedMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedOptionProjectedMetrics")(js.undefined)
        ret
    }
  }
  
}

