package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNative.mod.Insets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBottomTab extends js.Object {
  /**
    * Set the text in a badge that is overlayed over the component
    */
  var badge: js.UndefOr[String] = js.native
  /**
    * Set the background color of the badge that is overlayed over the component
    */
  var badgeColor: js.UndefOr[String] = js.native
  /**
    * Set true if you want to disable the icon tinting
    * #### (iOS specific)
    */
  var disableIconTint: js.UndefOr[Boolean] = js.native
  /**
    * Set true if you want to disable the text tinting
    * #### (iOS specific)
    */
  var disableSelectedIconTint: js.UndefOr[Boolean] = js.native
  var dotIndicator: js.UndefOr[DotIndicatorOptions] = js.native
  /**
    * Set the text font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  /**
    * Set the text font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * Set the tab icon
    */
  var icon: js.UndefOr[ImageRequireSource] = js.native
  /**
    * Set the icon tint
    */
  var iconColor: js.UndefOr[Color] = js.native
  /**
    * Set the insets of the icon
    * #### (iOS specific)
    */
  var iconInsets: js.UndefOr[Insets] = js.native
  /**
    * Set the font size for selected tabs
    * #### (Android specific)
    */
  var selectedFontSize: js.UndefOr[Double] = js.native
  /**
    * Set selected icon image
    * #### (iOS specific)
    */
  var selectedIcon: js.UndefOr[ImageRequireSource] = js.native
  /**
    * Set the selected icon tint
    */
  var selectedIconColor: js.UndefOr[Color] = js.native
  /**
    * Set the selected text color
    */
  var selectedTextColor: js.UndefOr[Color] = js.native
  /**
    * Set a testID to reference the tab in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Set the text to display below the icon
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Set the text color
    */
  var textColor: js.UndefOr[Color] = js.native
}

object OptionsBottomTab {
  @scala.inline
  def apply(): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTab]
  }
  @scala.inline
  implicit class OptionsBottomTabOps[Self <: OptionsBottomTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableIconTint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIconTint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIconTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIconTint")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSelectedIconTint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelectedIconTint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelectedIconTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelectedIconTint")(js.undefined)
        ret
    }
    @scala.inline
    def withDotIndicator(value: DotIndicatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: FontFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: FontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
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
    def withIconInsets(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconInsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconInsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconInsets")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIcon(value: ImageRequireSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIconColor(value: Color): Self = {
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
    def withSelectedTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
  }
  
}

