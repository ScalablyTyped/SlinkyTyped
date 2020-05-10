package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedStatus extends js.Object {
  var country: js.UndefOr[String] = js.native
  var datafeedId: js.UndefOr[String] = js.native
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
  var itemsTotal: js.UndefOr[String] = js.native
  var itemsValid: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var lastUploadDate: js.UndefOr[String] = js.native
  var processingStatus: js.UndefOr[String] = js.native
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
}

object DatafeedStatus {
  @scala.inline
  def apply(): DatafeedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatus]
  }
  @scala.inline
  implicit class DatafeedStatusOps[Self <: DatafeedStatus] (val x: Self) extends AnyVal {
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
    def withErrors(value: js.Array[DatafeedStatusError]): Self = {
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
    def withWarnings(value: js.Array[DatafeedStatusError]): Self = {
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

