package typingsSlinky.extjs.Ext.form.field

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate
- typingsSlinky.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ @js.native
trait IBase extends IComponent {
  
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
  
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  @JSName("initRenderData")
  var initRenderData_IBase: js.UndefOr[js.Function0[_]] = js.native
  
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
  var onRender_IBase: js.UndefOr[js.Function0[Unit]] = js.native
  
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
object IBase {
  
  @scala.inline
  def apply(): IBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBase]
  }
  
  @scala.inline
  implicit class IBaseMutableBuilder[Self <: IBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveError(value: String): Self = StObject.set(x, "activeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveErrorUndefined: Self = StObject.set(x, "activeError", js.undefined)
    
    @scala.inline
    def setActiveErrorsTpl(value: js.Any): Self = StObject.set(x, "activeErrorsTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveErrorsTplUndefined: Self = StObject.set(x, "activeErrorsTpl", js.undefined)
    
    @scala.inline
    def setAfterBodyEl(value: js.Any): Self = StObject.set(x, "afterBodyEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBodyElUndefined: Self = StObject.set(x, "afterBodyEl", js.undefined)
    
    @scala.inline
    def setAfterLabelTextTpl(value: js.Any): Self = StObject.set(x, "afterLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterLabelTextTplUndefined: Self = StObject.set(x, "afterLabelTextTpl", js.undefined)
    
    @scala.inline
    def setAfterLabelTpl(value: js.Any): Self = StObject.set(x, "afterLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterLabelTplUndefined: Self = StObject.set(x, "afterLabelTpl", js.undefined)
    
    @scala.inline
    def setAfterSubTpl(value: js.Any): Self = StObject.set(x, "afterSubTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSubTplUndefined: Self = StObject.set(x, "afterSubTpl", js.undefined)
    
    @scala.inline
    def setAutoFitErrors(value: Boolean): Self = StObject.set(x, "autoFitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitErrorsUndefined: Self = StObject.set(x, "autoFitErrors", js.undefined)
    
    @scala.inline
    def setBaseBodyCls(value: String): Self = StObject.set(x, "baseBodyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseBodyClsUndefined: Self = StObject.set(x, "baseBodyCls", js.undefined)
    
    @scala.inline
    def setBatchChanges(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "batchChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
    
    @scala.inline
    def setBeforeBodyEl(value: js.Any): Self = StObject.set(x, "beforeBodyEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBodyElUndefined: Self = StObject.set(x, "beforeBodyEl", js.undefined)
    
    @scala.inline
    def setBeforeLabelTextTpl(value: js.Any): Self = StObject.set(x, "beforeLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeLabelTextTplUndefined: Self = StObject.set(x, "beforeLabelTextTpl", js.undefined)
    
    @scala.inline
    def setBeforeLabelTpl(value: js.Any): Self = StObject.set(x, "beforeLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeLabelTplUndefined: Self = StObject.set(x, "beforeLabelTpl", js.undefined)
    
    @scala.inline
    def setBeforeReset(value: () => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    @scala.inline
    def setBeforeSubTpl(value: js.Any): Self = StObject.set(x, "beforeSubTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSubTplUndefined: Self = StObject.set(x, "beforeSubTpl", js.undefined)
    
    @scala.inline
    def setBodyEl(value: IElement): Self = StObject.set(x, "bodyEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyElUndefined: Self = StObject.set(x, "bodyEl", js.undefined)
    
    @scala.inline
    def setCheckChange(value: () => Unit): Self = StObject.set(x, "checkChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckChangeBuffer(value: Double): Self = StObject.set(x, "checkChangeBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckChangeBufferUndefined: Self = StObject.set(x, "checkChangeBuffer", js.undefined)
    
    @scala.inline
    def setCheckChangeEvents(value: Array): Self = StObject.set(x, "checkChangeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckChangeEventsUndefined: Self = StObject.set(x, "checkChangeEvents", js.undefined)
    
    @scala.inline
    def setCheckChangeUndefined: Self = StObject.set(x, "checkChange", js.undefined)
    
    @scala.inline
    def setCheckDirty(value: () => Unit): Self = StObject.set(x, "checkDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckDirtyUndefined: Self = StObject.set(x, "checkDirty", js.undefined)
    
    @scala.inline
    def setClearCls(value: String): Self = StObject.set(x, "clearCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearClsUndefined: Self = StObject.set(x, "clearCls", js.undefined)
    
    @scala.inline
    def setClearInvalid(value: () => Unit): Self = StObject.set(x, "clearInvalid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    @scala.inline
    def setDirtyCls(value: String): Self = StObject.set(x, "dirtyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyClsUndefined: Self = StObject.set(x, "dirtyCls", js.undefined)
    
    @scala.inline
    def setErrorEl(value: IElement): Self = StObject.set(x, "errorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorElUndefined: Self = StObject.set(x, "errorEl", js.undefined)
    
    @scala.inline
    def setErrorMsgCls(value: String): Self = StObject.set(x, "errorMsgCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMsgClsUndefined: Self = StObject.set(x, "errorMsgCls", js.undefined)
    
    @scala.inline
    def setExtractFileInput(value: () => _ | HTMLElement): Self = StObject.set(x, "extractFileInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtractFileInputUndefined: Self = StObject.set(x, "extractFileInput", js.undefined)
    
    @scala.inline
    def setFieldBodyCls(value: String): Self = StObject.set(x, "fieldBodyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldBodyClsUndefined: Self = StObject.set(x, "fieldBodyCls", js.undefined)
    
    @scala.inline
    def setFieldCls(value: String): Self = StObject.set(x, "fieldCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldClsUndefined: Self = StObject.set(x, "fieldCls", js.undefined)
    
    @scala.inline
    def setFieldLabel(value: String): Self = StObject.set(x, "fieldLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLabelUndefined: Self = StObject.set(x, "fieldLabel", js.undefined)
    
    @scala.inline
    def setFieldStyle(value: String): Self = StObject.set(x, "fieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldStyleUndefined: Self = StObject.set(x, "fieldStyle", js.undefined)
    
    @scala.inline
    def setFocusCls(value: String): Self = StObject.set(x, "focusCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusClsUndefined: Self = StObject.set(x, "focusCls", js.undefined)
    
    @scala.inline
    def setFormItemCls(value: String): Self = StObject.set(x, "formItemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormItemClsUndefined: Self = StObject.set(x, "formItemCls", js.undefined)
    
    @scala.inline
    def setGetActiveError(value: () => String): Self = StObject.set(x, "getActiveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveErrorUndefined: Self = StObject.set(x, "getActiveError", js.undefined)
    
    @scala.inline
    def setGetActiveErrors(value: () => Array): Self = StObject.set(x, "getActiveErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveErrorsUndefined: Self = StObject.set(x, "getActiveErrors", js.undefined)
    
    @scala.inline
    def setGetErrors(value: js.UndefOr[js.Any] => _ | Array): Self = StObject.set(x, "getErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetErrorsUndefined: Self = StObject.set(x, "getErrors", js.undefined)
    
    @scala.inline
    def setGetFieldLabel(value: () => String): Self = StObject.set(x, "getFieldLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldLabelUndefined: Self = StObject.set(x, "getFieldLabel", js.undefined)
    
    @scala.inline
    def setGetInputId(value: () => String): Self = StObject.set(x, "getInputId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputIdUndefined: Self = StObject.set(x, "getInputId", js.undefined)
    
    @scala.inline
    def setGetLabelWidth(value: () => Double): Self = StObject.set(x, "getLabelWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    @scala.inline
    def setGetLabelableRenderData(value: () => _): Self = StObject.set(x, "getLabelableRenderData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelableRenderDataUndefined: Self = StObject.set(x, "getLabelableRenderData", js.undefined)
    
    @scala.inline
    def setGetModelData(value: () => _): Self = StObject.set(x, "getModelData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModelDataUndefined: Self = StObject.set(x, "getModelData", js.undefined)
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    @scala.inline
    def setGetRawValue(value: () => _): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawValueUndefined: Self = StObject.set(x, "getRawValue", js.undefined)
    
    @scala.inline
    def setGetSubTplData(value: () => _): Self = StObject.set(x, "getSubTplData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubTplDataUndefined: Self = StObject.set(x, "getSubTplData", js.undefined)
    
    @scala.inline
    def setGetSubTplMarkup(value: () => String): Self = StObject.set(x, "getSubTplMarkup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubTplMarkupUndefined: Self = StObject.set(x, "getSubTplMarkup", js.undefined)
    
    @scala.inline
    def setGetSubmitData(value: () => _): Self = StObject.set(x, "getSubmitData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubmitDataUndefined: Self = StObject.set(x, "getSubmitData", js.undefined)
    
    @scala.inline
    def setGetSubmitValue(value: () => _): Self = StObject.set(x, "getSubmitValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubmitValueUndefined: Self = StObject.set(x, "getSubmitValue", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setHasActiveError(value: () => Boolean): Self = StObject.set(x, "hasActiveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasActiveErrorUndefined: Self = StObject.set(x, "hasActiveError", js.undefined)
    
    @scala.inline
    def setHasVisibleLabel(value: () => Boolean): Self = StObject.set(x, "hasVisibleLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasVisibleLabelUndefined: Self = StObject.set(x, "hasVisibleLabel", js.undefined)
    
    @scala.inline
    def setHideEmptyLabel(value: Boolean): Self = StObject.set(x, "hideEmptyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideEmptyLabelUndefined: Self = StObject.set(x, "hideEmptyLabel", js.undefined)
    
    @scala.inline
    def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    
    @scala.inline
    def setInitField(value: () => Unit): Self = StObject.set(x, "initField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitFieldUndefined: Self = StObject.set(x, "initField", js.undefined)
    
    @scala.inline
    def setInitLabelable(value: () => Unit): Self = StObject.set(x, "initLabelable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitLabelableUndefined: Self = StObject.set(x, "initLabelable", js.undefined)
    
    @scala.inline
    def setInitRenderData(value: () => _): Self = StObject.set(x, "initRenderData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    @scala.inline
    def setInputAttrTpl(value: js.Any): Self = StObject.set(x, "inputAttrTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAttrTplUndefined: Self = StObject.set(x, "inputAttrTpl", js.undefined)
    
    @scala.inline
    def setInputEl(value: IElement): Self = StObject.set(x, "inputEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputElUndefined: Self = StObject.set(x, "inputEl", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setInvalidCls(value: String): Self = StObject.set(x, "invalidCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidClsUndefined: Self = StObject.set(x, "invalidCls", js.undefined)
    
    @scala.inline
    def setInvalidText(value: String): Self = StObject.set(x, "invalidText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidTextUndefined: Self = StObject.set(x, "invalidText", js.undefined)
    
    @scala.inline
    def setIsDirty(value: () => _ | Boolean): Self = StObject.set(x, "isDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    @scala.inline
    def setIsEqual(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ | Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEqualUndefined: Self = StObject.set(x, "isEqual", js.undefined)
    
    @scala.inline
    def setIsFieldLabelable(value: Boolean): Self = StObject.set(x, "isFieldLabelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFieldLabelableUndefined: Self = StObject.set(x, "isFieldLabelable", js.undefined)
    
    @scala.inline
    def setIsFileUpload(value: () => _ | Boolean): Self = StObject.set(x, "isFileUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFileUploadUndefined: Self = StObject.set(x, "isFileUpload", js.undefined)
    
    @scala.inline
    def setIsFormField(value: Boolean): Self = StObject.set(x, "isFormField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFormFieldUndefined: Self = StObject.set(x, "isFormField", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => _ | Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    @scala.inline
    def setLabelAttrTpl(value: js.Any): Self = StObject.set(x, "labelAttrTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAttrTplUndefined: Self = StObject.set(x, "labelAttrTpl", js.undefined)
    
    @scala.inline
    def setLabelCell(value: IElement): Self = StObject.set(x, "labelCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCellUndefined: Self = StObject.set(x, "labelCell", js.undefined)
    
    @scala.inline
    def setLabelCls(value: String): Self = StObject.set(x, "labelCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelClsExtra(value: String): Self = StObject.set(x, "labelClsExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelClsExtraUndefined: Self = StObject.set(x, "labelClsExtra", js.undefined)
    
    @scala.inline
    def setLabelClsUndefined: Self = StObject.set(x, "labelCls", js.undefined)
    
    @scala.inline
    def setLabelEl(value: IElement): Self = StObject.set(x, "labelEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelElUndefined: Self = StObject.set(x, "labelEl", js.undefined)
    
    @scala.inline
    def setLabelPad(value: Double): Self = StObject.set(x, "labelPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPadUndefined: Self = StObject.set(x, "labelPad", js.undefined)
    
    @scala.inline
    def setLabelSeparator(value: String): Self = StObject.set(x, "labelSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSeparatorUndefined: Self = StObject.set(x, "labelSeparator", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    @scala.inline
    def setMarkInvalid(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "markInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    @scala.inline
    def setMsgTarget(value: String): Self = StObject.set(x, "msgTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgTargetUndefined: Self = StObject.set(x, "msgTarget", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: js.Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setPreventMark(value: Boolean): Self = StObject.set(x, "preventMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventMarkUndefined: Self = StObject.set(x, "preventMark", js.undefined)
    
    @scala.inline
    def setProcessRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "processRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessRawValueUndefined: Self = StObject.set(x, "processRawValue", js.undefined)
    
    @scala.inline
    def setRawToValue(value: /* rawValue */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "rawToValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRawToValueUndefined: Self = StObject.set(x, "rawToValue", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyCls(value: String): Self = StObject.set(x, "readOnlyCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyClsUndefined: Self = StObject.set(x, "readOnlyCls", js.undefined)
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetOriginalValue(value: () => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setSetActiveError(value: js.UndefOr[String] => Unit): Self = StObject.set(x, "setActiveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveErrorUndefined: Self = StObject.set(x, "setActiveError", js.undefined)
    
    @scala.inline
    def setSetActiveErrors(value: js.UndefOr[Array] => Unit): Self = StObject.set(x, "setActiveErrors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveErrorsUndefined: Self = StObject.set(x, "setActiveErrors", js.undefined)
    
    @scala.inline
    def setSetFieldDefaults(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFieldDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldDefaultsUndefined: Self = StObject.set(x, "setFieldDefaults", js.undefined)
    
    @scala.inline
    def setSetFieldLabel(value: js.UndefOr[String] => Unit): Self = StObject.set(x, "setFieldLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldLabelUndefined: Self = StObject.set(x, "setFieldLabel", js.undefined)
    
    @scala.inline
    def setSetFieldStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFieldStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldStyleUndefined: Self = StObject.set(x, "setFieldStyle", js.undefined)
    
    @scala.inline
    def setSetRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRawValueUndefined: Self = StObject.set(x, "setRawValue", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setSubmitValue(value: Boolean): Self = StObject.set(x, "submitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitValueUndefined: Self = StObject.set(x, "submitValue", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTransformOriginalValue(value: js.UndefOr[js.Any] => _): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
    
    @scala.inline
    def setTransformRawValue(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "transformRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformRawValueUndefined: Self = StObject.set(x, "transformRawValue", js.undefined)
    
    @scala.inline
    def setTrimLabelSeparator(value: () => String): Self = StObject.set(x, "trimLabelSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrimLabelSeparatorUndefined: Self = StObject.set(x, "trimLabelSeparator", js.undefined)
    
    @scala.inline
    def setUnsetActiveError(value: () => Unit): Self = StObject.set(x, "unsetActiveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsetActiveErrorUndefined: Self = StObject.set(x, "unsetActiveError", js.undefined)
    
    @scala.inline
    def setValidate(value: () => _ | Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlurUndefined: Self = StObject.set(x, "validateOnBlur", js.undefined)
    
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValidateValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "validateValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateValueUndefined: Self = StObject.set(x, "validateValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueToRaw(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "valueToRaw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueToRawUndefined: Self = StObject.set(x, "valueToRaw", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
