package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCacheParametersMessage extends StObject {
  
  /**
    * The name of a specific cache parameter group to return details for.
    */
  var CacheParameterGroupName: String = js.native
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The parameter types to return. Valid values: user | system | engine-default 
    */
  var Source: js.UndefOr[String] = js.native
}
object DescribeCacheParametersMessage {
  
  @scala.inline
  def apply(CacheParameterGroupName: String): DescribeCacheParametersMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheParametersMessage]
  }
  
  @scala.inline
  implicit class DescribeCacheParametersMessageMutableBuilder[Self <: DescribeCacheParametersMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheParameterGroupName(value: String): Self = StObject.set(x, "CacheParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
