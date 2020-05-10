package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1EntityId extends js.Object {
  /** Composite key indicating which field contains the entity identifier. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
}

object GooglePrivacyDlpV2beta1EntityId {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1EntityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1EntityId]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1EntityIdOps[Self <: GooglePrivacyDlpV2beta1EntityId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: GooglePrivacyDlpV2beta1FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
  }
  
}

