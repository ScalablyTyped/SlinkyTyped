package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUpdateActionsMessage extends js.Object {
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached 
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.native
  /**
    * The range of time specified to search for service updates that are in available status
    */
  var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.native
  /**
    * Dictates whether to include node level update status in the response 
    */
  var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.native
  /**
    * The status of the update action.
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.native
}

object DescribeUpdateActionsMessage {
  @scala.inline
  def apply(): DescribeUpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateActionsMessage]
  }
  @scala.inline
  implicit class DescribeUpdateActionsMessageOps[Self <: DescribeUpdateActionsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheClusterIds(value: CacheClusterIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheClusterIds")(js.undefined)
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
    def withReplicationGroupIds(value: ReplicationGroupIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateStatus(value: ServiceUpdateStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateTimeRange(value: TimeRangeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateTimeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNodeLevelUpdateStatus(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNodeLevelUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNodeLevelUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowNodeLevelUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateActionStatus(value: UpdateActionStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateActionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateActionStatus")(js.undefined)
        ret
    }
  }
  
}

