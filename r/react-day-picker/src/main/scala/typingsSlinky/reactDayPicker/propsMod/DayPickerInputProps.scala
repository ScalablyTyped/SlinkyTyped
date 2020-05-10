package typingsSlinky.reactDayPicker.propsMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.reactDayPicker.commonMod.DayModifiers
import typingsSlinky.reactDayPicker.commonMod.InputClassNames
import typingsSlinky.reactDayPicker.dayPickerInputMod.DayPickerInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayPickerInputProps extends js.Object {
  var classNames: js.UndefOr[InputClassNames] = js.native
  var clickUnselectsDay: js.UndefOr[Boolean] = js.native
  // Not sure React.ComponentClass<any> is the right type for _propTypes2.default.any
  var component: js.UndefOr[js.Any] = js.native
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  var format: js.UndefOr[String | js.Array[String]] = js.native
  var formatDate: js.UndefOr[
    js.Function3[/* date */ js.Date, /* format */ String, /* locale */ String, String]
  ] = js.native
  var hideOnDayClick: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[js.Object] = js.native
  var keepFocus: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onDayChange: js.UndefOr[
    js.Function3[
      /* day */ js.Date, 
      /* DayModifiers */ DayModifiers, 
      /* dayPickerInput */ DayPickerInput, 
      Unit
    ]
  ] = js.native
  var onDayPickerHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onDayPickerShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
  var overlayComponent: js.UndefOr[js.Any] = js.native
  var parseDate: js.UndefOr[
    js.Function3[/* str */ String, /* format */ String, /* locale */ String, js.Date | Unit]
  ] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var showOverlay: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | js.Date] = js.native
}

object DayPickerInputProps {
  @scala.inline
  def apply(): DayPickerInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerInputProps]
  }
  @scala.inline
  implicit class DayPickerInputPropsOps[Self <: DayPickerInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassNames(value: InputClassNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withClickUnselectsDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickUnselectsDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickUnselectsDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickUnselectsDay")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: js.Any): Self = {
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
    def withDayPickerProps(value: DayPickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatDate(value: (/* date */ js.Date, /* format */ String, /* locale */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormatDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatDate")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnDayClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnDayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnDayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnDayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
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
    def withOnDayChange(
      value: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ DayPickerInput) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnDayChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayPickerHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPickerHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDayPickerHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPickerHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayPickerShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPickerShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDayPickerShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPickerShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDate(value: (/* str */ String, /* format */ String, /* locale */ String) => js.Date | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutParseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

