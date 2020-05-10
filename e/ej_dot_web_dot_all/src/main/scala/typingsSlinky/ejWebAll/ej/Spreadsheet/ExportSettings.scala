package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable save feature in Spreadsheet. By enabling this feature, you can save existing Spreadsheet.
    * @Default {true}
    */
  var allowExporting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define csvUrl for export to CSV format.
    * @Default {null}
    */
  var csvUrl: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to enable or disable formula calculation in Spreadsheet. By enabling this feature, formula calculated while export the Spreadsheet in
    * protected mode.
    * @Default {false}
    */
  var enableFormulaCalculation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define excelUrl for export to excel format.
    * @Default {null}
    */
  var excelUrl: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define password while export to excel format.
    * @Default {null}
    */
  var password: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define pdfUrl for export to PDF format.
    * @Default {null}
    */
  var pdfUrl: js.UndefOr[String] = js.native
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
    def withAllowExporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withCsvUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsvUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csvUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFormulaCalculation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFormulaCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFormulaCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFormulaCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withExcelUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcelUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excelUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfUrl")(js.undefined)
        ret
    }
  }
  
}

