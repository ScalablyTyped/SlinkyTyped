package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksMessage extends StObject {
  
  /**
    * The identifier of the snapshot export task to be described.
    */
  var ExportTaskIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Filters specify one or more snapshot exports to describe. The filters are specified as name-value pairs that define what to include in the output. Filter names and values are case-sensitive. Supported filters include the following:     export-task-identifier - An identifier for the snapshot export task.    s3-bucket - The Amazon S3 bucket the snapshot is exported to.    source-arn - The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3    status - The status of the export task. Must be lowercase, for example, complete.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeExportTasks request. If you specify this parameter, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified value, a pagination token called a marker is included in the response. You can use the marker in a later DescribeExportTasks request to retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typingsSlinky.awsSdk.rdsMod.MaxRecords] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
    */
  var SourceArn: js.UndefOr[String] = js.native
}
object DescribeExportTasksMessage {
  
  @scala.inline
  def apply(): DescribeExportTasksMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksMessage]
  }
  
  @scala.inline
  implicit class DescribeExportTasksMessageMutableBuilder[Self <: DescribeExportTasksMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskIdentifierUndefined: Self = StObject.set(x, "ExportTaskIdentifier", js.undefined)
    
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
    def setSourceArn(value: String): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
  }
}
