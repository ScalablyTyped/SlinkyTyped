package typingsSlinky.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfiguration extends js.Object {
  /**
    * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
    */
  var bytesScannedCutoffPerQuery: js.UndefOr[Double] = js.native
  /**
    * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
    */
  var enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.native
  /**
    * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
    */
  var publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Configuration block with result settings. Documented below.
    */
  var resultConfiguration: js.UndefOr[WorkgroupConfigurationResultConfiguration] = js.native
}

object WorkgroupConfiguration {
  @scala.inline
  def apply(): WorkgroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupConfiguration]
  }
  @scala.inline
  implicit class WorkgroupConfigurationOps[Self <: WorkgroupConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesScannedCutoffPerQuery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesScannedCutoffPerQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesScannedCutoffPerQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesScannedCutoffPerQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceWorkgroupConfiguration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceWorkgroupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceWorkgroupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceWorkgroupConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishCloudwatchMetricsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishCloudwatchMetricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishCloudwatchMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishCloudwatchMetricsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResultConfiguration(value: WorkgroupConfigurationResultConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultConfiguration")(js.undefined)
        ret
    }
  }
  
}

