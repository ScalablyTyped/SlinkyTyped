package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleConfiguration extends js.Object {
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
  implicit class DebugRuleConfigurationOps[Self <: DebugRuleConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuleConfigurationName(value: RuleConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleEvaluatorImage(value: AlgorithmImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleEvaluatorImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: ProcessingInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPath(value: DirectoryPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleParameters(value: RuleParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withS3OutputPath(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3OutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSizeInGB(value: OptionalVolumeSizeInGB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSizeInGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSizeInGB")(js.undefined)
        ret
    }
  }
  
}

