package typingsSlinky.navigationReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait StateNavigator extends StObject {
    
    var stateNavigator: typingsSlinky.navigation.mod.StateNavigator = js.native
  }
  object StateNavigator {
    
    @scala.inline
    def apply(stateNavigator: typingsSlinky.navigation.mod.StateNavigator): StateNavigator = {
      val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateNavigator]
    }
    
    @scala.inline
    implicit class StateNavigatorMutableBuilder[Self <: StateNavigator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStateNavigator(value: typingsSlinky.navigation.mod.StateNavigator): Self = StObject.set(x, "stateNavigator", value.asInstanceOf[js.Any])
    }
  }
}
