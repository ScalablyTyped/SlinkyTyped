package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBParameterGroupsMessage extends StObject {
  
  /**
    * The name of a specific DB parameter group to return details for. Constraints:   If supplied, must match the name of an existing DBClusterParameterGroup.  
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeDBParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeDBParameterGroupsMessage {
  
  @scala.inline
  def apply(): DescribeDBParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBParameterGroupsMessage]
  }
  
  @scala.inline
  implicit class DescribeDBParameterGroupsMessageMutableBuilder[Self <: DescribeDBParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
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
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
