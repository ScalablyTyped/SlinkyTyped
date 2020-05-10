package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.form.IBasic
import typingsSlinky.extjs.Ext.form.ILabelable
import typingsSlinky.extjs.Ext.form.field.IField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ @js.native
trait IFormPanel
  extends typingsSlinky.extjs.Ext.panel.IPanel {
  /** [Method] Forces each field within the form panel to check if its value has changed  */
  var checkChange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Method] Provides access to the Form which this Panel contains
  		* @returns Ext.form.Basic The Form which this Panel contains.
  		*/
  var getForm: js.UndefOr[js.Function0[IBasic]] = js.native
  /** [Method] Returns the currently loaded Ext data Model instance if one was loaded via loadRecord
  		* @returns Ext.data.Model The loaded instance
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Convenience function for fetching the current value of each field in the form
  		* @param asString Boolean If true, will return the key/value collection as a single URL-encoded param string.
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @param includeEmptyText Boolean If true, the configured emptyText of empty fields will be used.
  		* @param useDataValues Boolean If true, the getModelData method is used to retrieve values from fields, otherwise the getSubmitData method is used.
  		* @returns String/Object
  		*/
  var getValues: js.UndefOr[
    js.Function4[
      /* asString */ js.UndefOr[Boolean], 
      /* dirtyOnly */ js.UndefOr[Boolean], 
      /* includeEmptyText */ js.UndefOr[Boolean], 
      /* useDataValues */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Convenience function to check if the form has any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Convenience function to check if the form has any dirty fields
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Convenience function to check if the form has all valid fields
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic load call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.load and Ext.form.Basic.doAction for details)
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[js.Function2[js.UndefOr[IField], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var pollForChanges: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var pollInterval: js.UndefOr[Double] = js.native
  /** [Method] Start an interval task to continuously poll all the fields in the form for changes in their values
  		* @param interval Number The interval in milliseconds at which the check should run.
  		*/
  var startPolling: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Stop a running interval task that was started by startPolling  */
  var stopPolling: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] This is a proxy for the underlying BasicForm s Ext form Basic submit call
  		* @param options Object The options to pass to the action (see Ext.form.Basic.submit and Ext.form.Basic.doAction for details)
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
}

object IFormPanel {
  @scala.inline
  def apply(): IFormPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormPanel]
  }
  @scala.inline
  implicit class IFormPanelOps[Self <: IFormPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withGetForm(value: () => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForm")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecord(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValues(
      value: (/* asString */ js.UndefOr[Boolean], /* dirtyOnly */ js.UndefOr[Boolean], /* includeEmptyText */ js.UndefOr[Boolean], /* useDataValues */ js.UndefOr[Boolean]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHasInvalidField(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInvalidField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasInvalidField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInvalidField")(js.undefined)
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
    def withIsDirty(value: () => Boolean): Self = {
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
    def withIsValid(value: () => Boolean): Self = {
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
    def withLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[java.lang.String]) => Unit): Self = {
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
    def withOnFieldValidityChange(value: (js.UndefOr[IField], js.UndefOr[Boolean]) => Unit): Self = {
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
    def withPollForChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollForChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollForChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollForChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withPollInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPolling(value: /* interval */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPolling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStartPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPolling(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPolling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateRecord(value: /* record */ js.UndefOr[IModel] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRecord")(js.undefined)
        ret
    }
  }
  
}

