package typingsSlinky.reactNativeDrawer.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerStyles extends NestedViewStyles {
  var drawer: js.UndefOr[ViewStyle] = js.native
}

object DrawerStyles {
  @scala.inline
  def apply(): DrawerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerStyles]
  }
  @scala.inline
  implicit class DrawerStylesOps[Self <: DrawerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(js.undefined)
        ret
    }
  }
  
}

