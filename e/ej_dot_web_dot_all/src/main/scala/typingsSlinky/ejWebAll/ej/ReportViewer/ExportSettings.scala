package typingsSlinky.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  /** Add the custom icon item to the export options.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the excel export format.
    * @Default {ej.ReportViewer.ExcelFormats.Excel97to2003}
    */
  var excelFormat: js.UndefOr[ExcelFormats | String] = js.native
  /** Specifies the export formats.
    * @Default {ej.ReportViewer.ExportOptions.All}
    */
  var exportOptions: js.UndefOr[ExportOptions | String] = js.native
  /** Specifies the ppt export format.
    * @Default {ej.ReportViewer.PPTFormats.PowerPoint97to2003}
    */
  var pptFormat: js.UndefOr[PPTFormats | String] = js.native
  /** Specifies the word export format.
    * @Default {ej.ReportViewer.WordFormats.Doc}
    */
  var wordFormat: js.UndefOr[WordFormats | String] = js.native
}

object ExportSettings {
  @scala.inline
  def apply(): ExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  implicit class ExportSettingsOps[Self <: ExportSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customItems")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelFormat(value: ExcelFormats | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withExportOptions(value: ExportOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPptFormat(value: PPTFormats | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pptFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPptFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pptFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWordFormat(value: WordFormats | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordFormat")(js.undefined)
        ret
    }
  }
  
}

