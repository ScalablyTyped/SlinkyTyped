package typingsSlinky.ejWebAll.ej.RecurrenceEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers whenever any of the Recurrence Editor's value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Accepts the custom CSS class name, that defines user-defined styles and themes to be applied on partial or complete elements of the Recurrence Editor.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Sets the date format for the datepickers available within the Recurrence Editor.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /** When set to true, renders the Recurrence Editor options from Right-to-Left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When set to true, enables the spin button of numeric textboxes within the Recurrence Editor.
    * @Default {true}
    */
  var enableSpinners: js.UndefOr[Boolean] = js.native
  /** Sets the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /** Defines the collection of recurrence frequencies within Recurrence Editor such as Never, Daily, Weekly, Monthly, Yearly and Every Weekday.
    * @Default {[never, daily, weekly, monthly, yearly, everyweekday]}
    */
  var frequencies: js.UndefOr[js.Array[_]] = js.native
  /** Sets the specific culture to the Recurrence Editor.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum date limit to display on the datepickers used within the Recurrence Editor. Setting maxDate with specific date value disallows the datepickers within the
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.native
  /** Sets the minimum date limit to display on the datepickers defined within the Recurrence Editor. Setting minDate with specific date value disallows the datepickers within
    * Recurrence Editor to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.native
  /** Sets the active/current repeat type(frequency) on Recurrence Editor based on the index value provided. For example, setting the value 1 will initially set the repeat type as Daily
    * and display its related options.
    * @Default {0}
    */
  var selectedRecurrenceType: js.UndefOr[Double] = js.native
  /** Sets the start date of the recurrence. The Recurrence Editor initially displays the current date as its start date.
    * @Default {new Date()}
    */
  var startDate: js.UndefOr[js.Any] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSpinners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpinners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSpinners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSpinners")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencies(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencies")(js.undefined)
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
    def withMaxDate(value: js.Any): Self = {
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
    def withMinDate(value: js.Any): Self = {
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
    def withSelectedRecurrenceType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecurrenceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRecurrenceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecurrenceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

