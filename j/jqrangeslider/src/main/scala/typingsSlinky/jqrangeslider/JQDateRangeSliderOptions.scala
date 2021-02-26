package typingsSlinky.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQDateRangeSliderOptions extends JQRangeSliderOptions {
  
  var bounds: js.UndefOr[JQRangeSliderDateRange] = js.native
  
  // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderDateRange] = js.native
  
  // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  
  // customize displayed label text
  var step: js.UndefOr[JQRangeSliderDateSteps] = js.native
}
object JQDateRangeSliderOptions {
  
  @scala.inline
  def apply(): JQDateRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQDateRangeSliderOptions]
  }
  
  @scala.inline
  implicit class JQDateRangeSliderOptionsMutableBuilder[Self <: JQDateRangeSliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: JQRangeSliderDateRange): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setDefaultValues(value: JQRangeSliderDateRange): Self = StObject.set(x, "defaultValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUndefined: Self = StObject.set(x, "defaultValues", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* date */ js.Date => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setStep(value: JQRangeSliderDateSteps): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
