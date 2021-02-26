package typingsSlinky.emberData.mod

import typingsSlinky.emberData.mod.DS.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberControllerAugmentingMod {
  
  @js.native
  trait Controller extends StObject {
    
    var store: Store = js.native
  }
  object Controller {
    
    @scala.inline
    def apply(store: Store): Controller = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controller]
    }
    
    @scala.inline
    implicit class ControllerMutableBuilder[Self <: Controller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
