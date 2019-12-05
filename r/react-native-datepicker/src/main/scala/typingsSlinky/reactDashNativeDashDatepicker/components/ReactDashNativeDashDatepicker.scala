package typingsSlinky.reactDashNativeDashDatepicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageURISource
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerMod.DatePickerCustomStylesProps
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerMod.DatePickerProps
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerMod.default
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.calendar
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.date
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.datetime
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.spinner
import typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashDatepicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, placeholder */
  def apply(
    TouchableComponent: ReactComponentClass[js.Object] = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    androidMode: typingsSlinky.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.default | calendar | spinner = null,
    cancelBtnTestID: String = null,
    cancelBtnText: String = null,
    confirmBtnTestID: String = null,
    confirmBtnText: String = null,
    customStyles: DatePickerCustomStylesProps = null,
    date: String | js.Date | Moment = null,
    duration: Int | Double = null,
    format: String = null,
    getDateStr: /* date */ js.Date => String = null,
    height: Int | Double = null,
    hideText: js.UndefOr[Boolean] = js.undefined,
    iconComponent: typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    iconSource: ImageURISource = null,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxDate: String | js.Date = null,
    minDate: String | js.Date = null,
    minuteInterval: Int | Double = null,
    modalOnResponderTerminationRequest: /* e */ js.Any => Boolean = null,
    mode: date | datetime | time = null,
    onCloseModal: () => Unit = null,
    onDateChange: (/* dateStr */ String, /* date */ js.Date) => Unit = null,
    onOpenModal: () => Unit = null,
    onPressMask: () => Unit = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[_] = null,
    testID: String = null,
    timeZoneOffsetInMinutes: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (TouchableComponent != null) __obj.updateDynamic("TouchableComponent")(TouchableComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (androidMode != null) __obj.updateDynamic("androidMode")(androidMode.asInstanceOf[js.Any])
    if (cancelBtnTestID != null) __obj.updateDynamic("cancelBtnTestID")(cancelBtnTestID.asInstanceOf[js.Any])
    if (cancelBtnText != null) __obj.updateDynamic("cancelBtnText")(cancelBtnText.asInstanceOf[js.Any])
    if (confirmBtnTestID != null) __obj.updateDynamic("confirmBtnTestID")(confirmBtnTestID.asInstanceOf[js.Any])
    if (confirmBtnText != null) __obj.updateDynamic("confirmBtnText")(confirmBtnText.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getDateStr != null) __obj.updateDynamic("getDateStr")(js.Any.fromFunction1(getDateStr))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideText)) __obj.updateDynamic("hideText")(hideText.asInstanceOf[js.Any])
    if (iconComponent != null) __obj.updateDynamic("iconComponent")(iconComponent.asInstanceOf[js.Any])
    if (iconSource != null) __obj.updateDynamic("iconSource")(iconSource.asInstanceOf[js.Any])
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (modalOnResponderTerminationRequest != null) __obj.updateDynamic("modalOnResponderTerminationRequest")(js.Any.fromFunction1(modalOnResponderTerminationRequest))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCloseModal != null) __obj.updateDynamic("onCloseModal")(js.Any.fromFunction0(onCloseModal))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction2(onDateChange))
    if (onOpenModal != null) __obj.updateDynamic("onOpenModal")(js.Any.fromFunction0(onOpenModal))
    if (onPressMask != null) __obj.updateDynamic("onPressMask")(js.Any.fromFunction0(onPressMask))
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (timeZoneOffsetInMinutes != null) __obj.updateDynamic("timeZoneOffsetInMinutes")(timeZoneOffsetInMinutes.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DatePickerProps
}

