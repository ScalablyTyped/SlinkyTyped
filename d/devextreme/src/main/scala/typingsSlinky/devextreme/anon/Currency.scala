package typingsSlinky.devextreme.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends _format {
  
  var currency: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[js.Function1[/* value */ Double | js.Date, String]] = js.native
  
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | js.Date]] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.native
}
object Currency {
  
  @scala.inline
  def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* value */ Double | js.Date => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setParser(value: /* value */ String => Double | js.Date): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setType(
      value: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
