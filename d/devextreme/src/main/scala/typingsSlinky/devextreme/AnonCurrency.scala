package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.billions
import typingsSlinky.devextreme.devextremeStrings.currency
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.dayOfWeek
import typingsSlinky.devextreme.devextremeStrings.decimal_
import typingsSlinky.devextreme.devextremeStrings.exponential
import typingsSlinky.devextreme.devextremeStrings.fixedPoint
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.largeNumber
import typingsSlinky.devextreme.devextremeStrings.longDate
import typingsSlinky.devextreme.devextremeStrings.longDateLongTime
import typingsSlinky.devextreme.devextremeStrings.longTime
import typingsSlinky.devextreme.devextremeStrings.millions
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.monthAndDay
import typingsSlinky.devextreme.devextremeStrings.monthAndYear
import typingsSlinky.devextreme.devextremeStrings.percent
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.quarterAndYear
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.shortDate
import typingsSlinky.devextreme.devextremeStrings.shortDateShortTime
import typingsSlinky.devextreme.devextremeStrings.shortTime
import typingsSlinky.devextreme.devextremeStrings.thousands
import typingsSlinky.devextreme.devextremeStrings.trillions
import typingsSlinky.devextreme.devextremeStrings.year
import typingsSlinky.devextreme.mod.DevExpress.ui._format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrency extends _format {
  var currency: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[js.Function1[/* value */ Double | js.Date, String]] = js.native
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | js.Date]] = js.native
  var precision: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.native
}

object AnonCurrency {
  @scala.inline
  def apply(): AnonCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrency]
  }
  @scala.inline
  implicit class AnonCurrencyOps[Self <: AnonCurrency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withParser(value: /* value */ String => Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

