package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KAnonymityConfig extends js.Object {
  /**
    * Optional message indicating that each distinct `EntityId` should not
    * contribute to the k-anonymity count more than once per equivalence class.
    */
  var entityId: js.UndefOr[GooglePrivacyDlpV2beta1EntityId] = js.native
  /**
    * Set of fields to compute k-anonymity over. When multiple fields are
    * specified, they are considered a single composite key. Structs and
    * repeated data types are not supported; however, nested fields are
    * supported so long as they are not structs themselves or nested within
    * a repeated field.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.native
}

object GooglePrivacyDlpV2beta1KAnonymityConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KAnonymityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KAnonymityConfigOps[Self <: GooglePrivacyDlpV2beta1KAnonymityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityId(value: GooglePrivacyDlpV2beta1EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuasiIds(value: js.Array[GooglePrivacyDlpV2beta1FieldId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuasiIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIds")(js.undefined)
        ret
    }
  }
  
}

