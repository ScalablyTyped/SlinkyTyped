package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateField
  extends typingsSlinky.extjs.Ext.form.field.IPicker {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.native
  /** [Method] private */
  @JSName("beforeBlur")
  var beforeBlur_IDateField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[String] = js.native
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.native
  /** [Method] Attempts to parse a given string value using a given date format. ... */
  var safeParse: js.UndefOr[js.Any] = js.native
  /** [Method] Replaces any existing disabled dates with new values and refreshes the Date picker
  		* @param disabledDates String[] An array of date strings (see the disabledDates config for details on supported values) used to disable a pattern of dates.
  		*/
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the Date picker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		*/
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Replaces any existing maxValue with the new value and refreshes the Date picker
  		* @param value Date The maximum date that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Replaces any existing minValue with the new value and refreshes the Date picker
  		* @param value Date The minimum date that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of the date field
  		* @param date String/Date The date or valid date string
  		* @returns Ext.form.field.Date this
  		*/
  @JSName("setValue")
  var setValue_IDateField: js.UndefOr[
    js.Function1[/* date */ js.UndefOr[js.Any], typingsSlinky.extjs.Ext.form.field.IDate]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var useStrict: js.UndefOr[Boolean] = js.native
}

object IDateField {
  @scala.inline
  def apply(): IDateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateField]
  }
  @scala.inline
  implicit class IDateFieldOps[Self <: IDateField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltFormats(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDatesText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDatesText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDays(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDaysText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDaysText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDaysText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDaysText")(js.undefined)
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
    def withMaxText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxText")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minText")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeParse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeParse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabledDates(value: /* disabledDates */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledDates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabledDays(value: /* disabledDays */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabledDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabledDays")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* date */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.form.field.IDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(js.undefined)
        ret
    }
  }
  
}

