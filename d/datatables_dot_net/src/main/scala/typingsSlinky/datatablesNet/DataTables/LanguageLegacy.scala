package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageLegacy extends js.Object {
  var oAria: js.UndefOr[LanguageAriaLegacy] = js.native
  var oPaginate: js.UndefOr[LanguagePaginateLegacy] = js.native
  var sEmptyTable: js.UndefOr[String] = js.native
  var sInfo: js.UndefOr[String] = js.native
  var sInfoEmpty: js.UndefOr[String] = js.native
  var sInfoFiltered: js.UndefOr[String] = js.native
  var sInfoPostFix: js.UndefOr[String] = js.native
  var sInfoThousands: js.UndefOr[String] = js.native
  var sLengthMenu: js.UndefOr[String] = js.native
  var sLoadingRecords: js.UndefOr[String] = js.native
  var sProcessing: js.UndefOr[String] = js.native
  var sSearch: js.UndefOr[String] = js.native
  var sUrl: js.UndefOr[String] = js.native
  var sZeroRecords: js.UndefOr[String] = js.native
}

object LanguageLegacy {
  @scala.inline
  def apply(): LanguageLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageLegacy]
  }
  @scala.inline
  implicit class LanguageLegacyOps[Self <: LanguageLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOAria(value: LanguageAriaLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oAria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oAria")(js.undefined)
        ret
    }
    @scala.inline
    def withOPaginate(value: LanguagePaginateLegacy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oPaginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOPaginate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oPaginate")(js.undefined)
        ret
    }
    @scala.inline
    def withSEmptyTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sEmptyTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSEmptyTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sEmptyTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfoEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfoEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfoFiltered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfoFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfoPostFix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoPostFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfoPostFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoPostFix")(js.undefined)
        ret
    }
    @scala.inline
    def withSInfoThousands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoThousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSInfoThousands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sInfoThousands")(js.undefined)
        ret
    }
    @scala.inline
    def withSLengthMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLengthMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSLengthMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLengthMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSLoadingRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLoadingRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSLoadingRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sLoadingRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withSSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withSUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSZeroRecords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sZeroRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSZeroRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sZeroRecords")(js.undefined)
        ret
    }
  }
  
}

