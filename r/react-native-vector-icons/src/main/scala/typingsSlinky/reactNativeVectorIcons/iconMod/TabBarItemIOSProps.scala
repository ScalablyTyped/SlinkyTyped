package typingsSlinky.reactNativeVectorIcons.iconMod

import typingsSlinky.reactNative.mod.TabBarIOSItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarItemIOSProps extends TabBarIOSItemProps {
  /**
    * Color of the icon
    *
    */
  var iconColor: js.UndefOr[String] = js.native
  /**
    * Name of the default icon (similar to TabBarIOS.Item icon)
    *
    */
  var iconName: String = js.native
  /**
    * Size of the icon
    *
    * @default 30
    */
  var iconSize: js.UndefOr[Double] = js.native
  /**
    * Color of the selected icon.
    *
    * Defaults to iconColor
    *
    */
  var selectedIconColor: js.UndefOr[String] = js.native
  /**
    * Name of the selected icon (similar to TabBarIOS.Item selectedIcon)
    *
    * Defaults to iconName
    *
    */
  var selectedIconName: js.UndefOr[String] = js.native
}

object TabBarItemIOSProps {
  @scala.inline
  def apply(iconName: String): TabBarItemIOSProps = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemIOSProps]
  }
  @scala.inline
  implicit class TabBarItemIOSPropsOps[Self <: TabBarItemIOSProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconColor(value: String): Self = {
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
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIconColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIconName")(js.undefined)
        ret
    }
  }
  
}

