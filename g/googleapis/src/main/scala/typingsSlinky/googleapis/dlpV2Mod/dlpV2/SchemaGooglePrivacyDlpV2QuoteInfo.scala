package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for infoType-dependent details parsed from quote.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuoteInfo extends js.Object {
  /**
    * The date time indicated by the quote.
    */
  var dateTime: js.UndefOr[SchemaGooglePrivacyDlpV2DateTime] = js.native
}

object SchemaGooglePrivacyDlpV2QuoteInfo {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuoteInfo]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuoteInfoOps[Self <: SchemaGooglePrivacyDlpV2QuoteInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTime(value: SchemaGooglePrivacyDlpV2DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.undefined)
        ret
    }
  }
  
}

