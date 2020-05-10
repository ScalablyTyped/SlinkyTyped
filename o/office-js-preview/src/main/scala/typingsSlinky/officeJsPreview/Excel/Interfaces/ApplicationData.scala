package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.CalculationMode
import typingsSlinky.officeJsPreview.Excel.CalculationState
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.AutomaticExceptTables
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Calculating
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Done
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Manual
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `application.toJSON()`. */
@js.native
trait ApplicationData extends js.Object {
  /**
    *
    * Returns the Excel calculation engine version used for the last full recalculation. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[Double] = js.native
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[CalculationMode | Automatic | AutomaticExceptTables | Manual] = js.native
  /**
    *
    * Returns the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationState: js.UndefOr[CalculationState | Done | Calculating | Pending] = js.native
  /**
    *
    * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var cultureInfo: js.UndefOr[CultureInfoData] = js.native
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var decimalSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Returns the Iterative Calculation settings.
    In Excel on Windows and Mac, the settings will apply to the Excel Application.
    In Excel on the web and other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi 1.9]
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on Excel's local settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var thousandsSeparator: js.UndefOr[String] = js.native
  /**
    *
    * Specifies whether the system separators of Microsoft Excel are enabled.
    System separators include the decimal separator and thousands separator.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useSystemSeparators: js.UndefOr[Boolean] = js.native
}

object ApplicationData {
  @scala.inline
  def apply(): ApplicationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationData]
  }
  @scala.inline
  implicit class ApplicationDataOps[Self <: ApplicationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculationEngineVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationEngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculationEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationEngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculationMode(value: CalculationMode | Automatic | AutomaticExceptTables | Manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculationState(value: CalculationState | Done | Calculating | Pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationState")(js.undefined)
        ret
    }
    @scala.inline
    def withCultureInfo(value: CultureInfoData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cultureInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCultureInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cultureInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIterativeCalculation(value: IterativeCalculationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterativeCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterativeCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterativeCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSystemSeparators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSystemSeparators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSystemSeparators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSystemSeparators")(js.undefined)
        ret
    }
  }
  
}

