package typingsSlinky.reactNativeDatepicker

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.calendar
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.date
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.datetime
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.spinner
import typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-datepicker", JSImport.Default)
  @js.native
  class default protected () extends DatePicker {
    def this(props: DatePickerProps) = this()
  }
  
  @js.native
  trait DatePicker
    extends Component[DatePickerProps, js.Object, js.Any] {
    
    def onPressCancel(): Unit = js.native
    
    def onPressDate(): Unit = js.native
  }
  
  @js.native
  trait DatePickerCustomStylesProps extends StObject {
    
    var btnCancel: js.UndefOr[StyleProp[_]] = js.native
    
    var btnConfirm: js.UndefOr[StyleProp[_]] = js.native
    
    var btnTextCancel: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var btnTextConfirm: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var dateIcon: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var dateInput: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var datePicker: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var datePickerCon: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var dateText: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var dateTouchBody: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var disabled: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var placeholderText: js.UndefOr[StyleProp[TextStyle]] = js.native
  }
  object DatePickerCustomStylesProps {
    
    @scala.inline
    def apply(): DatePickerCustomStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerCustomStylesProps]
    }
    
    @scala.inline
    implicit class DatePickerCustomStylesPropsMutableBuilder[Self <: DatePickerCustomStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtnCancel(value: StyleProp[_]): Self = StObject.set(x, "btnCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnCancelNull: Self = StObject.set(x, "btnCancel", null)
      
      @scala.inline
      def setBtnCancelUndefined: Self = StObject.set(x, "btnCancel", js.undefined)
      
      @scala.inline
      def setBtnConfirm(value: StyleProp[_]): Self = StObject.set(x, "btnConfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnConfirmNull: Self = StObject.set(x, "btnConfirm", null)
      
      @scala.inline
      def setBtnConfirmUndefined: Self = StObject.set(x, "btnConfirm", js.undefined)
      
      @scala.inline
      def setBtnTextCancel(value: StyleProp[TextStyle]): Self = StObject.set(x, "btnTextCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnTextCancelNull: Self = StObject.set(x, "btnTextCancel", null)
      
      @scala.inline
      def setBtnTextCancelUndefined: Self = StObject.set(x, "btnTextCancel", js.undefined)
      
      @scala.inline
      def setBtnTextConfirm(value: StyleProp[TextStyle]): Self = StObject.set(x, "btnTextConfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnTextConfirmNull: Self = StObject.set(x, "btnTextConfirm", null)
      
      @scala.inline
      def setBtnTextConfirmUndefined: Self = StObject.set(x, "btnTextConfirm", js.undefined)
      
      @scala.inline
      def setDateIcon(value: StyleProp[ImageStyle]): Self = StObject.set(x, "dateIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateIconNull: Self = StObject.set(x, "dateIcon", null)
      
      @scala.inline
      def setDateIconUndefined: Self = StObject.set(x, "dateIcon", js.undefined)
      
      @scala.inline
      def setDateInput(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateInputNull: Self = StObject.set(x, "dateInput", null)
      
      @scala.inline
      def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
      
      @scala.inline
      def setDatePicker(value: StyleProp[ViewStyle]): Self = StObject.set(x, "datePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerCon(value: StyleProp[ViewStyle]): Self = StObject.set(x, "datePickerCon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerConNull: Self = StObject.set(x, "datePickerCon", null)
      
      @scala.inline
      def setDatePickerConUndefined: Self = StObject.set(x, "datePickerCon", js.undefined)
      
      @scala.inline
      def setDatePickerNull: Self = StObject.set(x, "datePicker", null)
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "datePicker", js.undefined)
      
      @scala.inline
      def setDateText(value: StyleProp[TextStyle]): Self = StObject.set(x, "dateText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTextNull: Self = StObject.set(x, "dateText", null)
      
      @scala.inline
      def setDateTextUndefined: Self = StObject.set(x, "dateText", js.undefined)
      
      @scala.inline
      def setDateTouchBody(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dateTouchBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTouchBodyNull: Self = StObject.set(x, "dateTouchBody", null)
      
      @scala.inline
      def setDateTouchBodyUndefined: Self = StObject.set(x, "dateTouchBody", js.undefined)
      
      @scala.inline
      def setDisabled(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledNull: Self = StObject.set(x, "disabled", null)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setPlaceholderText(value: StyleProp[TextStyle]): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextNull: Self = StObject.set(x, "placeholderText", null)
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    }
  }
  
  @js.native
  trait DatePickerProps extends StObject {
    
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
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      @scala.inline
      def setAndroidMode(
        value: typingsSlinky.reactNativeDatepicker.reactNativeDatepickerStrings.default | calendar | spinner
      ): Self = StObject.set(x, "androidMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndroidModeUndefined: Self = StObject.set(x, "androidMode", js.undefined)
      
      @scala.inline
      def setCancelBtnTestID(value: String): Self = StObject.set(x, "cancelBtnTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBtnTestIDUndefined: Self = StObject.set(x, "cancelBtnTestID", js.undefined)
      
      @scala.inline
      def setCancelBtnText(value: String): Self = StObject.set(x, "cancelBtnText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBtnTextUndefined: Self = StObject.set(x, "cancelBtnText", js.undefined)
      
      @scala.inline
      def setConfirmBtnTestID(value: String): Self = StObject.set(x, "confirmBtnTestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmBtnTestIDUndefined: Self = StObject.set(x, "confirmBtnTestID", js.undefined)
      
      @scala.inline
      def setConfirmBtnText(value: String): Self = StObject.set(x, "confirmBtnText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmBtnTextUndefined: Self = StObject.set(x, "confirmBtnText", js.undefined)
      
      @scala.inline
      def setCustomStyles(value: DatePickerCustomStylesProps): Self = StObject.set(x, "customStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStylesUndefined: Self = StObject.set(x, "customStyles", js.undefined)
      
      @scala.inline
      def setDate(value: String | js.Date | Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGetDateStr(value: /* date */ js.Date => String): Self = StObject.set(x, "getDateStr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDateStrUndefined: Self = StObject.set(x, "getDateStr", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideText(value: Boolean): Self = StObject.set(x, "hideText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTextUndefined: Self = StObject.set(x, "hideText", js.undefined)
      
      @scala.inline
      def setIconComponent(value: ReactElement): Self = StObject.set(x, "iconComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconComponentUndefined: Self = StObject.set(x, "iconComponent", js.undefined)
      
      @scala.inline
      def setIconSource(value: ImageURISource): Self = StObject.set(x, "iconSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSourceUndefined: Self = StObject.set(x, "iconSource", js.undefined)
      
      @scala.inline
      def setIs24Hour(value: Boolean): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs24HourUndefined: Self = StObject.set(x, "is24Hour", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: String | js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: String | js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteIntervalUndefined: Self = StObject.set(x, "minuteInterval", js.undefined)
      
      @scala.inline
      def setModalOnResponderTerminationRequest(value: /* e */ js.Any => Boolean): Self = StObject.set(x, "modalOnResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalOnResponderTerminationRequestUndefined: Self = StObject.set(x, "modalOnResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setMode(value: date | datetime | time): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnCloseModal(value: () => Unit): Self = StObject.set(x, "onCloseModal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseModalUndefined: Self = StObject.set(x, "onCloseModal", js.undefined)
      
      @scala.inline
      def setOnDateChange(value: (/* dateStr */ String, /* date */ js.Date) => Unit): Self = StObject.set(x, "onDateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      @scala.inline
      def setOnOpenModal(value: () => Unit): Self = StObject.set(x, "onOpenModal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenModalUndefined: Self = StObject.set(x, "onOpenModal", js.undefined)
      
      @scala.inline
      def setOnPressMask(value: () => Unit): Self = StObject.set(x, "onPressMask", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressMaskUndefined: Self = StObject.set(x, "onPressMask", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[_]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTimeZoneOffsetInMinutes(value: Double): Self = StObject.set(x, "timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneOffsetInMinutesUndefined: Self = StObject.set(x, "timeZoneOffsetInMinutes", js.undefined)
      
      @scala.inline
      def setTouchableComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
    }
  }
}
