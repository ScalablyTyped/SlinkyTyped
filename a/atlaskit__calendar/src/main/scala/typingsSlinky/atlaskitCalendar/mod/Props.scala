package typingsSlinky.atlaskitCalendar.mod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /** The number of the day currently focused. Places border around the date. 0 highlights no date. */
  var day: js.UndefOr[Double] = js.native
  /** Default for `day`. */
  var defaultDay: js.UndefOr[Double] = js.native
  /** Default for `disabled`. */
  var defaultDisabled: js.UndefOr[js.Array[String]] = js.native
  /** Default for `month`. */
  var defaultMonth: js.UndefOr[Double] = js.native
  /** Default for `previouslySelected`. */
  var defaultPreviouslySelected: js.UndefOr[js.Array[String]] = js.native
  /** Default for `selected`. */
  var defaultSelected: js.UndefOr[js.Array[String]] = js.native
  /** Default for `year`. */
  var defaultYear: js.UndefOr[Double] = js.native
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates provided are greyed out.
    * This does not prevent these dates being selected.
    */
  var disabled: js.UndefOr[js.Array[String]] = js.native
  /** Props to apply to the container. */
  var innerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /** The number of the month (from 1 to 12) which the calendar should be on. */
  var month: js.UndefOr[Double] = js.native
  /** Function which is called when the calendar is no longer focused. */
  var onBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]], Unit]] = js.native
  /**
    * Called when the calendar is navigated. This can be triggered by the keyboard, or by clicking the navigational buttons.
    * The 'type' property indicates the the direction the calendar was navigated whereas the 'iso' property is a string of the format YYYY-MM-DD.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.native
  /** Called when the calendar receives focus. This could be from a mouse event on the container by tabbing into it. */
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]], Unit]] = js.native
  /**
    * Function called when a day is clicked on. Calls with an object that has
    * a day, month and week property as numbers, representing the date just clicked.
    * It also has an 'iso' property, which is a string of the selected date in the
    * format YYYY-MM-DD.
    */
  var onSelect: js.UndefOr[js.Function1[/* e */ SelectEvent, Unit]] = js.native
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var previouslySelected: js.UndefOr[js.Array[String]] = js.native
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var selected: js.UndefOr[js.Array[String]] = js.native
  /** Value of current day, as a string in the format 'YYYY-MM-DD'. */
  var today: js.UndefOr[String] = js.native
  /** Year to display the calendar for. */
  var year: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDay")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDisabled(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPreviouslySelected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPreviouslySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPreviouslySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPreviouslySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultYear")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: js.Array[String]): Self = {
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
    def withInnerProps(value: HTMLAttributes[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): Self = {
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
    def withOnChange(value: /* e */ ChangeEvent => Unit): Self = {
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
    def withOnFocus(value: /* e */ js.UndefOr[SyntheticFocusEvent[HTMLDivElement]] => Unit): Self = {
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
    def withOnSelect(value: /* e */ SelectEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviouslySelected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previouslySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviouslySelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previouslySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

