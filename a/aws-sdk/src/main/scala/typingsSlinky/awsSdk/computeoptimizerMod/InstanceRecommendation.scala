package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceRecommendation extends js.Object {
  /**
    * The AWS account ID of the instance recommendation.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The instance type of the current instance.
    */
  var currentInstanceType: js.UndefOr[CurrentInstanceType] = js.native
  /**
    * The finding classification for the instance. Findings for instances include:     Underprovisioned —An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.     Overprovisioned —An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.     Optimized —An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. An optimized instance runs your workloads with optimal performance and infrastructure cost. For optimized resources, AWS Compute Optimizer might recommend a new generation instance type.    The values that are returned might be UNDER_PROVISIONED, OVER_PROVISIONED, or OPTIMIZED. 
    */
  var finding: js.UndefOr[Finding] = js.native
  /**
    * The Amazon Resource Name (ARN) of the current instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  /**
    * The name of the current instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  /**
    * The time stamp of when the instance recommendation was last refreshed.
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The number of days for which utilization metrics were analyzed for the instance.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.native
  /**
    * An array of objects that describe the recommendation options for the instance.
    */
  var recommendationOptions: js.UndefOr[RecommendationOptions] = js.native
  /**
    * An array of objects that describe the source resource of the recommendation.
    */
  var recommendationSources: js.UndefOr[RecommendationSources] = js.native
  /**
    * An array of objects that describe the utilization metrics of the instance.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.native
}

object InstanceRecommendation {
  @scala.inline
  def apply(): InstanceRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendation]
  }
  @scala.inline
  implicit class InstanceRecommendationOps[Self <: InstanceRecommendation] (val x: Self) extends AnyVal {
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
    def withCurrentInstanceType(value: CurrentInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentInstanceType")(js.undefined)
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
    def withInstanceArn(value: InstanceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: InstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
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
    def withRecommendationOptions(value: RecommendationOptions): Self = {
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
    def withRecommendationSources(value: RecommendationSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSources")(js.undefined)
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

