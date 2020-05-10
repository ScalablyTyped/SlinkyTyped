package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfigurationDescription extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application.
    */
  var ConfigurationType: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LogLevel] = js.native
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MetricsLevel] = js.native
}

object MonitoringConfigurationDescription {
  @scala.inline
  def apply(): MonitoringConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationDescription]
  }
  @scala.inline
  implicit class MonitoringConfigurationDescriptionOps[Self <: MonitoringConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationType(value: ConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsLevel(value: MetricsLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsLevel")(js.undefined)
        ret
    }
  }
  
}

