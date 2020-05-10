package typingsSlinky.flatpickr.instanceMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.Node
import typingsSlinky.flatpickr.globalsMod._Global_.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements extends js.Object {
  var _hideNextMonthArrow: Boolean = js.native
  var _hidePrevMonthArrow: Boolean = js.native
  var _input: HTMLInputElement = js.native
  var _positionElement: HTMLElement = js.native
  var altInput: js.UndefOr[HTMLInputElement] = js.native
  var amPM: js.UndefOr[HTMLSpanElement] = js.native
  var calendarContainer: HTMLDivElement = js.native
  var currentMonthElement: HTMLSpanElement = js.native
  var currentYearElement: HTMLInputElement = js.native
  var days: HTMLDivElement = js.native
  var daysContainer: js.UndefOr[HTMLDivElement] = js.native
  var element: HTMLElement = js.native
  var hourElement: js.UndefOr[HTMLInputElement] = js.native
  var innerContainer: js.UndefOr[HTMLDivElement] = js.native
  var input: HTMLInputElement = js.native
  var minuteElement: js.UndefOr[HTMLInputElement] = js.native
  var mobileFormatStr: js.UndefOr[String] = js.native
  var mobileInput: js.UndefOr[HTMLInputElement] = js.native
  var monthElements: js.Array[HTMLSpanElement] = js.native
  var monthNav: HTMLDivElement = js.native
  var monthsDropdownContainer: HTMLSelectElement = js.native
  var nextMonthNav: HTMLElement = js.native
  var pluginElements: js.Array[Node] = js.native
  var prevMonthNav: HTMLElement = js.native
  var rContainer: js.UndefOr[HTMLDivElement] = js.native
  var secondElement: js.UndefOr[HTMLInputElement] = js.native
  var selectedDateElem: js.UndefOr[DayElement] = js.native
  var timeContainer: js.UndefOr[HTMLDivElement] = js.native
  var todayDateElem: js.UndefOr[DayElement] = js.native
  var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
  var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
  var weekdayContainer: HTMLDivElement = js.native
  var yearElements: js.Array[HTMLInputElement] = js.native
}

object Elements {
  @scala.inline
  def apply(
    _hideNextMonthArrow: Boolean,
    _hidePrevMonthArrow: Boolean,
    _input: HTMLInputElement,
    _positionElement: HTMLElement,
    calendarContainer: HTMLDivElement,
    currentMonthElement: HTMLSpanElement,
    currentYearElement: HTMLInputElement,
    days: HTMLDivElement,
    element: HTMLElement,
    input: HTMLInputElement,
    monthElements: js.Array[HTMLSpanElement],
    monthNav: HTMLDivElement,
    monthsDropdownContainer: HTMLSelectElement,
    nextMonthNav: HTMLElement,
    pluginElements: js.Array[Node],
    prevMonthNav: HTMLElement,
    weekdayContainer: HTMLDivElement,
    yearElements: js.Array[HTMLInputElement]
  ): Elements = {
    val __obj = js.Dynamic.literal(_hideNextMonthArrow = _hideNextMonthArrow.asInstanceOf[js.Any], _hidePrevMonthArrow = _hidePrevMonthArrow.asInstanceOf[js.Any], _input = _input.asInstanceOf[js.Any], _positionElement = _positionElement.asInstanceOf[js.Any], calendarContainer = calendarContainer.asInstanceOf[js.Any], currentMonthElement = currentMonthElement.asInstanceOf[js.Any], currentYearElement = currentYearElement.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], monthElements = monthElements.asInstanceOf[js.Any], monthNav = monthNav.asInstanceOf[js.Any], monthsDropdownContainer = monthsDropdownContainer.asInstanceOf[js.Any], nextMonthNav = nextMonthNav.asInstanceOf[js.Any], pluginElements = pluginElements.asInstanceOf[js.Any], prevMonthNav = prevMonthNav.asInstanceOf[js.Any], weekdayContainer = weekdayContainer.asInstanceOf[js.Any], yearElements = yearElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_hideNextMonthArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hideNextMonthArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hidePrevMonthArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hidePrevMonthArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_input(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_positionElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_positionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentMonthElement(value: HTMLSpanElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMonthElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentYearElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentYearElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthElements(value: js.Array[HTMLSpanElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthNav(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthsDropdownContainer(value: HTMLSelectElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsDropdownContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMonthNav(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonthNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginElements(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevMonthNav(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevMonthNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdayContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearElements(value: js.Array[HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltInput(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altInput")(js.undefined)
        ret
    }
    @scala.inline
    def withAmPM(value: HTMLSpanElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmPM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPM")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withHourElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourElement")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileFormatStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFormatStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileFormatStr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFormatStr")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileInput(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondElement(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDateElem(value: DayElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateElem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDateElem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDateElem")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeContainer(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayDateElem(value: DayElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayDateElem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayDateElem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayDateElem")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumbers(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekWrapper(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekWrapper")(js.undefined)
        ret
    }
  }
  
}

