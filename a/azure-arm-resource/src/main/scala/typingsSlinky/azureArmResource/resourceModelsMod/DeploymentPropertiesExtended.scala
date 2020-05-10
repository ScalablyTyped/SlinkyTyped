package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentPropertiesExtended extends js.Object {
  /**
    * The correlation ID of the deployment.
    */
  val correlationId: js.UndefOr[String] = js.native
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.native
  /**
    * The list of deployment dependencies.
    */
  var dependencies: js.UndefOr[js.Array[Dependency]] = js.native
  /**
    * The deployment mode. Possible values are Incremental and Complete. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeploymentExtended] = js.native
  /**
    * Key/value pairs that represent deployment output.
    */
  var outputs: js.UndefOr[js.Any] = js.native
  /**
    * Deployment parameters. Use only one of Parameters or ParametersLink.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The URI referencing the parameters. Use only one of Parameters or ParametersLink.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.native
  /**
    * The list of resource providers needed for the deployment.
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.native
  /**
    * The template content. Use only one of Template or TemplateLink.
    */
  var template: js.UndefOr[js.Any] = js.native
  /**
    * The URI referencing the template. Use only one of Template or TemplateLink.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.native
  /**
    * The timestamp of the template deployment.
    */
  val timestamp: js.UndefOr[js.Date] = js.native
}

object DeploymentPropertiesExtended {
  @scala.inline
  def apply(): DeploymentPropertiesExtended = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentPropertiesExtended]
  }
  @scala.inline
  implicit class DeploymentPropertiesExtendedOps[Self <: DeploymentPropertiesExtended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugSetting(value: DebugSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[Dependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorDeployment(value: OnErrorDeploymentExtended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnErrorDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorDeployment")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withParametersLink(value: ParametersLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parametersLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParametersLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parametersLink")(js.undefined)
        ret
    }
    @scala.inline
    def withProviders(value: js.Array[Provider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providers")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningState")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateLink(value: TemplateLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

