package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elasticacheMod.BooleanOptional
import typingsSlinky.awsSdk.elasticacheMod.IntegerOptional
import typingsSlinky.awsSdk.elasticacheMod.String
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elasticache.DescribeCacheClustersMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCacheClustersMess extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cluster is returned. This parameter isn't case sensitive.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to show only nodes (API/CLI: clusters) that are not members of a replication group. In practice, this mean Memcached and single node Redis clusters.
    */
  var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.native
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the individual cache nodes.
    */
  var ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.native
}

object DescribeCacheClustersMess {
  @scala.inline
  def apply(): DescribeCacheClustersMess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheClustersMess]
  }
  @scala.inline
  implicit class DescribeCacheClustersMessOps[Self <: DescribeCacheClustersMess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
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
    def withShowCacheClustersNotInReplicationGroups(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCacheClustersNotInReplicationGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCacheClustersNotInReplicationGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCacheClustersNotInReplicationGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCacheNodeInfo(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCacheNodeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCacheNodeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowCacheNodeInfo")(js.undefined)
        ret
    }
  }
  
}

