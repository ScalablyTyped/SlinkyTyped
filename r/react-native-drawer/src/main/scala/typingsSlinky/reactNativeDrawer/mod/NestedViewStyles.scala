package typingsSlinky.reactNativeDrawer.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedViewStyles extends js.Object {
  var drawerOverlay: js.UndefOr[ViewStyle] = js.native
  var main: js.UndefOr[ViewStyle] = js.native
  var mainOverlay: js.UndefOr[ViewStyle] = js.native
}

object NestedViewStyles {
  @scala.inline
  def apply(): NestedViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedViewStyles]
  }
  @scala.inline
  implicit class NestedViewStylesOps[Self <: NestedViewStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerOverlay(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withMain(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(js.undefined)
        ret
    }
    @scala.inline
    def withMainOverlay(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainOverlay")(js.undefined)
        ret
    }
  }
  
}

