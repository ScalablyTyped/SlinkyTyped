package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateResponse extends js.Object {
  /**
    * The default version of the fleet provisioning template.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}

object CreateProvisioningTemplateResponse {
  @scala.inline
  def apply(): CreateProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningTemplateResponse]
  }
  @scala.inline
  implicit class CreateProvisioningTemplateResponseOps[Self <: CreateProvisioningTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVersionId(value: TemplateVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateArn(value: TemplateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(js.undefined)
        ret
    }
  }
  
}

