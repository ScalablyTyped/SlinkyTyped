package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTask extends js.Object {
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want the CDC operation to start. Specifying both values results in an error. The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.native
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.native
  /**
    * The last error (failure) message generated for the replication instance.
    */
  var LastFailureMessage: js.UndefOr[String] = js.native
  /**
    * The type of migration.
    */
  var MigrationType: js.UndefOr[MigrationTypeValue] = js.native
  /**
    * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this value to the CdcStartPosition parameter to start a CDC operation that begins at that checkpoint.
    */
  var RecoveryCheckpoint: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    * The date the replication task was created.
    */
  var ReplicationTaskCreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The user-assigned replication task identifier or name. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: js.UndefOr[String] = js.native
  /**
    * The settings for the replication task.
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.native
  /**
    * The date the replication task is scheduled to start.
    */
  var ReplicationTaskStartDate: js.UndefOr[js.Date] = js.native
  /**
    * The statistics for the task, including elapsed time, tables loaded, and table errors.
    */
  var ReplicationTaskStats: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationTaskStats] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var SourceEndpointArn: js.UndefOr[String] = js.native
  /**
    * The status of the replication task.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The reason the replication task was stopped.
    */
  var StopReason: js.UndefOr[String] = js.native
  /**
    * Table mappings specified in the task.
    */
  var TableMappings: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var TargetEndpointArn: js.UndefOr[String] = js.native
}

object ReplicationTask {
  @scala.inline
  def apply(): ReplicationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTask]
  }
  @scala.inline
  implicit class ReplicationTaskOps[Self <: ReplicationTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLastFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailureMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailureMessage")(js.undefined)
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
    def withRecoveryCheckpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryCheckpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecoveryCheckpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecoveryCheckpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskCreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskCreationDate")(js.undefined)
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
    def withReplicationTaskStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskStats(value: ReplicationTaskStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskStats")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStopReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StopReason")(js.undefined)
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
    @scala.inline
    def withTargetEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEndpointArn")(js.undefined)
        ret
    }
  }
  
}

