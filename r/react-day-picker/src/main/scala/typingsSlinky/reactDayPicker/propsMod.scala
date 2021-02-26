package typingsSlinky.reactDayPicker

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactDayPicker.anon.NextMonth
import typingsSlinky.reactDayPicker.anon.PartialModifiers
import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.classNamesMod.InputClassNames
import typingsSlinky.reactDayPicker.dayPickerInputMod.default
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.modifiersMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  @js.native
  trait CaptionElementProps extends StObject {
    
    var classNames: ClassNames = js.native
    
    var date: js.Date = js.native
    
    var locale: String = js.native
    
    var localeUtils: LocaleUtils = js.native
    
    var months: js.UndefOr[js.Array[String]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  }
  object CaptionElementProps {
    
    @scala.inline
    def apply(classNames: ClassNames, date: js.Date, locale: String, localeUtils: LocaleUtils): CaptionElementProps = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptionElementProps]
    }
    
    @scala.inline
    implicit class CaptionElementPropsMutableBuilder[Self <: CaptionElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  @js.native
  trait DayPickerInputProps extends StObject {
    
    var classNames: js.UndefOr[InputClassNames] = js.native
    
    var clickUnselectsDay: js.UndefOr[Boolean] = js.native
    
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
        js.Function3[/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default, Unit]
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
    
    var style: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[String | js.Date] = js.native
  }
  object DayPickerInputProps {
    
    @scala.inline
    def apply(): DayPickerInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayPickerInputProps]
    }
    
    @scala.inline
    implicit class DayPickerInputPropsMutableBuilder[Self <: DayPickerInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNames(value: InputClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClickUnselectsDay(value: Boolean): Self = StObject.set(x, "clickUnselectsDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUnselectsDayUndefined: Self = StObject.set(x, "clickUnselectsDay", js.undefined)
      
      @scala.inline
      def setComponent(value: js.Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDayPickerProps(value: DayPickerProps): Self = StObject.set(x, "dayPickerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPickerPropsUndefined: Self = StObject.set(x, "dayPickerProps", js.undefined)
      
      @scala.inline
      def setFormat(value: String | js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatDate(value: (/* date */ js.Date, /* format */ String, /* locale */ String) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatDateUndefined: Self = StObject.set(x, "formatDate", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setHideOnDayClick(value: Boolean): Self = StObject.set(x, "hideOnDayClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnDayClickUndefined: Self = StObject.set(x, "hideOnDayClick", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepFocusUndefined: Self = StObject.set(x, "keepFocus", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnDayChange(value: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default) => Unit): Self = StObject.set(x, "onDayChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayChangeUndefined: Self = StObject.set(x, "onDayChange", js.undefined)
      
      @scala.inline
      def setOnDayPickerHide(value: () => Unit): Self = StObject.set(x, "onDayPickerHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDayPickerHideUndefined: Self = StObject.set(x, "onDayPickerHide", js.undefined)
      
      @scala.inline
      def setOnDayPickerShow(value: () => Unit): Self = StObject.set(x, "onDayPickerShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDayPickerShowUndefined: Self = StObject.set(x, "onDayPickerShow", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOverlayComponent(value: js.Any): Self = StObject.set(x, "overlayComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayComponentUndefined: Self = StObject.set(x, "overlayComponent", js.undefined)
      
      @scala.inline
      def setParseDate(value: (/* str */ String, /* format */ String, /* locale */ String) => js.Date | Unit): Self = StObject.set(x, "parseDate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueDate(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DayPickerProps extends StObject {
    
    var canChangeMonth: js.UndefOr[Boolean] = js.native
    
    var captionElement: js.UndefOr[ReactElement | ReactComponentClass[CaptionElementProps]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[ClassNames] = js.native
    
    var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabledDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
    
    var enableOutsideDaysClick: js.UndefOr[Boolean] = js.native
    
    var firstDayOfWeek: js.UndefOr[Double] = js.native
    
    var fixedWeeks: js.UndefOr[Boolean] = js.native
    
    var fromMonth: js.UndefOr[js.Date] = js.native
    
    var initialMonth: js.UndefOr[js.Date] = js.native
    
    var labels: js.UndefOr[NextMonth] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var localeUtils: js.UndefOr[LocaleUtils] = js.native
    
    var modifiers: js.UndefOr[PartialModifiers] = js.native
    
    var modifiersStyles: js.UndefOr[js.Object] = js.native
    
    var month: js.UndefOr[js.Date] = js.native
    
    var months: js.UndefOr[js.Array[String]] = js.native
    
    var navbarElement: js.UndefOr[ReactElement | ReactComponentClass[NavbarElementProps]] = js.native
    
    var numberOfMonths: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onCaptionClick: js.UndefOr[
        js.Function2[/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement], Unit]
      ] = js.native
    
    var onDayClick: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayKeyDown: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticKeyboardEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayMouseDown: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayMouseEnter: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayMouseLeave: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayMouseUp: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayTouchEnd: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticTouchEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onDayTouchStart: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticTouchEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLDivElement], Unit]] = js.native
    
    var onMonthChange: js.UndefOr[js.Function1[/* month */ js.Date, Unit]] = js.native
    
    var onTodayButtonClick: js.UndefOr[
        js.Function3[
          /* day */ js.Date, 
          /* modifiers */ DayModifiers, 
          /* e */ SyntheticMouseEvent[HTMLButtonElement], 
          Unit
        ]
      ] = js.native
    
    var onWeekClick: js.UndefOr[
        js.Function3[
          /* weekNumber */ Double, 
          /* days */ js.Array[js.Date], 
          /* e */ SyntheticMouseEvent[HTMLDivElement], 
          Unit
        ]
      ] = js.native
    
    var pagedNavigation: js.UndefOr[Boolean] = js.native
    
    var renderDay: js.UndefOr[js.Function2[/* date */ js.Date, /* modifiers */ DayModifiers, ReactElement]] = js.native
    
    var renderWeek: js.UndefOr[
        js.Function3[
          /* weekNumber */ Double, 
          /* week */ js.Array[js.Date], 
          /* month */ js.Date, 
          ReactElement
        ]
      ] = js.native
    
    var reverseMonths: js.UndefOr[Boolean] = js.native
    
    var selectedDays: js.UndefOr[Modifier | js.Array[Modifier]] = js.native
    
    var showOutsideDays: js.UndefOr[Boolean] = js.native
    
    var showWeekDays: js.UndefOr[Boolean] = js.native
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var toMonth: js.UndefOr[js.Date] = js.native
    
    var todayButton: js.UndefOr[String] = js.native
    
    var weekdayElement: js.UndefOr[ReactElement | ReactComponentClass[WeekdayElementProps]] = js.native
    
    var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
  }
  object DayPickerProps {
    
    @scala.inline
    def apply(): DayPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayPickerProps]
    }
    
    @scala.inline
    implicit class DayPickerPropsMutableBuilder[Self <: DayPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanChangeMonth(value: Boolean): Self = StObject.set(x, "canChangeMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanChangeMonthUndefined: Self = StObject.set(x, "canChangeMonth", js.undefined)
      
      @scala.inline
      def setCaptionElement(value: ReactElement | ReactComponentClass[CaptionElementProps]): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElementComponentClass(value: ReactComponentClass[CaptionElementProps]): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElementFunctionComponent(value: ReactComponentClass[CaptionElementProps]): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElementReactElement(value: ReactElement): Self = StObject.set(x, "captionElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElementUndefined: Self = StObject.set(x, "captionElement", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setContainerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabledDays(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysDate(value: js.Date): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "disabledDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      @scala.inline
      def setDisabledDaysVarargs(value: Modifier*): Self = StObject.set(x, "disabledDays", js.Array(value :_*))
      
      @scala.inline
      def setEnableOutsideDaysClick(value: Boolean): Self = StObject.set(x, "enableOutsideDaysClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOutsideDaysClickUndefined: Self = StObject.set(x, "enableOutsideDaysClick", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setFixedWeeks(value: Boolean): Self = StObject.set(x, "fixedWeeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWeeksUndefined: Self = StObject.set(x, "fixedWeeks", js.undefined)
      
      @scala.inline
      def setFromMonth(value: js.Date): Self = StObject.set(x, "fromMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromMonthUndefined: Self = StObject.set(x, "fromMonth", js.undefined)
      
      @scala.inline
      def setInitialMonth(value: js.Date): Self = StObject.set(x, "initialMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialMonthUndefined: Self = StObject.set(x, "initialMonth", js.undefined)
      
      @scala.inline
      def setLabels(value: NextMonth): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtilsUndefined: Self = StObject.set(x, "localeUtils", js.undefined)
      
      @scala.inline
      def setModifiers(value: PartialModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersStyles(value: js.Object): Self = StObject.set(x, "modifiersStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersStylesUndefined: Self = StObject.set(x, "modifiersStyles", js.undefined)
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setMonth(value: js.Date): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
      
      @scala.inline
      def setNavbarElement(value: ReactElement | ReactComponentClass[NavbarElementProps]): Self = StObject.set(x, "navbarElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarElementComponentClass(value: ReactComponentClass[NavbarElementProps]): Self = StObject.set(x, "navbarElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarElementFunctionComponent(value: ReactComponentClass[NavbarElementProps]): Self = StObject.set(x, "navbarElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarElementReactElement(value: ReactElement): Self = StObject.set(x, "navbarElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarElementUndefined: Self = StObject.set(x, "navbarElement", js.undefined)
      
      @scala.inline
      def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCaptionClick(value: (/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): Self = StObject.set(x, "onCaptionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCaptionClickUndefined: Self = StObject.set(x, "onCaptionClick", js.undefined)
      
      @scala.inline
      def setOnDayClick(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      @scala.inline
      def setOnDayKeyDown(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticKeyboardEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayKeyDown", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayKeyDownUndefined: Self = StObject.set(x, "onDayKeyDown", js.undefined)
      
      @scala.inline
      def setOnDayMouseDown(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayMouseDown", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayMouseDownUndefined: Self = StObject.set(x, "onDayMouseDown", js.undefined)
      
      @scala.inline
      def setOnDayMouseEnter(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
      
      @scala.inline
      def setOnDayMouseLeave(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
      
      @scala.inline
      def setOnDayMouseUp(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayMouseUp", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayMouseUpUndefined: Self = StObject.set(x, "onDayMouseUp", js.undefined)
      
      @scala.inline
      def setOnDayTouchEnd(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayTouchEnd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayTouchEndUndefined: Self = StObject.set(x, "onDayTouchEnd", js.undefined)
      
      @scala.inline
      def setOnDayTouchStart(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onDayTouchStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDayTouchStartUndefined: Self = StObject.set(x, "onDayTouchStart", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMonthChange(value: /* month */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      @scala.inline
      def setOnTodayButtonClick(
        value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLButtonElement]) => Unit
      ): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      @scala.inline
      def setOnWeekClick(
        value: (/* weekNumber */ Double, /* days */ js.Array[js.Date], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
      ): Self = StObject.set(x, "onWeekClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnWeekClickUndefined: Self = StObject.set(x, "onWeekClick", js.undefined)
      
      @scala.inline
      def setPagedNavigation(value: Boolean): Self = StObject.set(x, "pagedNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagedNavigationUndefined: Self = StObject.set(x, "pagedNavigation", js.undefined)
      
      @scala.inline
      def setRenderDay(value: (/* date */ js.Date, /* modifiers */ DayModifiers) => ReactElement): Self = StObject.set(x, "renderDay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderDayUndefined: Self = StObject.set(x, "renderDay", js.undefined)
      
      @scala.inline
      def setRenderWeek(
        value: (/* weekNumber */ Double, /* week */ js.Array[js.Date], /* month */ js.Date) => ReactElement
      ): Self = StObject.set(x, "renderWeek", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderWeekUndefined: Self = StObject.set(x, "renderWeek", js.undefined)
      
      @scala.inline
      def setReverseMonths(value: Boolean): Self = StObject.set(x, "reverseMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseMonthsUndefined: Self = StObject.set(x, "reverseMonths", js.undefined)
      
      @scala.inline
      def setSelectedDays(value: Modifier | js.Array[Modifier]): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDaysDate(value: js.Date): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedDaysFunction1(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "selectedDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
      
      @scala.inline
      def setSelectedDaysVarargs(value: Modifier*): Self = StObject.set(x, "selectedDays", js.Array(value :_*))
      
      @scala.inline
      def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
      
      @scala.inline
      def setShowWeekDays(value: Boolean): Self = StObject.set(x, "showWeekDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekDaysUndefined: Self = StObject.set(x, "showWeekDays", js.undefined)
      
      @scala.inline
      def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setToMonth(value: js.Date): Self = StObject.set(x, "toMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToMonthUndefined: Self = StObject.set(x, "toMonth", js.undefined)
      
      @scala.inline
      def setTodayButton(value: String): Self = StObject.set(x, "todayButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayButtonUndefined: Self = StObject.set(x, "todayButton", js.undefined)
      
      @scala.inline
      def setWeekdayElement(value: ReactElement | ReactComponentClass[WeekdayElementProps]): Self = StObject.set(x, "weekdayElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayElementComponentClass(value: ReactComponentClass[WeekdayElementProps]): Self = StObject.set(x, "weekdayElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayElementFunctionComponent(value: ReactComponentClass[WeekdayElementProps]): Self = StObject.set(x, "weekdayElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayElementReactElement(value: ReactElement): Self = StObject.set(x, "weekdayElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayElementUndefined: Self = StObject.set(x, "weekdayElement", js.undefined)
      
      @scala.inline
      def setWeekdaysLong(value: js.Array[String]): Self = StObject.set(x, "weekdaysLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysLongUndefined: Self = StObject.set(x, "weekdaysLong", js.undefined)
      
      @scala.inline
      def setWeekdaysLongVarargs(value: String*): Self = StObject.set(x, "weekdaysLong", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      @scala.inline
      def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    }
  }
  
  @js.native
  trait NavbarElementProps extends StObject {
    
    var className: String = js.native
    
    var classNames: ClassNames = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var labels: NextMonth = js.native
    
    var locale: String = js.native
    
    var localeUtils: LocaleUtils = js.native
    
    var month: js.Date = js.native
    
    var nextMonth: js.Date = js.native
    
    def onNextClick(): Unit = js.native
    def onNextClick(callback: js.Function0[Unit]): Unit = js.native
    
    def onPreviousClick(): Unit = js.native
    def onPreviousClick(callback: js.Function0[Unit]): Unit = js.native
    
    var previousMonth: js.Date = js.native
    
    var showNextButton: Boolean = js.native
    
    var showPreviousButton: Boolean = js.native
  }
  
  @js.native
  trait WeekdayElementProps extends StObject {
    
    var className: String = js.native
    
    var locale: String = js.native
    
    var localeUtils: LocaleUtils = js.native
    
    var weekday: Double = js.native
    
    var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
    
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
  }
  object WeekdayElementProps {
    
    @scala.inline
    def apply(className: String, locale: String, localeUtils: LocaleUtils, weekday: Double): WeekdayElementProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekdayElementProps]
    }
    
    @scala.inline
    implicit class WeekdayElementPropsMutableBuilder[Self <: WeekdayElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUtils(value: LocaleUtils): Self = StObject.set(x, "localeUtils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysLong(value: js.Array[String]): Self = StObject.set(x, "weekdaysLong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysLongUndefined: Self = StObject.set(x, "weekdaysLong", js.undefined)
      
      @scala.inline
      def setWeekdaysLongVarargs(value: String*): Self = StObject.set(x, "weekdaysLong", js.Array(value :_*))
      
      @scala.inline
      def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      @scala.inline
      def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value :_*))
    }
  }
}
