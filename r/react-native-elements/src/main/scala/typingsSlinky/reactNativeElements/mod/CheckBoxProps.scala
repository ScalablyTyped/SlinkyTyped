package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.PartialTextProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBoxProps extends js.Object {
  /**
    *  Specify React Native component for main button
    */
  var Component: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  /**
    * Aligns checkbox to center
    *
    *  @default false
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Flag for checking the icon
    *
    * @default false
    */
  var checked: Boolean = js.native
  /**
    * Default checked color
    *
    * @default 'green'
    */
  var checkedColor: js.UndefOr[String] = js.native
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'check-square-o'
    */
  var checkedIcon: js.UndefOr[String | ReactElement] = js.native
  /**
    * Specify a custom checked message
    */
  var checkedTitle: js.UndefOr[String] = js.native
  /**
    * Style of main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Specify different font family
    * @default 'System font bold (iOS)'
    * @default 'Sans Serif Bold (android)'
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * Moves icon to right of text.
    *
    * @default false
    */
  var iconRight: js.UndefOr[Boolean] = js.native
  /**
    * Icon family, can be one of the following
    * (required only if specifying an icon that is not from font-awesome)
    */
  var iconType: js.UndefOr[IconType] = js.native
  /**
    * onPress function for checkbox
    */
  var onIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * onLongPress function for checkbox
    */
  var onLongIconPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * onLongPress function for checkbox
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * onPress function for container
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Aligns checkbox to right
    *
    * @default false
    */
  var right: js.UndefOr[Boolean] = js.native
  /**
    * Size of the checkbox
    *
    * @default 24
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * style of text
    */
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Title of checkbox
    */
  var title: js.UndefOr[String | ReactElement] = js.native
  /**
    * Additional props for the title
    */
  var titleProps: js.UndefOr[PartialTextProperties] = js.native
  /**
    * Default unchecked color
    * @default '#bfbfbf'
    */
  var uncheckedColor: js.UndefOr[String] = js.native
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'square-o'
    */
  var uncheckedIcon: js.UndefOr[String | ReactElement] = js.native
  /**
    * Style of container that wraps the check box and text
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object CheckBoxProps {
  @scala.inline
  def apply(checked: Boolean): CheckBoxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  @scala.inline
  implicit class CheckBoxPropsOps[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
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
    def withComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Component")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedIcon(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
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
    def withIconRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconType(value: IconType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIconPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnIconPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongIconPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongIconPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLongIconPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongIconPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Boolean): Self = {
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
    def withTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(null)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String | ReactElement): Self = {
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
    def withTitleProps(value: PartialTextProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncheckedIcon(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(null)
        ret
    }
  }
  
}

