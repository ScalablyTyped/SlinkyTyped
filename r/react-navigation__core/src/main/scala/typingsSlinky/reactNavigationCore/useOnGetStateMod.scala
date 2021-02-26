package typingsSlinky.reactNavigationCore

import typingsSlinky.reactNavigationCore.navigationBuilderContextMod.GetStateListener
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOnGetStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnGetState", JSImport.Default)
  @js.native
  def default(hasGetStateGetStateListeners: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    def getState(): NavigationState[ParamListBase] = js.native
    
    var getStateListeners: Record[String, js.UndefOr[GetStateListener]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      getState: () => NavigationState[ParamListBase],
      getStateListeners: Record[String, js.UndefOr[GetStateListener]]
    ): Options = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), getStateListeners = getStateListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => NavigationState[ParamListBase]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStateListeners(value: Record[String, js.UndefOr[GetStateListener]]): Self = StObject.set(x, "getStateListeners", value.asInstanceOf[js.Any])
    }
  }
}
