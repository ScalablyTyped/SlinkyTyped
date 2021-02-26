package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReplicationTaskAssessmentRunsMessage extends StObject {
  
  /**
    * Filters applied to the premigration assessment runs described in the form of key-value pairs. Valid filter names: replication-task-assessment-run-arn, replication-task-arn, replication-instance-arn, status 
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeReplicationTaskAssessmentRunsMessage {
  
  @scala.inline
  def apply(): DescribeReplicationTaskAssessmentRunsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentRunsMessage]
  }
  
  @scala.inline
  implicit class DescribeReplicationTaskAssessmentRunsMessageMutableBuilder[Self <: DescribeReplicationTaskAssessmentRunsMessage] (val x: Self) extends AnyVal {
    
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
