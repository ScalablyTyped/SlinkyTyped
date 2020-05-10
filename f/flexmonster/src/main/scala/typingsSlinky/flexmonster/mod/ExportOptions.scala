package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportOptions extends js.Object {
  var destinationType: js.UndefOr[String] = js.native
  var excelExportAll: js.UndefOr[Boolean] = js.native
  var excelSheetName: js.UndefOr[String] = js.native
  var filename: js.UndefOr[String] = js.native
  var fontUrl: js.UndefOr[String] = js.native
  var footer: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var pageOrientation: js.UndefOr[String] = js.native
  var requestHeaders: js.UndefOr[js.Object] = js.native
  var showFilters: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var useCustomizeCellForData: js.UndefOr[Boolean] = js.native
  var useOlapFormattingInExcel: js.UndefOr[Boolean] = js.native
}

object ExportOptions {
  @scala.inline
  def apply(): ExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportOptions]
  }
  @scala.inline
  implicit class ExportOptionsOps[Self <: ExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelExportAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExportAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelExportAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelExportAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelSheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelSheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFontUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFilters")(js.undefined)
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
    def withUseCustomizeCellForData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomizeCellForData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomizeCellForData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomizeCellForData")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOlapFormattingInExcel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOlapFormattingInExcel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOlapFormattingInExcel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOlapFormattingInExcel")(js.undefined)
        ret
    }
  }
  
}

