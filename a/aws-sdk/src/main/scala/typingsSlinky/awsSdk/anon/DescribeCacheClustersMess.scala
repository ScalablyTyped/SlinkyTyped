package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elasticacheMod.BooleanOptional
import typingsSlinky.awsSdk.elasticacheMod.IntegerOptional
import typingsSlinky.awsSdk.elasticacheMod.String
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elasticache.DescribeCacheClustersMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeCacheClustersMess extends StObject {
  
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
  implicit class DescribeCacheClustersMessMutableBuilder[Self <: DescribeCacheClustersMess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setShowCacheClustersNotInReplicationGroups(value: BooleanOptional): Self = StObject.set(x, "ShowCacheClustersNotInReplicationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCacheClustersNotInReplicationGroupsUndefined: Self = StObject.set(x, "ShowCacheClustersNotInReplicationGroups", js.undefined)
    
    @scala.inline
    def setShowCacheNodeInfo(value: BooleanOptional): Self = StObject.set(x, "ShowCacheNodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCacheNodeInfoUndefined: Self = StObject.set(x, "ShowCacheNodeInfo", js.undefined)
  }
}
