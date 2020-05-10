package typingsSlinky.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeField
  extends typingsSlinky.extjs.Ext.form.field.IComboBox {
  /** [Config Option] (String) */
  var altFormats: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  /** [Config Option] (Date/String) */
  var maxValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  /** [Config Option] (Date/String) */
  var minValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var pickerMaxHeight: js.UndefOr[Double] = js.native
  /** [Method] Replaces any existing maxValue with the new time and refreshes the picker s range
  		* @param value Date/String The maximum time that can be selected
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Replaces any existing minValue with the new time and refreshes the picker s range
  		* @param value Date/String The minimum time that can be selected
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the specified value s into the field
  		* @returns any this
  		*/
  @JSName("setValue")
  var setValue_ITimeField: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var snapToIncrement: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var submitFormat: js.UndefOr[String] = js.native
}

object ITimeField {
  @scala.inline
  def apply(): ITimeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeField]
  }
  @scala.inline
  implicit class ITimeFieldOps[Self <: ITimeField] (val x: Self) extends AnyVal {
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
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
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
    def withPickerMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerMaxHeight")(js.undefined)
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
    def withSetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToIncrement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToIncrement")(js.undefined)
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
  }
  
}

