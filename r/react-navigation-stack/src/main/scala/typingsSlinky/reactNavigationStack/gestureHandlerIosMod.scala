package typingsSlinky.reactNavigationStack

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerIosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureHandlerRootView")
  @js.native
  val GestureHandlerRootView: ReactComponentClass[ViewProps] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState")
  @js.native
  object GestureState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    
    /* 3 */ val ACTIVE: typingsSlinky.reactNativeGestureHandler.mod.State.ACTIVE with Double = js.native
    
    /* 1 */ val BEGAN: typingsSlinky.reactNativeGestureHandler.mod.State.BEGAN with Double = js.native
    
    /* 2 */ val CANCELLED: typingsSlinky.reactNativeGestureHandler.mod.State.CANCELLED with Double = js.native
    
    /* 4 */ val END: typingsSlinky.reactNativeGestureHandler.mod.State.END with Double = js.native
    
    /* 0 */ val FAILED: typingsSlinky.reactNativeGestureHandler.mod.State.FAILED with Double = js.native
    
    /* 0 */ val UNDETERMINED: typingsSlinky.reactNativeGestureHandler.mod.State.UNDETERMINED with Double = js.native
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "PanGestureHandler")
  @js.native
  def PanGestureHandler(props: PanGestureHandlerProperties): ReactElement = js.native
}
