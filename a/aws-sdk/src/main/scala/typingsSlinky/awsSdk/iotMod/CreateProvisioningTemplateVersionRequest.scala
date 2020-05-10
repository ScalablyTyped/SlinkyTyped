package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateVersionRequest extends js.Object {
  /**
    * Sets a fleet provision template version as the default version.
    */
  var setAsDefault: js.UndefOr[SetAsDefault] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object CreateProvisioningTemplateVersionRequest {
  @scala.inline
  def apply(templateBody: TemplateBody, templateName: TemplateName): CreateProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionRequest]
  }
  @scala.inline
  implicit class CreateProvisioningTemplateVersionRequestOps[Self <: CreateProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateBody(value: TemplateBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAsDefault(value: SetAsDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsDefault")(js.undefined)
        ret
    }
  }
  
}

