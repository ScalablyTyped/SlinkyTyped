package typingsSlinky.reactNativeDatepicker.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps extends js.Object {
  var TouchableComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var androidMode: js.UndefOr[
    typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
  ] = js.native
  var cancelBtnTestID: js.UndefOr[String] = js.native
  var cancelBtnText: js.UndefOr[String] = js.native
  var confirmBtnTestID: js.UndefOr[String] = js.native
  var confirmBtnText: js.UndefOr[String] = js.native
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.native
  var date: js.UndefOr[String | js.Date | Moment] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var format: js.UndefOr[String] = js.native
  var getDateStr: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var hideText: js.UndefOr[Boolean] = js.native
  var iconComponent: js.UndefOr[ReactElement] = js.native
  var iconSource: js.UndefOr[ImageURISource] = js.native
  var is24Hour: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[String | js.Date] = js.native
  var minDate: js.UndefOr[String | js.Date] = js.native
  var minuteInterval: js.UndefOr[Double] = js.native
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.native
  var mode: js.UndefOr[date | datetime | time] = js.native
  var onCloseModal: js.UndefOr[js.Function0[Unit]] = js.native
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ String, /* date */ js.Date, Unit]] = js.native
  var onOpenModal: js.UndefOr[js.Function0[Unit]] = js.native
  var onPressMask: js.UndefOr[js.Function0[Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[_]] = js.native
  var testID: js.UndefOr[String] = js.native
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouchableComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchableComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchableComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidMode(
      value: typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelBtnTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnTestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelBtnTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnTestID")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmBtnTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmBtnTestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmBtnTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmBtnTestID")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmBtnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyles(value: DatePickerCustomStylesProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String | js.Date | Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withGetDateStr(value: /* date */ js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDateStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateStr")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideText")(js.undefined)
        ret
    }
    @scala.inline
    def withIconComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSource(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIs24Hour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is24Hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs24Hour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is24Hour")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withModalOnResponderTerminationRequest(value: /* e */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalOnResponderTerminationRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModalOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalOnResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: date | datetime | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseModal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCloseModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseModal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDateChange(value: (/* dateStr */ String, /* date */ js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenModal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpenModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenModal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressMask(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressMask")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPressMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressMask")(js.undefined)
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
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
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
    def withTimeZoneOffsetInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneOffsetInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneOffsetInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneOffsetInMinutes")(js.undefined)
        ret
    }
  }
  
}

