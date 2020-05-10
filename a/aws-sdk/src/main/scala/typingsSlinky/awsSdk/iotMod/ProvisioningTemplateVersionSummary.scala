package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningTemplateVersionSummary extends js.Object {
  /**
    * The date when the fleet provisioning template version was created
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The ID of the fleet privisioning template version.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object ProvisioningTemplateVersionSummary {
  @scala.inline
  def apply(): ProvisioningTemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningTemplateVersionSummary]
  }
  @scala.inline
  implicit class ProvisioningTemplateVersionSummaryOps[Self <: ProvisioningTemplateVersionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
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

