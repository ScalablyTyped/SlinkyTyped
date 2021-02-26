package typingsSlinky.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentsSpacing extends StObject {
  
  var baseFontSize: js.UndefOr[Double] = js.native
  
  var breakpoints: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[TabbedView] = js.native
  
  var spacing: js.UndefOr[js.Object] = js.native
}
object ComponentsSpacing {
  
  @scala.inline
  def apply(): ComponentsSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsSpacing]
  }
  
  @scala.inline
  implicit class ComponentsSpacingMutableBuilder[Self <: ComponentsSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFontSize(value: Double): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
    
    @scala.inline
    def setBreakpoints(value: js.Object): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setComponents(value: TabbedView): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setSpacing(value: js.Object): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
