package typingsSlinky.reactDayPicker.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactDayPicker.anon.NextMonth
import typingsSlinky.reactDayPicker.anon.PartialModifiers
import typingsSlinky.reactDayPicker.classNamesMod.ClassNames
import typingsSlinky.reactDayPicker.localeUtilsMod.LocaleUtils
import typingsSlinky.reactDayPicker.modifiersMod.DayModifiers
import typingsSlinky.reactDayPicker.modifiersMod.Modifier
import typingsSlinky.reactDayPicker.propsMod.CaptionElementProps
import typingsSlinky.reactDayPicker.propsMod.NavbarElementProps
import typingsSlinky.reactDayPicker.propsMod.WeekdayElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DayPickerProps821347195[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def canChangeMonth(value: Boolean): this.type = set("canChangeMonth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def captionElement(value: ReactElement | ReactComponentClass[CaptionElementProps]): this.type = set("captionElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def captionElementComponentClass(value: ReactComponentClass[CaptionElementProps]): this.type = set("captionElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def captionElementFunctionComponent(value: ReactComponentClass[CaptionElementProps]): this.type = set("captionElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def captionElementReactElement(value: ReactElement): this.type = set("captionElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def classNames(value: ClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
  
  @scala.inline
  def containerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): this.type = set("containerProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabledDays(value: Modifier | js.Array[Modifier]): this.type = set("disabledDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabledDaysDate(value: js.Date): this.type = set("disabledDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabledDaysFunction1(value: /* date */ js.Date => Boolean): this.type = set("disabledDays", js.Any.fromFunction1(value))
  
  @scala.inline
  def disabledDaysVarargs(value: Modifier*): this.type = set("disabledDays", js.Array(value :_*))
  
  @scala.inline
  def enableOutsideDaysClick(value: Boolean): this.type = set("enableOutsideDaysClick", value.asInstanceOf[js.Any])
  
  @scala.inline
  def firstDayOfWeek(value: Double): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixedWeeks(value: Boolean): this.type = set("fixedWeeks", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fromMonth(value: js.Date): this.type = set("fromMonth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labels(value: NextMonth): this.type = set("labels", value.asInstanceOf[js.Any])
  
  @scala.inline
  def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def localeUtils(value: LocaleUtils): this.type = set("localeUtils", value.asInstanceOf[js.Any])
  
  @scala.inline
  def modifiers(value: PartialModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
  
  @scala.inline
  def modifiersStyles(value: js.Object): this.type = set("modifiersStyles", value.asInstanceOf[js.Any])
  
  @scala.inline
  def month(value: js.Date): this.type = set("month", value.asInstanceOf[js.Any])
  
  @scala.inline
  def months(value: js.Array[String]): this.type = set("months", value.asInstanceOf[js.Any])
  
  @scala.inline
  def monthsVarargs(value: String*): this.type = set("months", js.Array(value :_*))
  
  @scala.inline
  def navbarElement(value: ReactElement | ReactComponentClass[NavbarElementProps]): this.type = set("navbarElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def navbarElementComponentClass(value: ReactComponentClass[NavbarElementProps]): this.type = set("navbarElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def navbarElementFunctionComponent(value: ReactComponentClass[NavbarElementProps]): this.type = set("navbarElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def navbarElementReactElement(value: ReactElement): this.type = set("navbarElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def numberOfMonths(value: Double): this.type = set("numberOfMonths", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCaptionClick(value: (/* month */ js.Date, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit): this.type = set("onCaptionClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onDayClick(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayClick", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayKeyDown(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticKeyboardEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayKeyDown", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayMouseDown(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayMouseDown", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayMouseEnter(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayMouseEnter", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayMouseLeave(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayMouseLeave", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayMouseUp(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayMouseUp", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayTouchEnd(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayTouchEnd", js.Any.fromFunction3(value))
  
  @scala.inline
  def onDayTouchStart(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticTouchEvent[HTMLDivElement]) => Unit
  ): this.type = set("onDayTouchStart", js.Any.fromFunction3(value))
  
  @scala.inline
  def onFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: /* e */ SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMonthChange(value: /* month */ js.Date => Unit): this.type = set("onMonthChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onTodayButtonClick(
    value: (/* day */ js.Date, /* modifiers */ DayModifiers, /* e */ SyntheticMouseEvent[HTMLButtonElement]) => Unit
  ): this.type = set("onTodayButtonClick", js.Any.fromFunction3(value))
  
  @scala.inline
  def onWeekClick(
    value: (/* weekNumber */ Double, /* days */ js.Array[js.Date], /* e */ SyntheticMouseEvent[HTMLDivElement]) => Unit
  ): this.type = set("onWeekClick", js.Any.fromFunction3(value))
  
  @scala.inline
  def pagedNavigation(value: Boolean): this.type = set("pagedNavigation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def renderDay(value: (/* date */ js.Date, /* modifiers */ DayModifiers) => ReactElement): this.type = set("renderDay", js.Any.fromFunction2(value))
  
  @scala.inline
  def renderWeek(
    value: (/* weekNumber */ Double, /* week */ js.Array[js.Date], /* month */ js.Date) => ReactElement
  ): this.type = set("renderWeek", js.Any.fromFunction3(value))
  
  @scala.inline
  def reverseMonths(value: Boolean): this.type = set("reverseMonths", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedDays(value: Modifier | js.Array[Modifier]): this.type = set("selectedDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedDaysDate(value: js.Date): this.type = set("selectedDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedDaysFunction1(value: /* date */ js.Date => Boolean): this.type = set("selectedDays", js.Any.fromFunction1(value))
  
  @scala.inline
  def selectedDaysVarargs(value: Modifier*): this.type = set("selectedDays", js.Array(value :_*))
  
  @scala.inline
  def showOutsideDays(value: Boolean): this.type = set("showOutsideDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showWeekDays(value: Boolean): this.type = set("showWeekDays", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def toMonth(value: js.Date): this.type = set("toMonth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def todayButton(value: String): this.type = set("todayButton", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdayElement(value: ReactElement | ReactComponentClass[WeekdayElementProps]): this.type = set("weekdayElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdayElementComponentClass(value: ReactComponentClass[WeekdayElementProps]): this.type = set("weekdayElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdayElementFunctionComponent(value: ReactComponentClass[WeekdayElementProps]): this.type = set("weekdayElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdayElementReactElement(value: ReactElement): this.type = set("weekdayElement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdaysLong(value: js.Array[String]): this.type = set("weekdaysLong", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdaysLongVarargs(value: String*): this.type = set("weekdaysLong", js.Array(value :_*))
  
  @scala.inline
  def weekdaysShort(value: js.Array[String]): this.type = set("weekdaysShort", value.asInstanceOf[js.Any])
  
  @scala.inline
  def weekdaysShortVarargs(value: String*): this.type = set("weekdaysShort", js.Array(value :_*))
}
