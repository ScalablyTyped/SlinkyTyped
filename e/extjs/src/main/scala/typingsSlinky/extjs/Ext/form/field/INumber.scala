package typingsSlinky.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumber extends ISpinner {
  /** [Config Option] (Boolean) */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowExponential: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoStripChars: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseChars: js.UndefOr[String] = js.native
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_INumber: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var decimalPrecision: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var decimalSeparator: js.UndefOr[String] = js.native
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_INumber: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var nanText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var negativeText: js.UndefOr[String] = js.native
  /** [Method] Replaces any existing maxValue with the new value
  		* @param value Number The maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Replaces any existing minValue with the new value
  		* @param value Number The minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets whether the spinner down button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinDownEnabled")
  var setSpinDownEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets whether the spinner up button is enabled
  		* @param enabled Object
  		* @param internal Object
  		*/
  @JSName("setSpinUpEnabled")
  var setSpinUpEnabled_INumber: js.UndefOr[
    js.Function2[/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var step: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var submitLocaleSeparator: js.UndefOr[Boolean] = js.native
}

object INumber {
  @scala.inline
  def apply(): INumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumber]
  }
  @scala.inline
  implicit class INumberOps[Self <: INumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowExponential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExponential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExponential")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoStripChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStripChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStripChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStripChars")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseChars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChars")(js.undefined)
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
    def withDecimalPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubmitValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubmitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitValue")(js.undefined)
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
    def withMaxValue(value: Double): Self = {
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
    def withMinValue(value: Double): Self = {
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
    def withNanText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNanText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanText")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxValue(value: /* value */ js.UndefOr[Double] => Unit): Self = {
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
    def withSetMinValue(value: /* value */ js.UndefOr[Double] => Unit): Self = {
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
    def withSetSpinDownEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinDownEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSpinDownEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinDownEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSpinUpEnabled(value: (/* enabled */ js.UndefOr[js.Any], /* internal */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinUpEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSpinUpEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpinUpEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitLocaleSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitLocaleSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitLocaleSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitLocaleSeparator")(js.undefined)
        ret
    }
  }
  
}

