package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentProperties extends js.Object {
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.native
  /**
    * The mode that is used to deploy resources. This value can be either Incremental or Complete.
    * In Incremental mode, resources are deployed without deleting existing resources that are not
    * included in the template. In Complete mode, resources are deployed and existing resources in
    * the resource group that are not included in the template are deleted. Be careful when using
    * Complete mode as you may unintentionally delete resources. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: String = js.native
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeployment] = js.native
  /**
    * Name and value pairs that define the deployment parameters for the template. You use this
    * element when you want to provide the parameter values directly in the request rather than link
    * to an existing parameter file. Use either the parametersLink property or the parameters
    * property, but not both. It can be a JObject or a well formed JSON string.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The URI of parameters file. You use this element to link to an existing parameters file. Use
    * either the parametersLink property or the parameters property, but not both.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.native
  /**
    * The template content. You use this element when you want to pass the template syntax directly
    * in the request rather than link to an existing template. It can be a JObject or well-formed
    * JSON string. Use either the templateLink property or the template property, but not both.
    */
  var template: js.UndefOr[js.Any] = js.native
  /**
    * The URI of the template. Use either the templateLink property or the template property, but
    * not both.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.native
}

object DeploymentProperties {
  @scala.inline
  def apply(mode: String): DeploymentProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentProperties]
  }
  @scala.inline
  implicit class DeploymentPropertiesOps[Self <: DeploymentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
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
    def withOnErrorDeployment(value: OnErrorDeployment): Self = {
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
  }
  
}

