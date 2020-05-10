package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfiguration extends js.Object {
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationType: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ConfigurationType = js.native
  /**
    * Describes the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.LogLevel] = js.native
  /**
    * Describes the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevel: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.MetricsLevel] = js.native
}

object MonitoringConfiguration {
  @scala.inline
  def apply(ConfigurationType: ConfigurationType): MonitoringConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringConfiguration]
  }
  @scala.inline
  implicit class MonitoringConfigurationOps[Self <: MonitoringConfiguration] (val x: Self) extends AnyVal {
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

