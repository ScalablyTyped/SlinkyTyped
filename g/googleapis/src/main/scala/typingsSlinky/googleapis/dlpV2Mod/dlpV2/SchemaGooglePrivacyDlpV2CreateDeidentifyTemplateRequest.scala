package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends js.Object {
  /**
    * The DeidentifyTemplate to create.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeidentifyTemplate(value: SchemaGooglePrivacyDlpV2DeidentifyTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeidentifyTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deidentifyTemplate")(js.undefined)
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

