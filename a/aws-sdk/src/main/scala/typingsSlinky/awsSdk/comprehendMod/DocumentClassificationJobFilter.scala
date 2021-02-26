package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentClassificationJobFilter extends StObject {
  
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobName] = js.native
  
  /**
    * Filters the list based on job status. Returns only jobs with the specified status.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobStatus] = js.native
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted after the specified time. Jobs are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.native
  
  /**
    * Filters the list of jobs based on the time that the job was submitted for processing. Returns only jobs submitted before the specified time. Jobs are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.native
}
object DocumentClassificationJobFilter {
  
  @scala.inline
  def apply(): DocumentClassificationJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassificationJobFilter]
  }
  
  @scala.inline
  implicit class DocumentClassificationJobFilterMutableBuilder[Self <: DocumentClassificationJobFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setSubmitTimeAfter(value: js.Date): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    @scala.inline
    def setSubmitTimeBefore(value: js.Date): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
