package typingsSlinky.reactInputCalendar.reactInputCalendar

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactInputCalendarProps extends js.Object {
  /**
    * Define state when date picker would close once the user has clicked on a date.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * Format of date for the onChange event. Default on the date format (ISO 8601) to ease the save of data.
    * Allowed Keys: All formats supported by moment.js
    * @default 'MM-DD-YYYY'
    */
  var computableFormat: js.UndefOr[String] = js.native
  /**
    * Set initial date value
    * @default current date
    */
  var date: js.UndefOr[String | js.Date] = js.native
  /**
    * If true, the input field gets disabled and the icon next to it disappears.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Format of date, which display in input and set in date property.
    * Allowed Keys: All formats supported by moment.js
    * @default 'MM-DD-YYYY'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Define the class name of the input field where the date picker represents its value.
    */
  var inputFieldClass: js.UndefOr[String] = js.native
  /**
    * Id that should be applied to the input field. Useful when using it with a label element.
    */
  var inputFieldId: js.UndefOr[String] = js.native
  /**
    * Set the selectable maximum date
    * @default null
    */
  var maxDate: js.UndefOr[String | js.Date] = js.native
  /**
    * Set the selectable minimum date
    * @default null
    */
  var minDate: js.UndefOr[String | js.Date] = js.native
  /**
    * Set minimal view. Values:
    * 0 - days
    * 1 - months
    * 2 - years.
    * @default 0 (DaysView)
    */
  var minView: js.UndefOr[Double] = js.native
  /**
    * Set a function that will be triggered the when input field is blurred. It will return the event and the date in the props.computableFormat format.
    */
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[Event_, ReactInputCalendar], 
      /* computableDate */ String, 
      Unit
    ]
  ] = js.native
  /**
    * Set a function that will be triggered whenever there is a change in the selected date. It will return the date in the props.computableFormat format.
    */
  var onChange: js.UndefOr[js.Function1[/* computableDate */ String, Unit]] = js.native
  /**
    * Set a function that will be triggered when the input field is focused.
    */
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event_, ReactInputCalendar], Unit]] = js.native
  /**
    * Setting this value to true makes the calendar widget open when the iput field is focused.
    */
  var openOnInputFocus: js.UndefOr[Boolean] = js.native
  /**
    * Value to show in the input text box if no date is set.
    */
  var placeholder: js.UndefOr[String] = js.native
}

object ReactInputCalendarProps {
  @scala.inline
  def apply(): ReactInputCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactInputCalendarProps]
  }
  @scala.inline
  implicit class ReactInputCalendarPropsOps[Self <: ReactInputCalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withComputableFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computableFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputableFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computableFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String | js.Date): Self = {
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
    def withInputFieldClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFieldClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFieldId")(js.undefined)
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
    def withMinView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(
      value: (/* event */ SyntheticEvent[Event_, ReactInputCalendar], /* computableDate */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* computableDate */ String => Unit): Self = {
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
    def withOnFocus(value: /* event */ SyntheticEvent[Event_, ReactInputCalendar] => Unit): Self = {
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
    def withOpenOnInputFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnInputFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnInputFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnInputFocus")(js.undefined)
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
  }
  
}

