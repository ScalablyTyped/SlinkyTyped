package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether to use the default CloudWatch logging configuration for an application. You must set this property to CUSTOM in order to set the LogLevel or MetricsLevel parameters.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  /**
    * Describes updates to the verbosity of the CloudWatch Logs for an application.
    */
  var LogLevelUpdate: js.UndefOr[LogLevel] = js.native
  /**
    * Describes updates to the granularity of the CloudWatch Logs for an application.
    */
  var MetricsLevelUpdate: js.UndefOr[MetricsLevel] = js.native
}

object MonitoringConfigurationUpdate {
  @scala.inline
  def apply(): MonitoringConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringConfigurationUpdate]
  }
  @scala.inline
  implicit class MonitoringConfigurationUpdateOps[Self <: MonitoringConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationTypeUpdate(value: ConfigurationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTypeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationTypeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationTypeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevelUpdate(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevelUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevelUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogLevelUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsLevelUpdate(value: MetricsLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsLevelUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsLevelUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsLevelUpdate")(js.undefined)
        ret
    }
  }
  
}

