package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationTaskMessage extends js.Object {
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
  var MigrationType: MigrationTypeValue = js.native
  /**
    * The Amazon Resource Name (ARN) of a replication instance.
    */
  var ReplicationInstanceArn: String = js.native
  /**
    * An identifier for the replication task. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: String = js.native
  /**
    * Overall settings for the task, in JSON format. For more information, see Task Settings in the AWS Database Migration User Guide. 
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the source endpoint.
    */
  var SourceEndpointArn: String = js.native
  /**
    * The table mappings for the task, in JSON format. For more information, see Table Mapping in the AWS Database Migration User Guide. 
    */
  var TableMappings: String = js.native
  /**
    * One or more tags to be assigned to the replication task.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies the target endpoint.
    */
  var TargetEndpointArn: String = js.native
}

object CreateReplicationTaskMessage {
  @scala.inline
  def apply(
    MigrationType: MigrationTypeValue,
    ReplicationInstanceArn: String,
    ReplicationTaskIdentifier: String,
    SourceEndpointArn: String,
    TableMappings: String,
    TargetEndpointArn: String
  ): CreateReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(MigrationType = MigrationType.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any], ReplicationTaskIdentifier = ReplicationTaskIdentifier.asInstanceOf[js.Any], SourceEndpointArn = SourceEndpointArn.asInstanceOf[js.Any], TableMappings = TableMappings.asInstanceOf[js.Any], TargetEndpointArn = TargetEndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationTaskMessage]
  }
  @scala.inline
  implicit class CreateReplicationTaskMessageOps[Self <: CreateReplicationTaskMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationType(value: MigrationTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationTaskIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableMappings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEndpointArn")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

