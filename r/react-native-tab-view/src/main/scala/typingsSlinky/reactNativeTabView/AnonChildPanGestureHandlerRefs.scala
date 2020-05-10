package typingsSlinky.reactNativeTabView

import slinky.core.facade.ReactRef
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildPanGestureHandlerRefs extends js.Object {
  var childPanGestureHandlerRefs: js.Array[ReactRef[PanGestureHandler]] = js.native
  var enabled: Boolean = js.native
}

object AnonChildPanGestureHandlerRefs {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[ReactRef[PanGestureHandler]], enabled: Boolean): AnonChildPanGestureHandlerRefs = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildPanGestureHandlerRefs]
  }
  @scala.inline
  implicit class AnonChildPanGestureHandlerRefsOps[Self <: AnonChildPanGestureHandlerRefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildPanGestureHandlerRefs(value: js.Array[ReactRef[PanGestureHandler]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPanGestureHandlerRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

