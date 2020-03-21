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

trait AnonCurrency extends _format {
  var currency: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* value */ Double | js.Date, String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | js.Date]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.undefined
}

object AnonCurrency {
  @scala.inline
  def apply(
    currency: String = null,
    formatter: /* value */ Double | js.Date => String = null,
    parser: /* value */ String => Double | js.Date = null,
    precision: Int | Double = null,
    `type`: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime = null
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

