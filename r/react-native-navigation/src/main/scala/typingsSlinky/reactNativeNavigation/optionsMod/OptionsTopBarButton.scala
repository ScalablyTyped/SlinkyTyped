package typingsSlinky.reactNativeNavigation.optionsMod

import typingsSlinky.reactNative.mod.ImageRequireSource
import typingsSlinky.reactNativeNavigation.anon.PassProps
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.always
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.ifRoom
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.never
import typingsSlinky.reactNativeNavigation.reactNativeNavigationStrings.withText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsTopBarButton extends js.Object {
  /**
    * Set text color
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * Set the button as a custom component
    */
  var component: js.UndefOr[PassProps] = js.native
  /**
    * Disable icon tinting
    */
  var disableIconTint: js.UndefOr[Boolean] = js.native
  /**
    * Set text color in disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.native
  /**
    * Set the button enabled or disabled
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Set the button font family
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * Set the button icon
    */
  var icon: js.UndefOr[ImageRequireSource] = js.native
  /**
    * Set the button icon insets
    */
  var iconInsets: js.UndefOr[IconInsets] = js.native
  /**
    * Button id for reference press event
    */
  var id: String = js.native
  /**
    * (Android only) Set showAsAction value
    * @see {@link https://developer.android.com/guide/topics/resources/menu-resource|Android developer guide: Menu resource}
    */
  var showAsAction: js.UndefOr[ifRoom | withText | always | never] = js.native
  /**
    * (iOS only) Set the button as an iOS system icon
    */
  var systemItem: js.UndefOr[SystemItemIcon] = js.native
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Set the button text
    */
  var text: js.UndefOr[String] = js.native
}

object OptionsTopBarButton {
  @scala.inline
  def apply(id: String): OptionsTopBarButton = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarButton]
  }
  @scala.inline
  implicit class OptionsTopBarButtonOps[Self <: OptionsTopBarButton] (val x: Self) extends AnyVal {
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
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: PassProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
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
    def withDisabledColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
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
    def withIconInsets(value: IconInsets): Self = {
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
    def withShowAsAction(value: ifRoom | withText | always | never): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAsAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAsAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAsAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemItem(value: SystemItemIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemItem")(js.undefined)
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
  }
  
}

