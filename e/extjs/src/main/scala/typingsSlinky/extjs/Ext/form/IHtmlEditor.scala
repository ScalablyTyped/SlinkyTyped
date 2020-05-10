package typingsSlinky.extjs.Ext.form

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.toolbar.IToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.field.IField because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, disabled, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined name, submitValue, validateOnChange, value, isFormField, originalValue, batchChanges, beforeReset, checkChange, checkDirty, clearInvalid, extractFileInput, getErrors, getModelData, getName, getSubmitData, getValue, initField, initValue, isDirty, isEqual, isFileUpload, isValid, markInvalid, reset, resetOriginalValue, setValue, transformOriginalValue, validate */ @js.native
trait IHtmlEditor extends IFieldContainer {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterIFrameTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterTextAreaTpl: js.UndefOr[js.Any] = js.native
  /** [Method] A utility for grouping a set of modifications which may trigger value changes into a single transaction to prevent e
  		* @param fn Object A function containing the transaction code
  		*/
  var batchChanges: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeIFrameTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Template method before a field is reset  */
  var beforeReset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeTextAreaTpl: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var buttonTips: js.UndefOr[js.Any] = js.native
  /** [Method] Checks whether the value of the field has changed since the last time it was checked  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Checks the isDirty state of the field and if it has changed since the last time it was checked fires the dirtychange  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] If you need want custom HTML cleanup this is the method you should override
  		* @param html String The HTML to be cleaned
  		* @returns String The cleaned HTML
  		*/
  var cleanHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[String], String]] = js.native
  /** [Method] Clear any invalid styles messages for this field  */
  var clearInvalid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var createLinkText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultLinkValue: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultValue: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var enableAlignments: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableColors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFont: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFontSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableFormat: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableLinks: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableLists: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableSourceEdit: js.UndefOr[Boolean] = js.native
  /** [Method] Executes a Midas editor command directly on the editor document
  		* @param cmd String The Midas command
  		* @param value String/Boolean The value to pass to the command
  		*/
  var execCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Only relevant if the instance s isFileUpload method returns true
  		* @returns HTMLElement
  		*/
  var extractFileInput: js.UndefOr[js.Function0[_ | HTMLElement]] = js.native
  /** [Method] Try to focus this component
  		* @param selectText Object
  		* @param delay Object
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_IHtmlEditor: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Config Option] (String[]) */
  var fontFamilies: js.UndefOr[Array] = js.native
  /** [Method] Called when the editor initializes the iframe with HTML contents  */
  var getDocMarkup: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Runs this field s validators and returns an array of error messages for any validation failures
  		* @param value Object The value to get errors for (defaults to the current field value)
  		* @returns String[] All error messages for this field; an empty Array if none.
  		*/
  var getErrors: js.UndefOr[js.Function1[js.UndefOr[js.Any], _ | Array]] = js.native
  /** [Method] Returns the value s that should be saved to the Ext data Model instance for this field when Ext form Basic updateRe
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getModelData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the name attribute of the field
  		* @returns String name The field name
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the parameter s that would be included in a standard form submit for this field
  		* @returns Object A mapping of submit parameter names to values; each value should be a string, or an array of strings if that particular name has multiple values. It can also return null if there are no parameters to be submitted.
  		*/
  var getSubmitData: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the editor s toolbar
  		* @returns Ext.toolbar.Toolbar
  		*/
  var getToolbar: js.UndefOr[js.Function0[IToolbar]] = js.native
  /** [Method] Returns the current data value of the field
  		* @returns Object value The field value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var iframeAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Method] Initializes this Field mixin on the current instance  */
  var initField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the field s value based on the initial config  */
  var initValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Inserts the passed text at the current cursor position
  		* @param text String
  		*/
  var insertAtCursor: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  var isDirty: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Returns whether two field values are logically equal
  		* @param value1 Object
  		* @param value2 Object
  		* @returns Boolean True if the values are equal, false if inequal.
  		*/
  var isEqual: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _ | Boolean]] = js.native
  /** [Method] Returns whether this Field is a file upload field if it returns true forms will use special techniques for submitti
  		* @returns Boolean
  		*/
  var isFileUpload: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Property] (Boolean) */
  var isFormField: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value
  		* @returns Boolean True if the value is valid, else false
  		*/
  var isValid: js.UndefOr[js.Function0[_ | Boolean]] = js.native
  /** [Method] Associate one or more error messages with this field
  		* @param errors String/String[] The error message(s) for the field.
  		*/
  var markInvalid: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var originalValue: js.UndefOr[js.Any] = js.native
  /** [Method] Pushes the value of the textarea into the iframe editor  */
  var pushValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Executes a Midas editor command on the editor document and performs necessary focus and toolbar updates
  		* @param cmd String The Midas command
  		* @param value String/Boolean The value to pass to the command
  		*/
  var relayCmd: js.UndefOr[js.Function2[/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value  */
  var resetOriginalValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the read only state of this field
  		* @param readOnly Boolean Whether the field should be read only.
  		*/
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a data value into the field and runs the change detection and validation
  		* @param value Object
  		* @returns any this
  		*/
  var setValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var submitValue: js.UndefOr[Boolean] = js.native
  /** [Method] Syncs the contents of the editor iframe with the textarea  */
  var syncValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Toggles the editor between standard and source edit mode
  		* @param sourceEditMode Boolean True for source edit, false for standard
  		*/
  var toggleSourceEdit: js.UndefOr[js.Function1[/* sourceEditMode */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Allows for any necessary modifications before the original value is set
  		* @param value Object The initial value
  		* @returns Object The modified initial value
  		*/
  var transformOriginalValue: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Method] Triggers a toolbar update by reading the markup state of the current selection in the editor  */
  var updateToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns any True if the value is valid, else false
  		*/
  var validate: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}

object IHtmlEditor {
  @scala.inline
  def apply(): IHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHtmlEditor]
  }
  @scala.inline
  implicit class IHtmlEditorOps[Self <: IHtmlEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterIFrameTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterIFrameTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterIFrameTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterIFrameTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterTextAreaTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTextAreaTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterTextAreaTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterTextAreaTpl")(js.undefined)
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
    def withBeforeIFrameTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIFrameTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeIFrameTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeIFrameTpl")(js.undefined)
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
    def withBeforeTextAreaTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTextAreaTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeTextAreaTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeTextAreaTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTips(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTips")(js.undefined)
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
    def withCleanHtml(value: /* html */ js.UndefOr[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCleanHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanHtml")(js.undefined)
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
    def withCreateLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinkText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultButtonUI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultButtonUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButtonUI")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLinkValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLinkValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLinkValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAlignments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAlignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAlignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAlignments")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFont(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFont")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFontSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLists")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSourceEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSourceEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSourceEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSourceEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withExecCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execCmd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExecCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execCmd")(js.undefined)
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
    def withFocus(value: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamilies(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamilies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamilies")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDocMarkup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocMarkup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDocMarkup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocMarkup")(js.undefined)
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
    def withGetToolbar(value: () => IToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.undefined)
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
    def withIframeAttrTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttrTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeAttrTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttrTpl")(js.undefined)
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
    def withInsertAtCursor(value: /* text */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAtCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInsertAtCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertAtCursor")(js.undefined)
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
    def withPushValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPushValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayCmd(value: (/* cmd */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayCmd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayCmd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayCmd")(js.undefined)
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
    def withSyncValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncValue")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleSourceEdit(value: /* sourceEditMode */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSourceEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToggleSourceEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSourceEdit")(js.undefined)
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
    def withUpdateToolbar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdateToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateToolbar")(js.undefined)
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

