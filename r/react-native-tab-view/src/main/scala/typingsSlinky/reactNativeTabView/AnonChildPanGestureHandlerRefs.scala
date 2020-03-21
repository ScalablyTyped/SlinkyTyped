package typingsSlinky.reactNativeTabView

import slinky.core.facade.ReactRef
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildPanGestureHandlerRefs extends js.Object {
  var childPanGestureHandlerRefs: js.Array[ReactRef[PanGestureHandler]]
  var enabled: Boolean
}

object AnonChildPanGestureHandlerRefs {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[ReactRef[PanGestureHandler]], enabled: Boolean): AnonChildPanGestureHandlerRefs = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildPanGestureHandlerRefs]
  }
}

