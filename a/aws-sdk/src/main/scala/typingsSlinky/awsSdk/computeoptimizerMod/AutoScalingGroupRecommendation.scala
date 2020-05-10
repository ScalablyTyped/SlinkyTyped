package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupRecommendation extends js.Object {
  /**
    * The AWS account ID of the Auto Scaling group.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var autoScalingGroupArn: js.UndefOr[AutoScalingGroupArn] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var autoScalingGroupName: js.UndefOr[AutoScalingGroupName] = js.native
  /**
    * An array of objects that describe the current configuration of the Auto Scaling group.
    */
  var currentConfiguration: js.UndefOr[AutoScalingGroupConfiguration] = js.native
  /**
    * The finding classification for the Auto Scaling group. Findings for Auto Scaling groups include:     NotOptimized —An Auto Scaling group is considered not optimized when AWS Compute Optimizer identifies a recommendation that can provide better performance for your workload.     Optimized —An Auto Scaling group is considered optimized when Compute Optimizer determines that the group is correctly provisioned to run your workload based on the chosen instance type. For optimized resources, Compute Optimizer might recommend a new generation instance type.    The values that are returned might be NOT_OPTIMIZED or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  /**
    * The time stamp of when the Auto Scaling group recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The number of days for which utilization metrics were analyzed for the Auto Scaling group.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  /**
    * An array of objects that describe the recommendation options for the Auto Scaling group.
    */
  var recommendationOptions: js.UndefOr[AutoScalingGroupRecommendationOptions] = js.native
  /**
    * An array of objects that describe the utilization metrics of the Auto Scaling group.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}

object AutoScalingGroupRecommendation {
  @scala.inline
  def apply(): AutoScalingGroupRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupRecommendation]
  }
  @scala.inline
  implicit class AutoScalingGroupRecommendationOps[Self <: AutoScalingGroupRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroupArn(value: AutoScalingGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroupName(value: AutoScalingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentConfiguration(value: AutoScalingGroupConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withFinding(value: Finding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRefreshTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRefreshTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLookBackPeriodInDays(value: LookBackPeriodInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookBackPeriodInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookBackPeriodInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookBackPeriodInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationOptions(value: AutoScalingGroupRecommendationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilizationMetrics(value: UtilizationMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilizationMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilizationMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utilizationMetrics")(js.undefined)
        ret
    }
  }
  
}

