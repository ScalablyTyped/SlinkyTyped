package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationTaskMessage extends js.Object {
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”  When you use this task setting with a source PostgreSQL database, a logical replication slot should already be created and associated with the source endpoint. You can verify this by setting the slotName extra connection attribute to the name of this logical replication slot. For more information, see Extra Connection Attributes When Using PostgreSQL as a Source for AWS DMS. 
    */
  var CdcStartPosition: js.UndefOr[String] = js.native
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.native
  /**
    * The migration type. Valid values: full-load | cdc | full-load-and-cdc 
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: String = js.native
  /**
    * The replication task identifier. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * JSON file that contains settings for the task, such as target metadata settings.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  /**
    * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with file://. When working with the DMS API, provide the JSON as the parameter value, for example: --table-mappings file://mappingfile.json 
    */
  var TableMappings: js.UndefOr[String] = js.native
}

object ModifyReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): ModifyReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationTaskMessage]
  }
  @scala.inline
  implicit class ModifyReplicationTaskMessageOps[Self <: ModifyReplicationTaskMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCdcStartPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStartPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdcStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStartPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCdcStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdcStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCdcStopPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStopPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdcStopPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CdcStopPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrationType(value: MigrationTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationType")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTableMappings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMappings")(js.undefined)
        ret
    }
  }
  
}

