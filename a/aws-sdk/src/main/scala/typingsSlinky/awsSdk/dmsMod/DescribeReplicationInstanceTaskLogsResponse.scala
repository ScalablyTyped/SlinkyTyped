package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.native
  /**
    * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and task log size (in bytes). 
    */
  var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.native
}

object DescribeReplicationInstanceTaskLogsResponse {
  @scala.inline
  def apply(): DescribeReplicationInstanceTaskLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
  }
  @scala.inline
  implicit class DescribeReplicationInstanceTaskLogsResponseOps[Self <: DescribeReplicationInstanceTaskLogsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
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
    def withReplicationInstanceTaskLogs(value: ReplicationInstanceTaskLogsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceTaskLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceTaskLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceTaskLogs")(js.undefined)
        ret
    }
  }
  
}

