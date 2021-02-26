package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBProxyTargetGroupsRequest extends StObject {
  
  /**
    * The identifier of the DBProxy associated with the target group.
    */
  var DBProxyName: String = js.native
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.rdsMod.MaxRecords] = js.native
  
  /**
    * The identifier of the DBProxyTargetGroup to describe.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
}
object DescribeDBProxyTargetGroupsRequest {
  
  @scala.inline
  def apply(DBProxyName: String): DescribeDBProxyTargetGroupsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxyTargetGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeDBProxyTargetGroupsRequestMutableBuilder[Self <: DescribeDBProxyTargetGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
  }
}
