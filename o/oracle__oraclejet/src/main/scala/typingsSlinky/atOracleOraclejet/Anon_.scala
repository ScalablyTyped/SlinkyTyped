package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings._empty
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.image
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.number
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.numberOfMonths
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.select
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.selectable
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.today
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var changeMonth: select | none
  var changeYear: select | none
  var currentMonthPos: Double
  var daysOutsideMonth: hidden | visible | selectable
  var footerLayout: _empty | today
  var numberOfMonths: Double
  var showOn: focus | image
  var stepBigMonths: Double
  var stepMonths: numberOfMonths | Double
  var weekDisplay: number | none
  var yearRange: String
}

object Anon_ {
  @scala.inline
  def apply(
    changeMonth: select | none,
    changeYear: select | none,
    currentMonthPos: Double,
    daysOutsideMonth: hidden | visible | selectable,
    footerLayout: _empty | today,
    numberOfMonths: Double,
    showOn: focus | image,
    stepBigMonths: Double,
    stepMonths: numberOfMonths | Double,
    weekDisplay: number | none,
    yearRange: String
  ): Anon_ = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_]
  }
}

