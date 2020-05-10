package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest extends js.Object {
  /**
    * Updated configuration for the storedInfoType. If not provided, a new
    * version of the storedInfoType will be created with the existing
    * configuration.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequestOps[Self <: SchemaGooglePrivacyDlpV2UpdateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
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

