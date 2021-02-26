package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClassificationJobResponse extends StObject {
  
  /**
    * The token that was provided to ensure the idempotency of the request to create the job.
    */
  var clientToken: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The custom data identifiers that the job uses to analyze data.
    */
  var customDataIdentifierIds: js.UndefOr[listOfString] = js.native
  
  /**
    * The custom description of the job.
    */
  var description: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the job is configured to analyze all existing, eligible objects immediately after it's created.
    */
  var initialRun: js.UndefOr[boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.native
  
  /**
    * The current status of the job. Possible values are: CANCELLED - You cancelled the job, or you paused the job while it had a status of RUNNING and you didn't resume it within 30 days of pausing it. COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value doesn't apply to recurring jobs. IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This value doesn't apply to one-time jobs. PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data discovery quota for your account or one or more member accounts that the job analyzes data for. RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress. USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume the job within 30 days of pausing it, the job expires and is cancelled. To check the job's expiration date, refer to the UserPausedDetails.jobExpiresAt property.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.native
  
  /**
    * The schedule for running the job. Possible values are: ONE_TIME - The job runs only once. SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the recurrence pattern for the job.
    */
  var jobType: js.UndefOr[JobType] = js.native
  
  /**
    * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this value indicates the error status of the job's most recent run.
    */
  var lastRunErrorStatus: js.UndefOr[LastRunErrorStatus] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job started. If the job is a recurring job, this value indicates when the most recent run started.
    */
  var lastRunTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The custom name of the job.
    */
  var name: js.UndefOr[string] = js.native
  
  /**
    * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
    */
  var s3JobDefinition: js.UndefOr[S3JobDefinition] = js.native
  
  /**
    * The sampling depth, as a percentage, that determines the percentage of eligible objects that the job analyzes.
    */
  var samplingPercentage: js.UndefOr[integer] = js.native
  
  /**
    * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
    */
  var scheduleFrequency: js.UndefOr[JobScheduleFrequency] = js.native
  
  /**
    * The number of times that the job has run and processing statistics for the job's current run.
    */
  var statistics: js.UndefOr[Statistics] = js.native
  
  /**
    * A map of key-value pairs that specifies which tags (keys and values) are associated with the classification job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is USER_PAUSED.
    */
  var userPausedDetails: js.UndefOr[UserPausedDetails] = js.native
}
object DescribeClassificationJobResponse {
  
  @scala.inline
  def apply(): DescribeClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClassificationJobResponse]
  }
  
  @scala.inline
  implicit class DescribeClassificationJobResponseMutableBuilder[Self <: DescribeClassificationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCustomDataIdentifierIds(value: listOfString): Self = StObject.set(x, "customDataIdentifierIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataIdentifierIdsUndefined: Self = StObject.set(x, "customDataIdentifierIds", js.undefined)
    
    @scala.inline
    def setCustomDataIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "customDataIdentifierIds", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInitialRun(value: boolean): Self = StObject.set(x, "initialRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRunUndefined: Self = StObject.set(x, "initialRun", js.undefined)
    
    @scala.inline
    def setJobArn(value: string): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "jobStatus", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    @scala.inline
    def setLastRunErrorStatus(value: LastRunErrorStatus): Self = StObject.set(x, "lastRunErrorStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunErrorStatusUndefined: Self = StObject.set(x, "lastRunErrorStatus", js.undefined)
    
    @scala.inline
    def setLastRunTime(value: js.Date): Self = StObject.set(x, "lastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunTimeUndefined: Self = StObject.set(x, "lastRunTime", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setS3JobDefinition(value: S3JobDefinition): Self = StObject.set(x, "s3JobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3JobDefinitionUndefined: Self = StObject.set(x, "s3JobDefinition", js.undefined)
    
    @scala.inline
    def setSamplingPercentage(value: integer): Self = StObject.set(x, "samplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingPercentageUndefined: Self = StObject.set(x, "samplingPercentage", js.undefined)
    
    @scala.inline
    def setScheduleFrequency(value: JobScheduleFrequency): Self = StObject.set(x, "scheduleFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleFrequencyUndefined: Self = StObject.set(x, "scheduleFrequency", js.undefined)
    
    @scala.inline
    def setStatistics(value: Statistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUserPausedDetails(value: UserPausedDetails): Self = StObject.set(x, "userPausedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPausedDetailsUndefined: Self = StObject.set(x, "userPausedDetails", js.undefined)
  }
}
