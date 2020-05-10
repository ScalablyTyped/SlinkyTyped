package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeLimit extends js.Object {
  /**
    * Type of information the findings limit applies to. Only one limit per
    * info_type should be provided. If InfoTypeLimit does not have an
    * info_type, the DLP API applies the limit against all info_types that are
    * found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** Max findings limit for the given infoType. */
  var maxFindings: js.UndefOr[Double] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeLimit {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeLimit]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeLimitOps[Self <: GooglePrivacyDlpV2beta1InfoTypeLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFindings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindings")(js.undefined)
        ret
    }
  }
  
}

