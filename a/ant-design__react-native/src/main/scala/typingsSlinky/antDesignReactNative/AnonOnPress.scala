package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnPress extends js.Object {
  var mode: String = js.native
  def onPress(): Unit = js.native
}

object AnonOnPress {
  @scala.inline
  def apply(mode: String, onPress: () => Unit): AnonOnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[AnonOnPress]
  }
  @scala.inline
  implicit class AnonOnPressOps[Self <: AnonOnPress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

