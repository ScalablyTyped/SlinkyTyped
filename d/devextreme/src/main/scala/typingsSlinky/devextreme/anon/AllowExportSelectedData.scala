package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowExportSelectedData extends js.Object {
  var allowExportSelectedData: js.UndefOr[Boolean] = js.native
  var customizeExcelCell: js.UndefOr[js.Function1[/* options */ FillPatternColor, _]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var excelFilterEnabled: js.UndefOr[Boolean] = js.native
  var excelWrapTextEnabled: js.UndefOr[Boolean] = js.native
  var fileName: js.UndefOr[String] = js.native
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.native
  var proxyUrl: js.UndefOr[String] = js.native
  var texts: js.UndefOr[ExportAll] = js.native
}

object AllowExportSelectedData {
  @scala.inline
  def apply(): AllowExportSelectedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowExportSelectedData]
  }
  @scala.inline
  implicit class AllowExportSelectedDataOps[Self <: AllowExportSelectedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExportSelectedData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExportSelectedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExportSelectedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExportSelectedData")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeExcelCell(value: /* options */ FillPatternColor => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeExcelCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeExcelCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeExcelCell")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelFilterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelFilterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelFilterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelFilterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelWrapTextEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelWrapTextEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelWrapTextEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelWrapTextEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreExcelErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExcelErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreExcelErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreExcelErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: ExportAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
  }
  
}

