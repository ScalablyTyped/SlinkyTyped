package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangAccessibilityAxisOptions extends js.Object {
  var rangeCategories: js.UndefOr[String] = js.native
  var rangeFromTo: js.UndefOr[String] = js.native
  var timeRangeDays: js.UndefOr[String] = js.native
  var timeRangeHours: js.UndefOr[String] = js.native
  var timeRangeMinutes: js.UndefOr[String] = js.native
  var timeRangeSeconds: js.UndefOr[String] = js.native
  var xAxisDescriptionPlural: js.UndefOr[String] = js.native
  var xAxisDescriptionSingular: js.UndefOr[String] = js.native
  var yAxisDescriptionPlural: js.UndefOr[String] = js.native
  var yAxisDescriptionSingular: js.UndefOr[String] = js.native
}

object LangAccessibilityAxisOptions {
  @scala.inline
  def apply(): LangAccessibilityAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityAxisOptions]
  }
  @scala.inline
  implicit class LangAccessibilityAxisOptionsOps[Self <: LangAccessibilityAxisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeCategories(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeFromTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeFromTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeFromTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeFromTo")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeDays(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeDays")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeHours(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeHours")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeMinutes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRangeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRangeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRangeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisDescriptionPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescriptionPlural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisDescriptionPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescriptionPlural")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxisDescriptionSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescriptionSingular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisDescriptionSingular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisDescriptionSingular")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisDescriptionPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescriptionPlural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisDescriptionPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescriptionPlural")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisDescriptionSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescriptionSingular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisDescriptionSingular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisDescriptionSingular")(js.undefined)
        ret
    }
  }
  
}

