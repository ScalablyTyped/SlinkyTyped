package typingsSlinky.reactNativeModalDropdown.mod

import slinky.core.TagMod
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalDropdown.reactNativeModalDropdownStrings.always
import typingsSlinky.reactNativeModalDropdown.reactNativeModalDropdownStrings.handled
import typingsSlinky.reactNativeModalDropdown.reactNativeModalDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDropdownProps[T] extends ViewProps {
  var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, PositionStyle]] = js.native
  var animated: js.UndefOr[Boolean] = js.native
  var defaultIndex: js.UndefOr[Double] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dropdownTextHighlightStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var dropdownTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[always | never | handled] = js.native
  var onDropdownWillHide: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
  var onDropdownWillShow: js.UndefOr[js.Function0[Unit | Boolean]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* index */ String, /* option */ T, Unit | Boolean]] = js.native
  var options: js.UndefOr[js.Array[T]] = js.native
  var renderButtonText: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  var renderRow: js.UndefOr[
    js.Function3[/* option */ T, /* index */ String, /* isSelected */ Boolean, TagMod[Any]]
  ] = js.native
  var renderSeparator: js.UndefOr[
    js.Function3[
      /* sectionID */ String, 
      /* index */ String, 
      /* adjacentRowHighlighted */ Boolean, 
      TagMod[Any]
    ]
  ] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object ModalDropdownProps {
  @scala.inline
  def apply[T](): ModalDropdownProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDropdownProps[T]]
  }
  @scala.inline
  implicit class ModalDropdownPropsOps[Self[t] <: ModalDropdownProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdjustFrame(value: /* positionStyle */ PositionStyle => PositionStyle): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdjustFrame: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimated(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownStyle(value: StyleProp[ViewStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownStyle")(null)
        ret
    }
    @scala.inline
    def withDropdownTextHighlightStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextHighlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownTextHighlightStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextHighlightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownTextHighlightStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextHighlightStyle")(null)
        ret
    }
    @scala.inline
    def withDropdownTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownTextStyle")(null)
        ret
    }
    @scala.inline
    def withKeyboardShouldPersistTaps(value: always | never | handled): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShouldPersistTaps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShouldPersistTaps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownWillHide(value: () => Unit | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownWillHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownWillHide: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownWillHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropdownWillShow(value: () => Unit | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownWillShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDropdownWillShow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropdownWillShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* index */ String, /* option */ T) => Unit | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderButtonText(value: /* text */ String => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderButtonText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderButtonText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderRow(value: (/* option */ T, /* index */ String, /* isSelected */ Boolean) => TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRow")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRow")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSeparator(
      value: (/* sectionID */ String, /* index */ String, /* adjacentRowHighlighted */ Boolean) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSeparator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderSeparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsVerticalScrollIndicator(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsVerticalScrollIndicator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: StyleProp[TextStyle]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(null)
        ret
    }
  }
  
}

