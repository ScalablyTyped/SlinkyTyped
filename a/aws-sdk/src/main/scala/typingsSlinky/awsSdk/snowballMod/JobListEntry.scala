package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobListEntry extends StObject {
  
  /**
    * The creation date for this job.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates that this job is a main job. A main job represents a successful request to create an export job. Main jobs aren't associated with any Snowballs. Instead, each main job will have at least one job part, and each job part is associated with a Snowball. It might take some time before the job parts associated with a particular main job are listed, because they are created after the main job is created.
    */
  var IsMaster: js.UndefOr[Boolean] = js.native
  
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: js.UndefOr[String] = js.native
  
  /**
    * The current state of this job.
    */
  var JobState: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobState] = js.native
  
  /**
    * The type of job.
    */
  var JobType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobType] = js.native
  
  /**
    * The type of device used with this job.
    */
  var SnowballType: js.UndefOr[typingsSlinky.awsSdk.snowballMod.SnowballType] = js.native
}
object JobListEntry {
  
  @scala.inline
  def apply(): JobListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobListEntry]
  }
  
  @scala.inline
  implicit class JobListEntryMutableBuilder[Self <: JobListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsMaster(value: Boolean): Self = StObject.set(x, "IsMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMasterUndefined: Self = StObject.set(x, "IsMaster", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobState(value: JobState): Self = StObject.set(x, "JobState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStateUndefined: Self = StObject.set(x, "JobState", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
  }
}
