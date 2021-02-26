package typingsSlinky.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateOptions extends StObject {
  
  var american: js.UndefOr[Boolean] = js.native
  
  var day: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[js.Date] = js.native
  
  var min: js.UndefOr[js.Date] = js.native
  
  var month: js.UndefOr[Double] = js.native
  
  var string: js.UndefOr[Boolean] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object DateOptions {
  
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  
  @scala.inline
  implicit class DateOptionsMutableBuilder[Self <: DateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmerican(value: Boolean): Self = StObject.set(x, "american", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmericanUndefined: Self = StObject.set(x, "american", js.undefined)
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
