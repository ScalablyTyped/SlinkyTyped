package typingsSlinky.reachRouter.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationProviderProps extends StObject {
  
  var children: js.UndefOr[ReactElement | LocationProviderRenderFn] = js.native
  
  var history: js.UndefOr[History] = js.native
}
object LocationProviderProps {
  
  @scala.inline
  def apply(): LocationProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationProviderProps]
  }
  
  @scala.inline
  implicit class LocationProviderPropsMutableBuilder[Self <: LocationProviderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement | LocationProviderRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* context */ LocationContext => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
  }
}
