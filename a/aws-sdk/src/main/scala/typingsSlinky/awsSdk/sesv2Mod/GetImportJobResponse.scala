package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportJobResponse extends StObject {
  
  /**
    * The time stamp of when the import job was completed.
    */
  var CompletedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The time stamp of when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The number of records that failed processing because of invalid input or other reasons.
    */
  var FailedRecordsCount: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.FailedRecordsCount] = js.native
  
  /**
    * The failure details about an import job.
    */
  var FailureInfo: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.FailureInfo] = js.native
  
  /**
    * The data source of the import job.
    */
  var ImportDataSource: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ImportDataSource] = js.native
  
  /**
    * The destination of the import job.
    */
  var ImportDestination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ImportDestination] = js.native
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.JobId] = js.native
  
  /**
    * The status of the import job.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.JobStatus] = js.native
  
  /**
    * The current number of records processed.
    */
  var ProcessedRecordsCount: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ProcessedRecordsCount] = js.native
}
object GetImportJobResponse {
  
  @scala.inline
  def apply(): GetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportJobResponse]
  }
  
  @scala.inline
  implicit class GetImportJobResponseMutableBuilder[Self <: GetImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedTimestamp(value: js.Date): Self = StObject.set(x, "CompletedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedTimestampUndefined: Self = StObject.set(x, "CompletedTimestamp", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setFailedRecordsCount(value: FailedRecordsCount): Self = StObject.set(x, "FailedRecordsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRecordsCountUndefined: Self = StObject.set(x, "FailedRecordsCount", js.undefined)
    
    @scala.inline
    def setFailureInfo(value: FailureInfo): Self = StObject.set(x, "FailureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureInfoUndefined: Self = StObject.set(x, "FailureInfo", js.undefined)
    
    @scala.inline
    def setImportDataSource(value: ImportDataSource): Self = StObject.set(x, "ImportDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDataSourceUndefined: Self = StObject.set(x, "ImportDataSource", js.undefined)
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDestinationUndefined: Self = StObject.set(x, "ImportDestination", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setProcessedRecordsCount(value: ProcessedRecordsCount): Self = StObject.set(x, "ProcessedRecordsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedRecordsCountUndefined: Self = StObject.set(x, "ProcessedRecordsCount", js.undefined)
  }
}
