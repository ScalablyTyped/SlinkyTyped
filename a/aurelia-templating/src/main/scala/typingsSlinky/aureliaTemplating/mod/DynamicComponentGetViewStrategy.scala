package typingsSlinky.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicComponentGetViewStrategy extends StObject {
  
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): String | ViewStrategy_ = js.native
}
object DynamicComponentGetViewStrategy {
  
  @scala.inline
  def apply(getViewStrategy: () => String | ViewStrategy_): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = js.Any.fromFunction0(getViewStrategy))
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
  
  @scala.inline
  implicit class DynamicComponentGetViewStrategyMutableBuilder[Self <: DynamicComponentGetViewStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetViewStrategy(value: () => String | ViewStrategy_): Self = StObject.set(x, "getViewStrategy", js.Any.fromFunction0(value))
  }
}
