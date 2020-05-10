package typingsSlinky.agGrid.iExcelCreatorMod

import typingsSlinky.agGrid.exportParamsMod.ExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelExportParams
  extends ExportParams[js.Array[js.Array[ExcelCell]]] {
  var sheetName: js.UndefOr[String] = js.native
  var suppressTextAsCDATA: js.UndefOr[Boolean] = js.native
}

object ExcelExportParams {
  @scala.inline
  def apply(): ExcelExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportParams]
  }
  @scala.inline
  implicit class ExcelExportParamsOps[Self <: ExcelExportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSheetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressTextAsCDATA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressTextAsCDATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressTextAsCDATA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressTextAsCDATA")(js.undefined)
        ret
    }
  }
  
}

