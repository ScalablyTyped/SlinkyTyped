package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHyperParameterTuningJobResponse extends StObject {
  
  /**
    * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
    */
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  
  /**
    * The date and time that the tuning job started.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * If the tuning job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  
  /**
    * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
    */
  var HyperParameterTuningJobConfig: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobConfig = js.native
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  
  /**
    * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
    */
  var HyperParameterTuningJobStatus: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  
  /**
    * The date and time that the status of the tuning job was modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  
  /**
    * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
    */
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.native
  
  /**
    * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.native
  
  /**
    * A list of the HyperParameterTrainingJobDefinition objects launched for this tuning job.
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.native
  
  /**
    * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
  
  /**
    * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.native
}
object DescribeHyperParameterTuningJobResponse {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
  
  @scala.inline
  implicit class DescribeHyperParameterTuningJobResponseMutableBuilder[Self <: DescribeHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "BestTrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestTrainingJobUndefined: Self = StObject.set(x, "BestTrainingJob", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setHyperParameterTuningEndTime(value: js.Date): Self = StObject.set(x, "HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningEndTimeUndefined: Self = StObject.set(x, "HyperParameterTuningEndTime", js.undefined)
    
    @scala.inline
    def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HyperParameterTuningJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = StObject.set(x, "HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = StObject.set(x, "ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBestTrainingJob(value: HyperParameterTrainingJobSummary): Self = StObject.set(x, "OverallBestTrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallBestTrainingJobUndefined: Self = StObject.set(x, "OverallBestTrainingJob", js.undefined)
    
    @scala.inline
    def setTrainingJobDefinition(value: HyperParameterTrainingJobDefinition): Self = StObject.set(x, "TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinitionUndefined: Self = StObject.set(x, "TrainingJobDefinition", js.undefined)
    
    @scala.inline
    def setTrainingJobDefinitions(value: HyperParameterTrainingJobDefinitions): Self = StObject.set(x, "TrainingJobDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobDefinitionsUndefined: Self = StObject.set(x, "TrainingJobDefinitions", js.undefined)
    
    @scala.inline
    def setTrainingJobDefinitionsVarargs(value: HyperParameterTrainingJobDefinition*): Self = StObject.set(x, "TrainingJobDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = StObject.set(x, "TrainingJobStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = StObject.set(x, "WarmStartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartConfigUndefined: Self = StObject.set(x, "WarmStartConfig", js.undefined)
  }
}
