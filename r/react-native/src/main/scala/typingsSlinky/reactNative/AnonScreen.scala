package typingsSlinky.reactNative

import typingsSlinky.reactNative.mod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScreen extends js.Object {
  var screen: ScaledSize = js.native
  var window: ScaledSize = js.native
}

object AnonScreen {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): AnonScreen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreen]
  }
  @scala.inline
  implicit class AnonScreenOps[Self <: AnonScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreen(value: ScaledSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: ScaledSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

