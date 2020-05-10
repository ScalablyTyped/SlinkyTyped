package typingsSlinky.reactNativeShare.overlayMod

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayState extends js.Object {
  var fadeAnim: Value = js.native
  var overlayStyle: StyleProp[ViewProps] = js.native
}

object OverlayState {
  @scala.inline
  def apply(fadeAnim: Value): OverlayState = {
    val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayState]
  }
  @scala.inline
  implicit class OverlayStateOps[Self <: OverlayState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFadeAnim(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeAnim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayStyle(value: StyleProp[ViewProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(null)
        ret
    }
  }
  
}

