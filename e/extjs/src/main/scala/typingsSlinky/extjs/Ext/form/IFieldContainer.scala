package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange
- typingsSlinky.extjs.Ext.form.ILabelable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined activeError, activeErrorsTpl, afterBodyEl, afterLabelTextTpl, afterLabelTpl, afterSubTpl, autoFitErrors, baseBodyCls, beforeBodyEl, beforeLabelTextTpl, beforeLabelTpl, beforeSubTpl, clearCls, errorMsgCls, fieldBodyCls, fieldLabel, formItemCls, hideEmptyLabel, hideLabel, invalidCls, labelAlign, labelAttrTpl, labelCls, labelClsExtra, labelPad, labelSeparator, labelStyle, labelWidth, msgTarget, preventMark, bodyEl, errorEl, isFieldLabelable, labelCell, labelEl, getActiveError, getActiveErrors, getFieldLabel, getInputId, getLabelWidth, getLabelableRenderData, getSubTplMarkup, hasActiveError, hasVisibleLabel, initLabelable, setActiveError, setActiveErrors, setFieldDefaults, setFieldLabel, trimLabelSeparator, unsetActiveError */ @js.native
trait IFieldContainer extends IContainer {
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
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBodyEl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeSubTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Ext.Element) */
  var bodyEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var clearCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var combineErrors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var combineLabels: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.Element) */
  var errorEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var errorMsgCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var fieldBodyCls: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var fieldLabel: js.UndefOr[String] = js.native
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
  /** [Method] Takes an Array of invalid Ext form field Field objects and builds a combined list of error messages from them
  		* @param invalidFields Ext.form.field.Field[] An Array of the sub-fields which are currently invalid.
  		* @returns String[] The combined list of error messages
  		*/
  var getCombinedErrors: js.UndefOr[js.Function1[/* invalidFields */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Returns the combined field label if combineLabels is set to true and if there is no set fieldLabel
  		* @returns String The label, or empty string if none.
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
  /** [Method] Gets the markup to be inserted into the outer template s bodyEl
  		* @returns String The markup to be inserted
  		*/
  var getSubTplMarkup: js.UndefOr[js.Function0[String]] = js.native
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
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initLabelable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isFieldLabelable: js.UndefOr[Boolean] = js.native
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
  /** [Config Option] (String) */
  var labelConnector: js.UndefOr[String] = js.native
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
  /** [Config Option] (String) */
  var msgTarget: js.UndefOr[String] = js.native
  /** [Method] Called when a Ext form Labelable instance is added to the container s subtree
  		* @param labelable Ext.form.Labelable The instance that was added
  		*/
  @JSName("onAdd")
  var onAdd_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.native
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Called when a Ext form Labelable instance is removed from the container s subtree
  		* @param labelable Ext.form.Labelable The instance that was removed
  		*/
  @JSName("onRemove")
  var onRemove_IFieldContainer: js.UndefOr[js.Function1[/* labelable */ js.UndefOr[ILabelable], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var preventMark: js.UndefOr[Boolean] = js.native
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
  /** [Method] Returns the trimmed label by slicing off the label separator character
  		* @returns String The trimmed field label, or empty string if not defined
  		*/
  var trimLabelSeparator: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Clears the active error message s */
  var unsetActiveError: js.UndefOr[js.Function0[Unit]] = js.native
}

object IFieldContainer {
  @scala.inline
  def apply(): IFieldContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldContainer]
  }
  @scala.inline
  implicit class IFieldContainerOps[Self <: IFieldContainer] (val x: Self) extends AnyVal {
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
    def withCombineErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombineErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withCombineLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombineLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineLabels")(js.undefined)
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
    def withFieldDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDefaults")(js.undefined)
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
    def withGetCombinedErrors(value: /* invalidFields */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCombinedErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCombinedErrors")(js.undefined)
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
    def withInitFieldAncestor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFieldAncestor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitFieldAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFieldAncestor")(js.undefined)
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
    def withLabelConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelConnector")(js.undefined)
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
    def withOnAdd(value: /* labelable */ js.UndefOr[ILabelable] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldErrorChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldErrorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldErrorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldValidityChange(value: (js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldValidityChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldValidityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldValidityChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* labelable */ js.UndefOr[ILabelable] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
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
  }
  
}

