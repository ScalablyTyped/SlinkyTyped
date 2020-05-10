package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionInput extends js.Object {
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  /**
    * Configuration data for an action execution with all variable references replaced with their real values for the execution.
    */
  var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.native
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object ActionExecutionInput {
  @scala.inline
  def apply(): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionInput]
  }
  @scala.inline
  implicit class ActionExecutionInputOps[Self <: ActionExecutionInput] (val x: Self) extends AnyVal {
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
    def withoutActionTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTypeId")(js.undefined)
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
    def withInputArtifacts(value: ArtifactDetailList): Self = {
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
    def withResolvedConfiguration(value: ResolvedActionConfigurationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedConfiguration")(js.undefined)
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
  }
  
}

