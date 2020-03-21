package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings._empty
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.numberOfMonths
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.select
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.today
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangeMonth extends js.Object {
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

object AnonChangeMonth {
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
  ): AnonChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChangeMonth]
  }
}

