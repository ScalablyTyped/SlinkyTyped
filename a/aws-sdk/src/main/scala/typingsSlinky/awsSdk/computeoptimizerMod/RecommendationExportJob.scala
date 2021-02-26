package typingsSlinky.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationExportJob extends StObject {
  
  /**
    * The timestamp of when the export job was created.
    */
  var creationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * An object that describes the destination of the export file.
    */
  var destination: js.UndefOr[ExportDestination] = js.native
  
  /**
    * The reason for an export job failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The identification number of the export job.
    */
  var jobId: js.UndefOr[JobId] = js.native
  
  /**
    * The timestamp of when the export job was last updated.
    */
  var lastUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The resource type of the exported recommendations.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The status of the export job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}
object RecommendationExportJob {
  
  @scala.inline
  def apply(): RecommendationExportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationExportJob]
  }
  
  @scala.inline
  implicit class RecommendationExportJobMutableBuilder[Self <: RecommendationExportJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDestination(value: ExportDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
