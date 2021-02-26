package typingsSlinky.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerCustomFormatOptions extends StObject {
  
  var toDisplay: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, String]
  ] = js.native
  
  var toValue: js.UndefOr[
    js.Function3[/* date */ String, /* format */ js.Any, /* language */ js.Any, js.Date]
  ] = js.native
}
object DatepickerCustomFormatOptions {
  
  @scala.inline
  def apply(): DatepickerCustomFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerCustomFormatOptions]
  }
  
  @scala.inline
  implicit class DatepickerCustomFormatOptionsMutableBuilder[Self <: DatepickerCustomFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToDisplay(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => String): Self = StObject.set(x, "toDisplay", js.Any.fromFunction3(value))
    
    @scala.inline
    def setToDisplayUndefined: Self = StObject.set(x, "toDisplay", js.undefined)
    
    @scala.inline
    def setToValue(value: (/* date */ String, /* format */ js.Any, /* language */ js.Any) => js.Date): Self = StObject.set(x, "toValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
