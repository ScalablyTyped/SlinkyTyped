package typingsSlinky.extjs.Ext.form

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate
- typingsSlinky.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ @js.native
trait IBaseField extends IComponent {
  /** [Config Option] (String) */
  var activeError: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var activeErrorsTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBodyEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterSubTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoFitErrors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var baseBodyCls: js.UndefOr[String] = js.native
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var checkChangeBuffer: js.UndefOr[Double] = js.native
  /** [Config Option] (String[]) */
  var checkChangeEvents: js.UndefOr[Array] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var dirtyCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.native
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldStyle: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var formItemCls: js.UndefOr[String] = js.native
  /** [Method] Gets the active error message for this component if any
  		* @returns String The active error message on the component; if there is no error, an empty string is returned.
  		*/
  var getActiveError: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets an Array of any active error messages currently applied to the field
  		* @returns String[] The active error messages on the component; if there are no errors, an empty Array is returned.
  		*/
  var getActiveErrors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns String[] All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | Array]] = js.native
  /** [Method] Returns the label for the field
  		* @returns String The configured field label, or empty string if not defined
  		*/
  var getFieldLabel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Get the input id if any for this component
  		* @returns String The input id
  		*/
  var getInputId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets the width of the label if visible
  		* @returns Number The label width
  		*/
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Generates the arguments for the field decorations rendering template
  		* @returns Object The template arguments
  		*/
  var getLabelableRenderData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns any value The raw String value of the field
  		*/
  var getRawValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Creates and returns the data object to be used when rendering the fieldSubTpl
  		* @returns Object The template data
  		*/
  var getSubTplData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] private override to use getSubmitValue  as a convenience
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns any The value to be submitted, or null.
  		*/
  var getSubmitValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Tells whether the field currently has an active error message
  		* @returns Boolean
  		*/
  var hasActiveError: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Checks if the field has a visible label
  		* @returns Boolean True if the field has a visible label
  		*/
  var hasVisibleLabel: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var hideEmptyLabel: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var hideLabel: js.UndefOr[Boolean] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var inputAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var inputEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var inputId: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var inputType: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var invalidText: js.UndefOr[String] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object The first value to compare
  		* @param value2 Object The second value to compare
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Config Option] (String) */
  var labelAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var labelAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var labelCell: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelClsExtra: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var labelEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Number) */
  var labelPad: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var labelSeparator: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var labelStyle: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var labelWidth: js.UndefOr[Double] = js.native
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag
  		* @param errors String/String[] The validation message(s) to display.
  		*/
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Method] private */
  @JSName("onRender")
  var onRender_IBaseField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.native
  /** [Method] Performs any necessary manipulation of a raw field value to prepare it for conversion and or validation for instance
  		* @param value Object The unprocessed string value
  		* @returns Object The processed string value
  		*/
  var processRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Converts a raw input field value into a mixed type value that is suitable for this particular field type
  		* @param rawValue Object
  		* @returns Object The converted value.
  		*/
  var rawToValue: js.UndefOr[js.Function1[/* rawValue */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var readOnlyCls: js.UndefOr[String] = js.native
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the active error message to the given string
  		* @param msg String The error message
  		*/
  var setActiveError: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the active error message to an Array of error messages
  		* @param errors String[] The error messages
  		*/
  var setActiveErrors: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.native
  /** [Method] Applies a set of default configuration values to this Labelable instance
  		* @param defaults Object The defaults to apply to the object.
  		*/
  var setFieldDefaults: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set the label of this field
  		* @param label String The new label. The labelSeparator will be automatically appended to the label string.
  		*/
  var setFieldLabel: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the CSS style of the field input element
  		* @param style String/Object/Function The style(s) to apply. Should be a valid argument to Ext.Element.applyStyles.
  		*/
  var setFieldStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the field s raw value directly bypassing value conversion change detection and validation
  		* @param value Object The value to set
  		* @returns Object value The field value that is set
  		*/
  var setRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the read only state of this field
  		* @param readOnly Boolean Whether the field should be read only.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object The value to set
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Transform the raw value before it is set
  		* @param value Object The value
  		* @returns Object The value to set
  		*/
  var transformRawValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Method] Uses getErrors to build an array of validation errors
  		* @param value Object The value to validate
  		* @returns Boolean True if all validations passed, false if one or more failed
  		*/
  var validateValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
  /** [Method] Converts a mixed type value to a raw representation suitable for displaying in the field
  		* @param value Object The mixed-type value to convert to the raw representation.
  		* @returns Object The converted raw value.
  		*/
  var valueToRaw: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
}

