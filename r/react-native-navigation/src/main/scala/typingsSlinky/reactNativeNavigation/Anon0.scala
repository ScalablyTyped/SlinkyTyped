package typingsSlinky.reactNativeNavigation

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  var touchableComponent: Instantiable0[TouchableWithoutFeedback] = js.native
}

object Anon0 {
  @scala.inline
  def apply(touchableComponent: Instantiable0[TouchableWithoutFeedback]): Anon0 = {
    val __obj = js.Dynamic.literal(touchableComponent = touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchableComponent(value: Instantiable0[TouchableWithoutFeedback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

