package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBLogFilesMessage extends StObject {
  
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  
  /**
    * Filters the available log files for files written since the specified date, in POSIX timestamp format with milliseconds.
    */
  var FileLastWritten: js.UndefOr[Long] = js.native
  
  /**
    * Filters the available log files for files larger than the specified size.
    */
  var FileSize: js.UndefOr[Long] = js.native
  
  /**
    * Filters the available log files for log file names that contain the specified string.
    */
  var FilenameContains: js.UndefOr[String] = js.native
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
}
object DescribeDBLogFilesMessage {
  
  @scala.inline
  def apply(DBInstanceIdentifier: String): DescribeDBLogFilesMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesMessage]
  }
  
  @scala.inline
  implicit class DescribeDBLogFilesMessageMutableBuilder[Self <: DescribeDBLogFilesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLastWritten(value: Long): Self = StObject.set(x, "FileLastWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLastWrittenUndefined: Self = StObject.set(x, "FileLastWritten", js.undefined)
    
    @scala.inline
    def setFileSize(value: Long): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "FileSize", js.undefined)
    
    @scala.inline
    def setFilenameContains(value: String): Self = StObject.set(x, "FilenameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameContainsUndefined: Self = StObject.set(x, "FilenameContains", js.undefined)
    
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
