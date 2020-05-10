package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1LDiversityConfig extends js.Object {
  /**
    * Set of quasi-identifiers indicating how equivalence classes are
    * defined for the l-diversity computation. When multiple fields are
    * specified, they are considered a single composite key.
    */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.native
  /** Sensitive field for computing the l-value. */
  var sensitiveAttribute: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
}

object GooglePrivacyDlpV2beta1LDiversityConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1LDiversityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LDiversityConfigOps[Self <: GooglePrivacyDlpV2beta1LDiversityConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSensitiveAttribute(value: GooglePrivacyDlpV2beta1FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiveAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveAttribute")(js.undefined)
        ret
    }
  }
  
}

