package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotsMessage extends js.Object {
  /**
    * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific cluster are described.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 50 Constraints: minimum 20; maximum 50.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that specific replication group are described.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
  /**
    * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
    */
  var ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.native
  /**
    * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
    */
  var SnapshotName: js.UndefOr[String] = js.native
  /**
    * If set to system, the output shows snapshots that were automatically created by ElastiCache. If set to user the output shows snapshots that were manually created. If omitted, the output shows both automatically and manually created snapshots.
    */
  var SnapshotSource: js.UndefOr[String] = js.native
}

object DescribeSnapshotsMessage {
  @scala.inline
  def apply(): DescribeSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsMessage]
  }
  @scala.inline
  implicit class DescribeSnapshotsMessageOps[Self <: DescribeSnapshotsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterId")(js.undefined)
        ret
    }
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
    def withMaxRecords(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNodeGroupConfig(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNodeGroupConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNodeGroupConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNodeGroupConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotName")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotSource")(js.undefined)
        ret
    }
  }
  
}

