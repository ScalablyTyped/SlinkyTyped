package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateStoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest extends js.Object {
  /**
    * Configuration of the storedInfoType to create.
    */
  var config: js.UndefOr[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] = js.native
  /**
    * The storedInfoType ID can contain uppercase and lowercase letters,
    * numbers, and hyphens; that is, it must match the regular expression:
    * `[a-zA-Z\\d-_]+`. The maximum length is 100 characters. Can be empty to
    * allow the system to generate one.
    */
  var storedInfoTypeId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateStoredInfoTypeRequest] (val x: Self) extends AnyVal {
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
    def withStoredInfoTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedInfoTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredInfoTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedInfoTypeId")(js.undefined)
        ret
    }
  }
  
}

