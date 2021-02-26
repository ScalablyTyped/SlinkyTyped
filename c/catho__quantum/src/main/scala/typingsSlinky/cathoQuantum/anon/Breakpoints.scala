package typingsSlinky.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakpoints extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.native
  
  var breakpoints: js.UndefOr[js.Object] = js.native
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[ButtonObject] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object Breakpoints {
  
  @scala.inline
  def apply(): Breakpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakpoints]
  }
  
  @scala.inline
  implicit class BreakpointsMutableBuilder[Self <: Breakpoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setComponents(value: ButtonObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
