package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeViewGestureHandlerEventExtra extends js.Object {
  var pointerInside: Boolean = js.native
}

object NativeViewGestureHandlerEventExtra {
  @scala.inline
  def apply(pointerInside: Boolean): NativeViewGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(pointerInside = pointerInside.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class NativeViewGestureHandlerEventExtraOps[Self <: NativeViewGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPointerInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerInside")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

