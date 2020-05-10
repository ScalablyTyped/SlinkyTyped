package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a piece of potentially sensitive content.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Finding extends js.Object {
  /**
    * Timestamp when finding was detected.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The type of content that might have been found. Provided if
    * `excluded_types` is false.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Confidence of how likely it is that the `info_type` is correct.
    */
  var likelihood: js.UndefOr[String] = js.native
  /**
    * Where the content was found.
    */
  var location: js.UndefOr[SchemaGooglePrivacyDlpV2Location] = js.native
  /**
    * The content that was found. Even if the content is not textual, it may be
    * converted to a textual representation here. Provided if `include_quote`
    * is true and the finding is less than or equal to 4096 bytes long. If the
    * finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set
    * to true and a supported infoType was requested. Currently supported
    * infoTypes: DATE, DATE_OF_BIRTH and TIME.
    */
  var quoteInfo: js.UndefOr[SchemaGooglePrivacyDlpV2QuoteInfo] = js.native
}

object SchemaGooglePrivacyDlpV2Finding {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Finding]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FindingOps[Self <: SchemaGooglePrivacyDlpV2Finding] (val x: Self) extends AnyVal {
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
    def withInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = {
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
    def withLocation(value: SchemaGooglePrivacyDlpV2Location): Self = {
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
    @scala.inline
    def withQuoteInfo(value: SchemaGooglePrivacyDlpV2QuoteInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteInfo")(js.undefined)
        ret
    }
  }
  
}

