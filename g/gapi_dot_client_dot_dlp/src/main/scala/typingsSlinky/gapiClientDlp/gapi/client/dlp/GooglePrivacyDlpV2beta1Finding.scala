package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Finding extends js.Object {
  /** Timestamp when finding was detected. */
  var createTime: js.UndefOr[String] = js.native
  /** The specific type of info the string might be. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** Estimate of how likely it is that the info_type is correct. */
  var likelihood: js.UndefOr[String] = js.native
  /** Location of the info found. */
  var location: js.UndefOr[GooglePrivacyDlpV2beta1Location] = js.native
  /** The specific string that may be potentially sensitive info. */
  var quote: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1Finding {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Finding]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FindingOps[Self <: GooglePrivacyDlpV2beta1Finding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
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
    def withLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: GooglePrivacyDlpV2beta1Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
  }
  
}

