package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHyperParameterTuningJobRequest extends StObject {
  
  /**
    * The HyperParameterTuningJobConfig object that describes the tuning job, including the search strategy, the objective metric used to evaluate training jobs, ranges of parameters to search, and resource limits for the tuning job. For more information, see How Hyperparameter Tuning Works.
    */
  var HyperParameterTuningJobConfig: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobConfig = js.native
  
  /**
    * The name of the tuning job. This name is the prefix for the names of all training jobs that this tuning job launches. The name must be unique within the same AWS account and AWS Region. The name must have 1 to 32 characters. Valid characters are a-z, A-Z, 0-9, and : + = @ _ % - (hyphen). The name is not case sensitive.
    */
  var HyperParameterTuningJobName: typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
  
  /**
    * An array of key-value pairs. You can use tags to categorize your AWS resources in different ways, for example, by purpose, owner, or environment. For more information, see AWS Tagging Strategies. Tags that you specify for the tuning job are also added to all training jobs that the tuning job launches.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The HyperParameterTrainingJobDefinition object that describes the training jobs that this tuning job launches, including static hyperparameters, input data configuration, output data configuration, resource configuration, and stopping condition.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.native
  
  /**
    * A list of the HyperParameterTrainingJobDefinition objects launched for this tuning job.
    */
  var TrainingJobDefinitions: js.UndefOr[HyperParameterTrainingJobDefinitions] = js.native
  
  /**
    * Specifies the configuration for starting the hyperparameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job. All training jobs launched by the new hyperparameter tuning job are evaluated by using the objective metric. If you specify IDENTICAL_DATA_AND_ALGORITHM as the WarmStartType value for the warm start configuration, the training job that performs the best in the new tuning job is compared to the best training jobs from the parent tuning jobs. From these, the training job that performs the best as measured by the objective metric is returned as the overall best training job.  All training jobs launched by parent hyperparameter tuning jobs and the new hyperparameter tuning jobs count against the limit of training jobs for the tuning job. 
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.native
}
object CreateHyperParameterTuningJobRequest {
  
  @scala.inline
  def apply(
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName
  ): CreateHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobConfig = HyperParameterTuningJobConfig.asInstanceOf[js.Any], HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHyperParameterTuningJobRequest]
  }
  
  @scala.inline
  implicit class CreateHyperParameterTuningJobRequestMutableBuilder[Self <: CreateHyperParameterTuningJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameterTuningJobConfig(value: HyperParameterTuningJobConfig): Self = StObject.set(x, "HyperParameterTuningJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
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
    def setWarmStartConfig(value: HyperParameterTuningJobWarmStartConfig): Self = StObject.set(x, "WarmStartConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmStartConfigUndefined: Self = StObject.set(x, "WarmStartConfig", js.undefined)
  }
}
