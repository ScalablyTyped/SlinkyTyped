package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisioningTemplateRequest extends js.Object {
  /**
    * The ID of the default provisioning template version.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object UpdateProvisioningTemplateRequest {
  @scala.inline
  def apply(templateName: TemplateName): UpdateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningTemplateRequest]
  }
  @scala.inline
  implicit class UpdateProvisioningTemplateRequestOps[Self <: UpdateProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDescription(value: TemplateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningRoleArn")(js.undefined)
        ret
    }
  }
  
}

