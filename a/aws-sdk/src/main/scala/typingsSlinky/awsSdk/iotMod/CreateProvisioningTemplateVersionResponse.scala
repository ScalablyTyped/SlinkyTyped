package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateVersionResponse extends js.Object {
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
  /**
    * The version of the fleet provisioning template.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object CreateProvisioningTemplateVersionResponse {
  @scala.inline
  def apply(): CreateProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningTemplateVersionResponse]
  }
  @scala.inline
  implicit class CreateProvisioningTemplateVersionResponseOps[Self <: CreateProvisioningTemplateVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefaultVersion(value: IsDefaultVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefaultVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefaultVersion")(js.undefined)
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
    @scala.inline
    def withVersionId(value: TemplateVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

