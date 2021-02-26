package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterTuningJobConfig extends StObject {
  
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.HyperParameterTuningJobObjective] = js.native
  
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ParameterRanges] = js.native
  
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: typingsSlinky.awsSdk.sagemakerMod.ResourceLimits = js.native
  
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. To use the Bayesian search strategy, set this to Bayesian. To randomly search, set it to Random. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType = js.native
  
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrainingJobEarlyStoppingType] = js.native
  
  /**
    * The tuning job's completion criteria.
    */
  var TuningJobCompletionCriteria: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TuningJobCompletionCriteria] = js.native
}
object HyperParameterTuningJobConfig {
  
  @scala.inline
  def apply(ResourceLimits: ResourceLimits, Strategy: HyperParameterTuningJobStrategyType): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(ResourceLimits = ResourceLimits.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  @scala.inline
  implicit class HyperParameterTuningJobConfigMutableBuilder[Self <: HyperParameterTuningJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperParameterTuningJobObjective(value: HyperParameterTuningJobObjective): Self = StObject.set(x, "HyperParameterTuningJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperParameterTuningJobObjectiveUndefined: Self = StObject.set(x, "HyperParameterTuningJobObjective", js.undefined)
    
    @scala.inline
    def setParameterRanges(value: ParameterRanges): Self = StObject.set(x, "ParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterRangesUndefined: Self = StObject.set(x, "ParameterRanges", js.undefined)
    
    @scala.inline
    def setResourceLimits(value: ResourceLimits): Self = StObject.set(x, "ResourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: HyperParameterTuningJobStrategyType): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobEarlyStoppingType(value: TrainingJobEarlyStoppingType): Self = StObject.set(x, "TrainingJobEarlyStoppingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingJobEarlyStoppingTypeUndefined: Self = StObject.set(x, "TrainingJobEarlyStoppingType", js.undefined)
    
    @scala.inline
    def setTuningJobCompletionCriteria(value: TuningJobCompletionCriteria): Self = StObject.set(x, "TuningJobCompletionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTuningJobCompletionCriteriaUndefined: Self = StObject.set(x, "TuningJobCompletionCriteria", js.undefined)
  }
}
