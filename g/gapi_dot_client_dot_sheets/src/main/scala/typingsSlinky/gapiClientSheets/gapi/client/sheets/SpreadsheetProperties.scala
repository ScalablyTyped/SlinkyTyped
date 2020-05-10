package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetProperties extends js.Object {
  /** The amount of time to wait before volatile functions are recalculated. */
  var autoRecalc: js.UndefOr[String] = js.native
  /**
    * The default format of all cells in the spreadsheet.
    * CellData.effectiveFormat will not be set if
    * the cell's format is equal to this default format. This field is read-only.
    */
  var defaultFormat: js.UndefOr[CellFormat] = js.native
  /**
    * Determines whether and how circular references are resolved with iterative
    * calculation.  Absence of this field means that circular references result
    * in calculation errors.
    */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.native
  /**
    * The locale of the spreadsheet in one of the following formats:
    *
    * &#42; an ISO 639-1 language code such as `en`
    *
    * &#42; an ISO 639-2 language code such as `fil`, if no 639-1 code exists
    *
    * &#42; a combination of the ISO language code and country code, such as `en_US`
    *
    * Note: when updating this field, not all locales/languages are supported.
    */
  var locale: js.UndefOr[String] = js.native
  /** Theme applied to the spreadsheet. */
  var spreadsheetTheme: js.UndefOr[SpreadsheetTheme] = js.native
  /**
    * The time zone of the spreadsheet, in CLDR format such as
    * `America/New_York`. If the time zone isn't recognized, this may
    * be a custom time zone such as `GMT-07:00`.
    */
  var timeZone: js.UndefOr[String] = js.native
  /** The title of the spreadsheet. */
  var title: js.UndefOr[String] = js.native
}

object SpreadsheetProperties {
  @scala.inline
  def apply(): SpreadsheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetProperties]
  }
  @scala.inline
  implicit class SpreadsheetPropertiesOps[Self <: SpreadsheetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRecalc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRecalc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRecalc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRecalc")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFormat(value: CellFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withIterativeCalculationSettings(value: IterativeCalculationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterativeCalculationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterativeCalculationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterativeCalculationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetTheme(value: SpreadsheetTheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

