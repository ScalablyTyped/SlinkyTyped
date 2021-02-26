package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugRuleConfiguration extends StObject {
  
  /**
    * The instance type to deploy for a training job.
    */
  var InstanceType: js.UndefOr[ProcessingInstanceType] = js.native
  
  /**
    * Path to local storage location for output of rules. Defaults to /opt/ml/processing/output/rule/.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  
  /**
    * The name of the rule configuration. It must be unique relative to other rule configuration names.
    */
  var RuleConfigurationName: typingsSlinky.awsSdk.sagemakerMod.RuleConfigurationName = js.native
  
  /**
    * The Amazon Elastic Container (ECR) Image for the managed rule evaluation.
    */
  var RuleEvaluatorImage: AlgorithmImage = js.native
  
  /**
    *  Runtime configuration for rule container.
    */
  var RuleParameters: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RuleParameters] = js.native
  
  /**
    * Path to Amazon S3 storage location for rules.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.native
  
  /**
    * The size, in GB, of the ML storage volume attached to the processing instance.
    */
  var VolumeSizeInGB: js.UndefOr[OptionalVolumeSizeInGB] = js.native
}
object DebugRuleConfiguration {
  
  @scala.inline
  def apply(RuleConfigurationName: RuleConfigurationName, RuleEvaluatorImage: AlgorithmImage): DebugRuleConfiguration = {
    val __obj = js.Dynamic.literal(RuleConfigurationName = RuleConfigurationName.asInstanceOf[js.Any], RuleEvaluatorImage = RuleEvaluatorImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugRuleConfiguration]
  }
  
  @scala.inline
  implicit class DebugRuleConfigurationMutableBuilder[Self <: DebugRuleConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: ProcessingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLocalPath(value: DirectoryPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    @scala.inline
    def setRuleConfigurationName(value: RuleConfigurationName): Self = StObject.set(x, "RuleConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleEvaluatorImage(value: AlgorithmImage): Self = StObject.set(x, "RuleEvaluatorImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleParameters(value: RuleParameters): Self = StObject.set(x, "RuleParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleParametersUndefined: Self = StObject.set(x, "RuleParameters", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
    
    @scala.inline
    def setVolumeSizeInGB(value: OptionalVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
