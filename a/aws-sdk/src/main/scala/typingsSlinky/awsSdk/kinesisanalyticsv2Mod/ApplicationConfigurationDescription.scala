package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfigurationDescription extends js.Object {
  /**
    * The details about the application code for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationCodeConfigurationDescription
  ] = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSnapshotConfigurationDescription
  ] = js.native
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.EnvironmentPropertyDescriptions] = js.native
  /**
    * The details about a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.FlinkApplicationConfigurationDescription
  ] = js.native
  /**
    * The details about the starting properties for a Kinesis Data Analytics application.
    */
  var RunConfigurationDescription: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RunConfigurationDescription] = js.native
  /**
    * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfigurationDescription: js.UndefOr[
    typingsSlinky.awsSdk.kinesisanalyticsv2Mod.SqlApplicationConfigurationDescription
  ] = js.native
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurationDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescriptions] = js.native
}

object ApplicationConfigurationDescription {
  @scala.inline
  def apply(): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
  @scala.inline
  implicit class ApplicationConfigurationDescriptionOps[Self <: ApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationCodeConfigurationDescription(value: ApplicationCodeConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationCodeConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationCodeConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationSnapshotConfigurationDescription(value: ApplicationSnapshotConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSnapshotConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSnapshotConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentPropertyDescriptions(value: EnvironmentPropertyDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentPropertyDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentPropertyDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentPropertyDescriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFlinkApplicationConfigurationDescription(value: FlinkApplicationConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlinkApplicationConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlinkApplicationConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRunConfigurationDescription(value: RunConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSqlApplicationConfigurationDescription(value: SqlApplicationConfigurationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfigurationDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlApplicationConfigurationDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlApplicationConfigurationDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfigurationDescriptions(value: VpcConfigurationDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfigurationDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfigurationDescriptions")(js.undefined)
        ret
    }
  }
  
}