object IBaseField {
  @scala.inline
  def apply(): IBaseField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseField]
  }
  @scala.inline
  implicit class IBaseFieldOps[Self <: IBaseField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeError")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveErrorsTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeErrorsTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveErrorsTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeErrorsTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBodyEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBodyEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBodyEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBodyEl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLabelTextTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabelTextTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterLabelTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabelTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLabelTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabelTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterLabelTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLabelTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSubTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSubTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSubTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSubTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFitErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFitErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFitErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseBodyCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseBodyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseBodyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseBodyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchChanges(value: js.UndefOr[js.Any] => Unit): Self = {
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
    def withBeforeBodyEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBodyEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBodyEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBodyEl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLabelTextTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabelTextTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeLabelTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabelTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLabelTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabelTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeLabelTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLabelTpl")(js.undefined)
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
    def withBeforeSubTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSubTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeSubTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSubTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyEl")(js.undefined)
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
    def withCheckChangeBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckChangeBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckChangeEvents(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckChangeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChangeEvents")(js.undefined)
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
    def withClearCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCls")(js.undefined)
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
    def withDirtyCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirtyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorEl")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMsgCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsgCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMsgCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMsgCls")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractFileInput(value: () => _ | HTMLElement): Self = {
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
    def withFieldBodyCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBodyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldBodyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBodyCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFormItemCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formItemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveError(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveError")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveErrors(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetErrors(value: js.UndefOr[js.Any] => _ | Array): Self = {
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
    def withGetFieldLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFieldLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInputId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelableRenderData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelableRenderData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelableRenderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelableRenderData")(js.undefined)
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
    def withGetRawValue(value: () => _): Self = {
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
    def withGetSubTplData(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTplData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubTplData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTplData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubTplMarkup(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTplMarkup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubTplMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubTplMarkup")(js.undefined)
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
    def withGetSubmitValue(value: () => _): Self = {
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
    def withHasActiveError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasActiveError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasActiveError")(js.undefined)
        ret
    }
    @scala.inline
    def withHasVisibleLabel(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVisibleLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasVisibleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVisibleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEmptyLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmptyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEmptyLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmptyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHideLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideLabel")(js.undefined)
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
    def withInitLabelable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLabelable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitLabelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initLabelable")(js.undefined)
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
    def withInputAttrTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttrTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAttrTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttrTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withInputEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputEl")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCls")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: () => _ | Boolean): Self = {
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
    def withIsEqual(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean): Self = {
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
    def withIsFieldLabelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldLabelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFieldLabelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFieldLabelable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFileUpload(value: () => _ | Boolean): Self = {
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
    def withIsValid(value: () => _ | Boolean): Self = {
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
    def withLabelAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAttrTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAttrTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAttrTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAttrTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCell(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCell")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelClsExtra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClsExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelClsExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelClsExtra")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelEl")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPad")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkInvalid(value: js.UndefOr[js.Any] => Unit): Self = {
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
    def withMsgTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgTarget")(js.undefined)
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
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
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
    def withPreventMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventMark")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = {
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
    def withRawToValue(value: /* rawValue */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawToValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRawToValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawToValue")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCls")(js.undefined)
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
    def withSetActiveError(value: js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveError")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveErrors(value: js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFieldDefaults(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFieldDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFieldLabel(value: js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFieldLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFieldStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFieldStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: js.UndefOr[js.Any] => _): Self = {
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
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOriginalValue(value: js.UndefOr[js.Any] => _): Self = {
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
    def withTransformRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRawValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimLabelSeparator(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimLabelSeparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTrimLabelSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimLabelSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsetActiveError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetActiveError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUnsetActiveError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetActiveError")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => _ | Boolean): Self = {
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
    def withValidateOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(js.undefined)
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
    def withValidateValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateValue")(js.undefined)
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
    @scala.inline
    def withValueToRaw(value: /* value */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToRaw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValueToRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueToRaw")(js.undefined)
        ret
    }
  }
  
}

