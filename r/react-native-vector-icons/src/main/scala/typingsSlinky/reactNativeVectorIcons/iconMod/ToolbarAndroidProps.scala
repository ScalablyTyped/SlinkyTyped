package typingsSlinky.reactNativeVectorIcons.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarAndroidProps
  extends typingsSlinky.reactNative.mod.ToolbarAndroidProps {
  /**
    * Color of the icons
    *
    * @default 'black'
    */
  var iconColor: String = js.native
  /**
    * Size of the icons
    *
    * @default 24
    */
  var iconSize: Double = js.native
  /**
    * Name of the navigation logo icon
    * (similar to ToolbarAndroid logo)
    *
    */
  var logoName: String = js.native
  /**
    * Name of the navigation icon
    * (similar to ToolbarAndroid navIcon)
    *
    */
  var navIconName: String = js.native
  /**
    * Name of the overflow icon
    * (similar to ToolbarAndroid overflowIcon)
    *
    */
  var overflowIconName: String = js.native
}

object ToolbarAndroidProps {
  @scala.inline
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal(iconColor = iconColor.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], logoName = logoName.asInstanceOf[js.Any], navIconName = navIconName.asInstanceOf[js.Any], overflowIconName = overflowIconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
  @scala.inline
  implicit class ToolbarAndroidPropsOps[Self <: ToolbarAndroidProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navIconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowIconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowIconName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

