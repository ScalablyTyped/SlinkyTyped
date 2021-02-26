package typingsSlinky.emberData.mod

import typingsSlinky.emberData.mod.DS.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberRoutingRouteAugmentingMod {
  
  @js.native
  trait Route extends StObject {
    
    var store: Store = js.native
  }
  object Route {
    
    @scala.inline
    def apply(store: Store): Route = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
