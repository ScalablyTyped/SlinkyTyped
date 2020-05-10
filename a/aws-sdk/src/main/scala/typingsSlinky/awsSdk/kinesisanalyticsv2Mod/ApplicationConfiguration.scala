package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfiguration extends js.Object {
  /**
    * The code location and type parameters for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfiguration = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfiguration] = js.native
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.EnvironmentProperties] = js.native
  /**
    * The creation and update parameters for a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfiguration] = js.native
  /**
    * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfiguration] = js.native
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurations: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurations] = js.native
}

object ApplicationConfiguration {
  @scala.inline
  def apply(ApplicationCodeConfiguration: ApplicationCodeConfiguration): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationCodeConfiguration = ApplicationCodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfiguration]
  }
  @scala.inline
  implicit class ApplicationConfigurationOps[Self <: ApplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCodeConfiguration(value: ApplicationCodeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationSnapshotConfiguration(value: ApplicationSnapshotConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSnapshotConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentProperties(value: EnvironmentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withFlinkApplicationConfiguration(value: FlinkApplicationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlinkApplicationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlApplicationConfiguration(value: SqlApplicationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlApplicationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfigurations(value: VpcConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurations")(js.undefined)
        ret
    }
  }
  
}

