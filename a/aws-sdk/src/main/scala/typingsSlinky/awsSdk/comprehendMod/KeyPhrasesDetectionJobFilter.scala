package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPhrasesDetectionJobFilter extends js.Object {
  
  /**
    * Filters on the name of the job.
    */
  var JobName: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.JobName] = js.native
  
  /**
    * Filters the list of jobs based on job status. Returns only jobs with the specified status.
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
object KeyPhrasesDetectionJobFilter {
  
  @scala.inline
  def apply(): KeyPhrasesDetectionJobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPhrasesDetectionJobFilter]
  }
  
  @scala.inline
  implicit class KeyPhrasesDetectionJobFilterOps[Self <: KeyPhrasesDetectionJobFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
    
    @scala.inline
    def setSubmitTimeAfter(value: js.Date): Self = this.set("SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTimeAfter: Self = this.set("SubmitTimeAfter", js.undefined)
    
    @scala.inline
    def setSubmitTimeBefore(value: js.Date): Self = this.set("SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTimeBefore: Self = this.set("SubmitTimeBefore", js.undefined)
  }
}
