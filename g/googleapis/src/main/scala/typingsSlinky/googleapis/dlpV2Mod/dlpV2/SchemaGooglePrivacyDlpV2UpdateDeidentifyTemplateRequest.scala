package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends js.Object {
  /**
    * New DeidentifyTemplate value.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest] (val x: Self) extends AnyVal {
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
    def withUpdateMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

