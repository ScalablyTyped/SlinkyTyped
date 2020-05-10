package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.protonNativeStrings.About
import typingsSlinky.protonNative.protonNativeStrings.Check
import typingsSlinky.protonNative.protonNativeStrings.Item
import typingsSlinky.protonNative.protonNativeStrings.Preferences
import typingsSlinky.protonNative.protonNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends js.Object {
  /**
    * If the type is `Check`, then set whether it is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * The text to display for the menu item.
    */
  var children: js.UndefOr[String] = js.native
  /**
    * Called when the menu item is clicked. If the type is `Check`, then it passes whether it is checked as an argument.
    */
  var onClick: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  /**
    * How the menu item is displayed.
    *
    * - `Check` - a checkable option in the menu.
    * - `Quit` - a Quit button. This accepts no text.
    * - `About` - an About button. This accepts no text.
    * - `Preferences` - a Preferences button. This accepts no text.
    * - `Separator` - a Separator between menu items. This accepts no text.
    * - `Item` - a normal menu button. This is the default.
    */
  var `type`: js.UndefOr[
    Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item
  ] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* checked */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: Check | Quit | About | Preferences | typingsSlinky.protonNative.protonNativeStrings.Separator | Item
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

