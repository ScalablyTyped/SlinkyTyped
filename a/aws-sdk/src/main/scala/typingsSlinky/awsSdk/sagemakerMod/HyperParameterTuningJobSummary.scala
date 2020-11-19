package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTuningJobSummary extends js.Object {
  
  /**
    * The date and time that the tuning job was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobArn = js.native
  
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  
  /**
    * The status of the tuning job.
    */
  var HyperParameterTuningJobStatus: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobStatus = js.native
  
  /**
    * The date and time that the tuning job was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typingsSlinky.awsSdk.sagemakerMod.ObjectiveStatusCounters = js.native
  
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
    */
  var ResourceLimits: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ResourceLimits] = js.native
  
  /**
    * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  
  /**
    * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typingsSlinky.awsSdk.sagemakerMod.TrainingJobStatusCounters = js.native
}
object HyperParameterTuningJobSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobStatusCounters: TrainingJobStatusCounters
  ): HyperParameterTuningJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any], HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobSummary]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobSummaryOps[Self <: HyperParameterTuningJobSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: js.Date): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = this.set("HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = this.set("HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobStatus(value: HyperParameterTuningJobStatus): Self = this.set("HyperParameterTuningJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectiveStatusCounters(value: ObjectiveStatusCounters): Self = this.set("ObjectiveStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: HyperParameterTuningJobStrategyType): Self = this.set("Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobStatusCounters(value: TrainingJobStatusCounters): Self = this.set("TrainingJobStatusCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningEndTime(value: js.Date): Self = this.set("HyperParameterTuningEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameterTuningEndTime: Self = this.set("HyperParameterTuningEndTime", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setResourceLimits(value: ResourceLimits): Self = this.set("ResourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLimits: Self = this.set("ResourceLimits", js.undefined)
  }
}
