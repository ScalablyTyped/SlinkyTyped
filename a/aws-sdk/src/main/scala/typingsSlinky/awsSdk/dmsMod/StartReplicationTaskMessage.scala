package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReplicationTaskMessage extends js.Object {
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
    * The Amazon Resource Name (ARN) of the replication task to be started.
    */
  var ReplicationTaskArn: String = js.native
  /**
    * The type of replication task.
    */
  var StartReplicationTaskType: StartReplicationTaskTypeValue = js.native
}

object StartReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String, StartReplicationTaskType: StartReplicationTaskTypeValue): StartReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any], StartReplicationTaskType = StartReplicationTaskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskMessage]
  }
  @scala.inline
  implicit class StartReplicationTaskMessageOps[Self <: StartReplicationTaskMessage] (val x: Self) extends AnyVal {
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
    def withStartReplicationTaskType(value: StartReplicationTaskTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartReplicationTaskType")(value.asInstanceOf[js.Any])
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
  }
  
}

