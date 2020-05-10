package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRecommendationOption extends js.Object {
  /**
    * The instance type of the instance recommendation.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The performance risk of the instance recommendation option. Performance risk is the likelihood of the recommended instance type not meeting the performance requirement of your workload. The lowest performance risk is categorized as 0, and the highest as 5.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.native
  /**
    * An array of objects that describe the projected utilization metrics of the instance recommendation option.
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.native
  /**
    * The rank of the instance recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.native
}

object InstanceRecommendationOption {
  @scala.inline
  def apply(): InstanceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendationOption]
  }
  @scala.inline
  implicit class InstanceRecommendationOptionOps[Self <: InstanceRecommendationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceRisk(value: PerformanceRisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectedUtilizationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectedUtilizationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectedUtilizationMetrics")(js.undefined)
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
  }
  
}

