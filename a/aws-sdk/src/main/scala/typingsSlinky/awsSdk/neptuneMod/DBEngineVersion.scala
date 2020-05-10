package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBEngineVersion extends js.Object {
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.native
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.native
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action.
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.native
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.native
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.native
}

object DBEngineVersion {
  @scala.inline
  def apply(): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersion]
  }
  @scala.inline
  implicit class DBEngineVersionOps[Self <: DBEngineVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBEngineDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBEngineDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBEngineDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBEngineDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDBEngineVersionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBEngineVersionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBEngineVersionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBEngineVersionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDBParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCharacterSet(value: CharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCharacterSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCharacterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExportableLogTypes(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportableLogTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportableLogTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportableLogTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCharacterSets(value: SupportedCharacterSetsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCharacterSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCharacterSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedCharacterSets")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedTimezones(value: SupportedTimezonesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedTimezones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedTimezones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedTimezones")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsLogExportsToCloudwatchLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsLogExportsToCloudwatchLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsLogExportsToCloudwatchLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsReadReplica(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsReadReplica")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsReadReplica: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsReadReplica")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUpgradeTarget(value: ValidUpgradeTargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUpgradeTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUpgradeTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUpgradeTarget")(js.undefined)
        ret
    }
  }
  
}

