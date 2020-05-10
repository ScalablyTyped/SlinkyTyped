package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellData extends js.Object {
  var dataValidation: js.UndefOr[DataValidationRule] = js.native
  var effectiveFormat: js.UndefOr[CellFormat] = js.native
  var effectiveValue: js.UndefOr[ExtendedValue] = js.native
  var formattedValue: js.UndefOr[String] = js.native
  var hyperlink: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var pivotTable: js.UndefOr[PivotTable] = js.native
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.native
  var userEnteredFormat: js.UndefOr[CellFormat] = js.native
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.native
}

object CellData {
  @scala.inline
  def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataValidation(value: DataValidationRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveValue(value: ExtendedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPivotTable(value: PivotTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormatRuns(value: js.Array[TextFormatRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormatRuns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormatRuns")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnteredFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnteredFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withUserEnteredValue(value: ExtendedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserEnteredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEnteredValue")(js.undefined)
        ret
    }
  }
  
}

