package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunConfiguration extends js.Object {
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationRestoreConfiguration] = js.native
  /**
    * Describes the starting parameters for an Apache Flink-based Kinesis Data Analytics application.
    */
  var FlinkRunConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FlinkRunConfiguration] = js.native
  /**
    * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlRunConfigurations: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlRunConfigurations] = js.native
}

object RunConfiguration {
  @scala.inline
  def apply(): RunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunConfiguration]
  }
  @scala.inline
  implicit class RunConfigurationOps[Self <: RunConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationRestoreConfiguration(value: ApplicationRestoreConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationRestoreConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationRestoreConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationRestoreConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withFlinkRunConfiguration(value: FlinkRunConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkRunConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlinkRunConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkRunConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlRunConfigurations(value: SqlRunConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlRunConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlRunConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlRunConfigurations")(js.undefined)
        ret
    }
  }
  
}

