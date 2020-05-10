package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsConfiguration extends js.Object {
  /**
    * A Boolean that specifies whether cloud metrics are collected.
    */
  var cloudMetricEnabled: js.UndefOr[Enabled] = js.native
  /**
    * The ARN of the role that is used to collect cloud metrics.
    */
  var metricRuleRoleArn: js.UndefOr[RoleArn] = js.native
}

object MetricsConfiguration {
  @scala.inline
  def apply(): MetricsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsConfiguration]
  }
  @scala.inline
  implicit class MetricsConfigurationOps[Self <: MetricsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudMetricEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudMetricEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudMetricEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudMetricEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricRuleRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRuleRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricRuleRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricRuleRoleArn")(js.undefined)
        ret
    }
  }
  
}

