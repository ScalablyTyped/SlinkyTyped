package typingsSlinky.oracleOraclejet.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeMonth extends StObject {
  
  var changeMonth: select | none = js.native
  
  var changeYear: select | none = js.native
  
  var currentMonthPos: Double = js.native
  
  var daysOutsideMonth: hidden | visible | selectable = js.native
  
  var footerLayout: _empty | today = js.native
  
  var numberOfMonths: Double = js.native
  
  var showOn: focus | image = js.native
  
  var stepBigMonths: Double = js.native
  
  var stepMonths: numberOfMonths | Double = js.native
  
  var weekDisplay: number | none = js.native
  
  var yearRange: String = js.native
}
object ChangeMonth {
  
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
  ): ChangeMonth = {
    val __obj = js.Dynamic.literal(changeMonth = changeMonth.asInstanceOf[js.Any], changeYear = changeYear.asInstanceOf[js.Any], currentMonthPos = currentMonthPos.asInstanceOf[js.Any], daysOutsideMonth = daysOutsideMonth.asInstanceOf[js.Any], footerLayout = footerLayout.asInstanceOf[js.Any], numberOfMonths = numberOfMonths.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], stepBigMonths = stepBigMonths.asInstanceOf[js.Any], stepMonths = stepMonths.asInstanceOf[js.Any], weekDisplay = weekDisplay.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonth]
  }
  
  @scala.inline
  implicit class ChangeMonthMutableBuilder[Self <: ChangeMonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeMonth(value: select | none): Self = StObject.set(x, "changeMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeYear(value: select | none): Self = StObject.set(x, "changeYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMonthPos(value: Double): Self = StObject.set(x, "currentMonthPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOutsideMonth(value: hidden | visible | selectable): Self = StObject.set(x, "daysOutsideMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterLayout(value: _empty | today): Self = StObject.set(x, "footerLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOn(value: focus | image): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepBigMonths(value: Double): Self = StObject.set(x, "stepBigMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMonths(value: numberOfMonths | Double): Self = StObject.set(x, "stepMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekDisplay(value: number | none): Self = StObject.set(x, "weekDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
  }
}
