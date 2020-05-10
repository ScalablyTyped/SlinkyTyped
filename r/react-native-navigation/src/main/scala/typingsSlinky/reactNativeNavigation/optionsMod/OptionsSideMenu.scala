package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.bezel
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.entireScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSideMenu extends js.Object {
  /**
    * Configure the left side menu
    */
  var left: js.UndefOr[SideMenuSide] = js.native
  /**
    * Configure how a user is allowed to open a drawer using gestures
    * #### (iOS specific)
    * @default 'entireScreen'
    */
  var openGestureMode: js.UndefOr[entireScreen | bezel] = js.native
  /**
    * Configure the right side menu
    */
  var right: js.UndefOr[SideMenuSide] = js.native
}

object OptionsSideMenu {
  @scala.inline
  def apply(): OptionsSideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSideMenu]
  }
  @scala.inline
  implicit class OptionsSideMenuOps[Self <: OptionsSideMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: SideMenuSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenGestureMode(value: entireScreen | bezel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openGestureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenGestureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openGestureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: SideMenuSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

