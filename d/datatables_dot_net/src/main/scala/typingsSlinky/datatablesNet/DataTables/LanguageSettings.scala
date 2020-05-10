package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "callback-functions"
//#region "language-settings"
// these are all optional
@js.native
trait LanguageSettings extends js.Object {
  var aria: js.UndefOr[LanguageAriaSettings] = js.native
  var decimal: js.UndefOr[String] = js.native
  var emptyTable: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var infoEmpty: js.UndefOr[String] = js.native
  var infoFiltered: js.UndefOr[String] = js.native
  var infoPostFix: js.UndefOr[String] = js.native
  var lengthMenu: js.UndefOr[String] = js.native
  var loadingRecords: js.UndefOr[String] = js.native
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.native
  var processing: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var searchPlaceholder: js.UndefOr[String] = js.native
  var thousands: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var zeroRecords: js.UndefOr[String] = js.native
}

object LanguageSettings {
  @scala.inline
  def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  @scala.inline
  implicit class LanguageSettingsOps[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAria(value: LanguageAriaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyTable")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoFiltered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoPostFix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoPostFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoPostFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoPostFix")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginate(value: LanguagePaginateSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginate")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withThousands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroRecords")(js.undefined)
        ret
    }
  }
  
}

