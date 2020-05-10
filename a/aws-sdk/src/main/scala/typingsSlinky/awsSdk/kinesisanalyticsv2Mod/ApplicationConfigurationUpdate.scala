package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
    */
  var ApplicationCodeConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationUpdate] = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationUpdate: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationUpdate
  ] = js.native
  /**
    * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyUpdates] = js.native
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
    */
  var FlinkApplicationConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationUpdate] = js.native
  /**
    * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
    */
  var SqlApplicationConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationUpdate] = js.native
  /**
    * Updates to the array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationUpdates] = js.native
}

object ApplicationConfigurationUpdate {
  @scala.inline
  def apply(): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
  @scala.inline
  implicit class ApplicationConfigurationUpdateOps[Self <: ApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCodeConfigurationUpdate(value: ApplicationCodeConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCodeConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationSnapshotConfigurationUpdate(value: ApplicationSnapshotConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSnapshotConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentPropertyUpdates(value: EnvironmentPropertyUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentPropertyUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentPropertyUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentPropertyUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withFlinkApplicationConfigurationUpdate(value: FlinkApplicationConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlinkApplicationConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlApplicationConfigurationUpdate(value: SqlApplicationConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlApplicationConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfigurationUpdates(value: VpcConfigurationUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfigurationUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationUpdates")(js.undefined)
        ret
    }
  }
  
}

