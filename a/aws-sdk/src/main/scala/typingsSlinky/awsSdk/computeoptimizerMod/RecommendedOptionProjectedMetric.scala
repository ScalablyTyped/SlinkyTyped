package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendedOptionProjectedMetric extends js.Object {
  /**
    * An array of objects that describe a projected utilization metric.
    */
  var projectedMetrics: js.UndefOr[ProjectedMetrics] = js.native
  /**
    * The rank of the recommendation option projected metric. The top recommendation option is ranked as 1. The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as 1 is related to the recommendation option that is also ranked as 1 in the same response.
    */
  var rank: js.UndefOr[Rank] = js.native
  /**
    * The recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.native
}

object RecommendedOptionProjectedMetric {
  @scala.inline
  def apply(): RecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedOptionProjectedMetric]
  }
  @scala.inline
  implicit class RecommendedOptionProjectedMetricOps[Self <: RecommendedOptionProjectedMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectedMetrics(value: ProjectedMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectedMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectedMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectedMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Rank): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendedInstanceType(value: RecommendedInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedInstanceType")(js.undefined)
        ret
    }
  }
  
}

