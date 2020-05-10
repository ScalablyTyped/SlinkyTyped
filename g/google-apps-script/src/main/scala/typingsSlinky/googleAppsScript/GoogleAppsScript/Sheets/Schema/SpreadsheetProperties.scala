package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetProperties extends js.Object {
  var autoRecalc: js.UndefOr[String] = js.native
  var defaultFormat: js.UndefOr[CellFormat] = js.native
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.native
  var locale: js.UndefOr[String] = js.native
  var timeZone: js.UndefOr[String] = js.native
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

