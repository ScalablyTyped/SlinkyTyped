package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest extends js.Object {
  /**
    * New InspectTemplate value.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequestOps[Self <: SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest] (val x: Self) extends AnyVal {
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

