package typingsSlinky.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField
  extends typingsSlinky.extjs.Ext.IBase {
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns any
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns any All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
  		* @returns string name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
  		* @returns any A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current data value of the field
  		* @returns any value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns any True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns any True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[
    js.Function2[/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns any
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns any True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns any The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns any True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchChanges(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchChanges")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatchChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckDirty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCheckDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withClearInvalid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInvalid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInvalid")(js.undefined)
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
    def withExtractFileInput(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFileInput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExtractFileInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractFileInput")(js.undefined)
        ret
    }
    @scala.inline
    def withGetErrors(value: /* value */ js.UndefOr[js.Any] => _): Self = {
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
    def withGetModelData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModelData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModelData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModelData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubmitData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubmitData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubmitData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInitField(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initField")(js.undefined)
        ret
    }
    @scala.inline
    def withInitValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEqual(value: (/* value1 */ js.UndefOr[js.Any], /* value2 */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFileUpload(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFileUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFileUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFileUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFormField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFormField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormField")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOriginalValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResetOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => _): Self = {
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
    def withSubmitValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOriginalValue(value: /* value */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOriginalValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOriginalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

