package typingsSlinky.extjs.Ext.form.field

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText extends IBase {
  /** [Config Option] (Boolean) */
  var allowBlank: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowOnlyWhitespace: js.UndefOr[Boolean] = js.native
  /** [Method] Automatically grows the field to accomodate the width of the text up to the maximum field width allowed  */
  var autoSize: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] private */
  @JSName("beforeFocus")
  var beforeFocus_IText: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var blankText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var disableKeyFilter: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var emptyCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var enableKeyEvents: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enforceMaxLength: js.UndefOr[Boolean] = js.native
  /** [Method] Validates a value according to the field s validation rules and returns an array of errors for any failing validations
  		* @param value Object The value to validate. The processed raw value will be used if nothing is passed.
  		* @returns String[] Array of any validation errors
  		*/
  @JSName("getErrors")
  var getErrors_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Returns the raw String value of the field without performing any normalization conversion or validation
  		* @returns String The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IText: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean) */
  var grow: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var growAppend: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var growMax: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var growMin: js.UndefOr[Double] = js.native
  /** [Config Option] (RegExp) */
  var maskRe: js.UndefOr[js.RegExp] = js.native
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var maxLengthText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var minLength: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var minLengthText: js.UndefOr[String] = js.native
  /** [Method] private */
  @JSName("postBlur")
  var postBlur_IText: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs any necessary manipulation of a raw String value to prepare it for conversion and or validation
  		* @param value String The unprocessed string value
  		* @returns String The processed string value
  		*/
  @JSName("processRawValue")
  var processRawValue_IText: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], String]] = js.native
  /** [Config Option] (RegExp) */
  var regex: js.UndefOr[js.RegExp] = js.native
  /** [Config Option] (String) */
  var regexText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var requiredCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  /** [Method] Selects text in this field
  		* @param start Number The index where the selection should start
  		* @param end Number The index where the selection should end (defaults to the text length)
  		*/
  var selectText: js.UndefOr[js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.native
  /** [Config Option] (RegExp) */
  var stripCharsRe: js.UndefOr[js.RegExp] = js.native
  /** [Config Option] (Boolean) */
  var validateBlank: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var validator: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var vtype: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var vtypeText: js.UndefOr[String] = js.native
}

object IText {
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  @scala.inline
  implicit class ITextOps[Self <: IText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOnlyWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOnlyWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOnlyWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOnlyWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBlankText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlankText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableKeyFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceMaxLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGetErrors(value: /* value */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRawValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowAppend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growAppend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growAppend")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growMax")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growMin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskRe(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskRe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskRe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskRe")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLengthText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLengthText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLengthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLengthText")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLengthText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLengthText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLengthText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLengthText")(js.undefined)
        ret
    }
    @scala.inline
    def withPostBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPostBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessRawValue(value: /* value */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRawValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexText")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectText(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectText")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStripCharsRe(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripCharsRe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripCharsRe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripCharsRe")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateBlank(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateBlank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateBlank")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
    @scala.inline
    def withVtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtype")(js.undefined)
        ret
    }
    @scala.inline
    def withVtypeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtypeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtypeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtypeText")(js.undefined)
        ret
    }
  }
  
}

