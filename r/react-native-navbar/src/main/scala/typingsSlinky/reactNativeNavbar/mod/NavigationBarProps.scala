package typingsSlinky.reactNativeNavbar.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarProps extends js.Object {
  var leftButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.native
  var rightButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.native
  var statusBar: js.UndefOr[StatusBar] = js.native
  var style: js.UndefOr[ViewStyle] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: js.UndefOr[NavigationBarTitle | ReactElement | Null] = js.native
}

object NavigationBarProps {
  @scala.inline
  def apply(): NavigationBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarProps]
  }
  @scala.inline
  implicit class NavigationBarPropsOps[Self <: NavigationBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftButton(value: NavigationBarButton | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(null)
        ret
    }
    @scala.inline
    def withRightButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightButton(value: NavigationBarButton | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(null)
        ret
    }
    @scala.inline
    def withStatusBar(value: StatusBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: NavigationBarTitle | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

