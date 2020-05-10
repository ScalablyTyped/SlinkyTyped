package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a datafeed, i.e., the result of the last retrieval of the
  * datafeed computed asynchronously when the feed processing is finished.
  */
@js.native
trait SchemaDatafeedStatus extends js.Object {
  /**
    * The country for which the status is reported, represented as a  CLDR
    * territory code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The ID of the feed for which the status is reported.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The list of errors occurring in the feed.
    */
  var errors: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.native
  /**
    * The number of items in the feed that were processed.
    */
  var itemsTotal: js.UndefOr[String] = js.native
  /**
    * The number of items in the feed that were valid.
    */
  var itemsValid: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language for which the status is reported.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The last date at which the feed was uploaded.
    */
  var lastUploadDate: js.UndefOr[String] = js.native
  /**
    * The processing status of the feed.
    */
  var processingStatus: js.UndefOr[String] = js.native
  /**
    * The list of errors occurring in the feed.
    */
  var warnings: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.native
}

object SchemaDatafeedStatus {
  @scala.inline
  def apply(): SchemaDatafeedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatus]
  }
  @scala.inline
  implicit class SchemaDatafeedStatusOps[Self <: SchemaDatafeedStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeedId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[SchemaDatafeedStatusError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsValid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsValid")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUploadDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUploadDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUploadDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUploadDate")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[SchemaDatafeedStatusError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

