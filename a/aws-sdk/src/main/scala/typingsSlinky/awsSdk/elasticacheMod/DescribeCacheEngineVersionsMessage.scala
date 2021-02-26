package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCacheEngineVersionsMessage extends StObject {
  
  /**
    * The name of a specific cache parameter group family to return details for. Valid values are: memcached1.4 | memcached1.5 | memcached1.6 | redis2.6 | redis2.8 | redis3.2 | redis4.0 | redis5.0 | redis6.x |  Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var CacheParameterGroupFamily: js.UndefOr[String] = js.native
  
  /**
    * If true, specifies that only the default version of the specified engine or engine and major version combination is to be returned.
    */
  var DefaultOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The cache engine to return. Valid values: memcached | redis 
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The cache engine version to return. Example: 1.4.14 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeCacheEngineVersionsMessage {
  
  @scala.inline
  def apply(): DescribeCacheEngineVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheEngineVersionsMessage]
  }
  
  @scala.inline
  implicit class DescribeCacheEngineVersionsMessageMutableBuilder[Self <: DescribeCacheEngineVersionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupFamily(value: String): Self = StObject.set(x, "CacheParameterGroupFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheParameterGroupFamilyUndefined: Self = StObject.set(x, "CacheParameterGroupFamily", js.undefined)
    
    @scala.inline
    def setDefaultOnly(value: Boolean): Self = StObject.set(x, "DefaultOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOnlyUndefined: Self = StObject.set(x, "DefaultOnly", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
