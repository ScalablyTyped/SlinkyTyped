package typingsSlinky.excelStyleDataformatter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalesOptions extends js.Object {
  var days: js.Array[String] = js.native
  var daysShort: js.Array[String] = js.native
  var decimalSeparator: String = js.native
  var formats: StringDictionary[String] = js.native
  var months: js.Array[String] = js.native
  var monthsShort: js.Array[String] = js.native
  var name: String = js.native
  var thousandSeparator: String = js.native
}

object LocalesOptions {
  @scala.inline
  def apply(
    days: js.Array[String],
    daysShort: js.Array[String],
    decimalSeparator: String,
    formats: StringDictionary[String],
    months: js.Array[String],
    monthsShort: js.Array[String],
    name: String,
    thousandSeparator: String
  ): LocalesOptions = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysShort = daysShort.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalesOptions]
  }
  @scala.inline
  implicit class LocalesOptionsOps[Self <: LocalesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormats(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthsShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousandSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

