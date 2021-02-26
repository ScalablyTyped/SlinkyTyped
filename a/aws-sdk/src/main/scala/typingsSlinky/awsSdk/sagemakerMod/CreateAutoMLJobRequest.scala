package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAutoMLJobRequest extends StObject {
  
  /**
    * Contains CompletionCriteria and SecurityConfig.
    */
  var AutoMLJobConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  
  /**
    * Identifies an Autopilot job. Must be unique to your account and is case-insensitive.
    */
  var AutoMLJobName: typingsSlinky.awsSdk.sagemakerMod.AutoMLJobName = js.native
  
  /**
    * Defines the objective of a an AutoML job. You provide a AutoMLJobObjective$MetricName and Autopilot infers whether to minimize or maximize it. If a metric is not specified, the most commonly used ObjectiveMetric for problem type is automaically selected.
    */
  var AutoMLJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  
  /**
    * Generates possible candidates without training a model. A candidate is a combination of data preprocessors, algorithms, and algorithm parameter settings.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  
  /**
    * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV. Minimum of 500 rows.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  
  /**
    * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  
  /**
    * Defines the kind of preprocessing and algorithms intended for the candidates. Options include: BinaryClassification, MulticlassClassification, and Regression.
    */
  var ProblemType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProblemType] = js.native
  
  /**
    * The ARN of the role that is used to access the data.
    */
  var RoleArn: typingsSlinky.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateAutoMLJobRequest {
  
  @scala.inline
  def apply(
    AutoMLJobName: AutoMLJobName,
    InputDataConfig: AutoMLInputDataConfig,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): CreateAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobRequest]
  }
  
  @scala.inline
  implicit class CreateAutoMLJobRequestMutableBuilder[Self <: CreateAutoMLJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMLJobConfig(value: AutoMLJobConfig): Self = StObject.set(x, "AutoMLJobConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobConfigUndefined: Self = StObject.set(x, "AutoMLJobConfig", js.undefined)
    
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    @scala.inline
    def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateCandidateDefinitionsOnlyUndefined: Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: AutoMLInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigVarargs(value: AutoMLChannel*): Self = StObject.set(x, "InputDataConfig", js.Array(value :_*))
    
    @scala.inline
    def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
