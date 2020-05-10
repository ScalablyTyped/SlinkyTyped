package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionDeclaration extends js.Object {
  /**
    * Specifies the action type and the provider of the action.
    */
  var actionTypeId: ActionTypeId = js.native
  /**
    * The action's configuration. These are key-value pairs that specify input values for an action. For more information, see Action Structure Requirements in CodePipeline. For the list of configuration properties for the AWS CloudFormation action type in CodePipeline, see Configuration Properties Reference in the AWS CloudFormation User Guide. For template snippets with examples, see Using Parameter Override Functions with CodePipeline Pipelines in the AWS CloudFormation User Guide. The values can be represented in either JSON or YAML format. For example, the JSON configuration item format is as follows:   JSON:   "Configuration" : { Key : Value }, 
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  /**
    * The name or ID of the artifact consumed by the action, such as a test or build artifact.
    */
  var inputArtifacts: js.UndefOr[InputArtifactList] = js.native
  /**
    * The action declaration's name.
    */
  var name: ActionName = js.native
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  /**
    * The name or ID of the result of the action declaration, such as a test or build artifact.
    */
  var outputArtifacts: js.UndefOr[OutputArtifactList] = js.native
  /**
    * The action declaration's AWS Region, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[ActionRunOrder] = js.native
}

object ActionDeclaration {
  @scala.inline
  def apply(actionTypeId: ActionTypeId, name: ActionName): ActionDeclaration = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDeclaration]
  }
  @scala.inline
  implicit class ActionDeclarationOps[Self <: ActionDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTypeId(value: ActionTypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: ActionConfigurationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withInputArtifacts(value: InputArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: ActionNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArtifacts(value: OutputArtifactList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: AWSRegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOrder(value: ActionRunOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOrder")(js.undefined)
        ret
    }
  }
  
}

