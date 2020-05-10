package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest extends js.Object {
  /**
    * The InspectTemplate to create.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateInspectTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInspectTemplate(value: SchemaGooglePrivacyDlpV2InspectTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
        ret
    }
  }
  
}

