package typingsSlinky.reactNavigationStack

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.native", JSImport.Namespace)
@js.native
object gestureHandlerNativeMod extends js.Object {
  val GestureHandlerRootView: ReactComponentClass[ViewProps] = js.native
  def PanGestureHandler(props: PanGestureHandlerProperties): ReactElement = js.native
  @js.native
  object GestureState extends js.Object {
    /* 3 */ val ACTIVE: typingsSlinky.reactNativeGestureHandler.mod.State.ACTIVE with Double = js.native
    /* 1 */ val BEGAN: typingsSlinky.reactNativeGestureHandler.mod.State.BEGAN with Double = js.native
    /* 2 */ val CANCELLED: typingsSlinky.reactNativeGestureHandler.mod.State.CANCELLED with Double = js.native
    /* 4 */ val END: typingsSlinky.reactNativeGestureHandler.mod.State.END with Double = js.native
    /* 0 */ val FAILED: typingsSlinky.reactNativeGestureHandler.mod.State.FAILED with Double = js.native
    /* 0 */ val UNDETERMINED: typingsSlinky.reactNativeGestureHandler.mod.State.UNDETERMINED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
  }
  
}

