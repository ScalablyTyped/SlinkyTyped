package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.bottom
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.left
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.right
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsFab extends js.Object {
  var actions: js.UndefOr[js.Array[OptionsFab]] = js.native
  var alignHorizontally: js.UndefOr[left | right] = js.native
  var alignVertically: js.UndefOr[top | bottom] = js.native
  var backgroundColor: js.UndefOr[Color] = js.native
  var clickColor: js.UndefOr[Color] = js.native
  var hideOnScroll: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ImageRequireSource] = js.native
  var iconColor: js.UndefOr[Color] = js.native
  var id: String = js.native
  var rippleColor: js.UndefOr[Color] = js.native
  var size: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsFab {
  @scala.inline
  def apply(id: String): OptionsFab = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsFab]
  }
  @scala.inline
  implicit class OptionsFabOps[Self <: OptionsFab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[OptionsFab]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignHorizontally(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignHorizontally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignHorizontally")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignVertically(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClickColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: ImageRequireSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

