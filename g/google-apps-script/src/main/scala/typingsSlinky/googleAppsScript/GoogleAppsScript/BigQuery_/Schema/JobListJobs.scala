package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobListJobs extends StObject {
  
  var configuration: js.UndefOr[JobConfiguration] = js.native
  
  var errorResult: js.UndefOr[ErrorProto] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var jobReference: js.UndefOr[JobReference] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var statistics: js.UndefOr[JobStatistics] = js.native
  
  var status: js.UndefOr[JobStatus] = js.native
  
  var user_email: js.UndefOr[String] = js.native
}
object JobListJobs {
  
  @scala.inline
  def apply(): JobListJobs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListJobs]
  }
  
  @scala.inline
  implicit class JobListJobsMutableBuilder[Self <: JobListJobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: JobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatistics(value: JobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
  }
}
