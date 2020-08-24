package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.View
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", JSImport.Namespace)
@js.native
object gestureHandlerMod extends js.Object {
  @js.native
  class GestureHandlerRootView () extends View
  
  val PanGestureHandler: ReactComponentClass[PanGestureHandlerProperties] = js.native
  @js.native
  object GestureHandlerRootView extends Instantiable0[View] {
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    var forceTouchAvailable: Boolean = js.native
  }
  
  @js.native
  object GestureState extends js.Object {
    var ACTIVE: Double = js.native
    var BEGAN: Double = js.native
    var CANCELLED: Double = js.native
    var END: Double = js.native
    var FAILED: Double = js.native
    var UNDETERMINED: Double = js.native
  }
  
}

