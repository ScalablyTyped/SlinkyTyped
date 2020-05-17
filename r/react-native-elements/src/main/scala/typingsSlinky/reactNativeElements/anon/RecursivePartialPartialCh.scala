package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.CheckBoxProps>> */
@js.native
trait RecursivePartialPartialCh extends js.Object {
  var Component: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]] = js.native
  var center: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var checked: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var checkedColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var checkedIcon: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  var checkedTitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var fontFamily: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var iconRight: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var iconType: js.UndefOr[RecursivePartial[js.UndefOr[IconType]]] = js.native
  var onIconPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLongIconPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onLongPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var right: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var size: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var title: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  var titleProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialTextProperties]]] = js.native
  var uncheckedColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var uncheckedIcon: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  var wrapperStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
}

object RecursivePartialPartialCh {
  @scala.inline
  def apply(): RecursivePartialPartialCh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialCh]
  }
  @scala.inline
  implicit class RecursivePartialPartialChOps[Self <: RecursivePartialPartialCh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[js.Object]]]): Self = {
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
    def withCenter(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withChecked(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withCheckedColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withCheckedIcon(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
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
    def withCheckedTitle(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withFontFamily(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withIconRight(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withIconType(value: RecursivePartial[js.UndefOr[IconType]]): Self = {
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
    def withOnIconPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnIconPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIconPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongIconPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongIconPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLongIconPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongIconPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withSize(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
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
    def withTitle(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
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
    def withTitleProps(value: RecursivePartial[js.UndefOr[PartialTextProperties]]): Self = {
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
    def withUncheckedColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withUncheckedIcon(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
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
    def withWrapperStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
  }
  
}

