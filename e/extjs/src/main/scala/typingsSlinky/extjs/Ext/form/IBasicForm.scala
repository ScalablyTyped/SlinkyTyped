package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.container.IContainer
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.util.IMixedCollection
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBasicForm extends IObservable {
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  /** [Method] Calls Ext applyIf for all field in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyIfToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Method] Calls Ext apply for all fields in this form with the passed object
  		* @param obj Object The object to be applied
  		* @returns Ext.form.Basic this
  		*/
  var applyToFields: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] Check whether the dirty state of the entire form has changed since it was last checked and if so fire the dirtychang  */
  var checkDirty: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Check whether the validity of the entire form has changed since it was last checked and if so fire the validitychang  */
  var checkValidity: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clears all invalid field messages in this form
  		* @returns Ext.form.Basic this
  		*/
  var clearInvalid: js.UndefOr[js.Function0[IBasic]] = js.native
  /** [Method] Destroys this object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs a predefined action an implementation of Ext form action Action to perform application specific processing
  		* @param action String/Ext.form.action.Action The name of the predefined action type, or instance of Ext.form.action.Action to perform.
  		* @param options Object The options to pass to the Ext.form.action.Action that will get created, if the action argument is a String. All of the config options listed below are supported by both the submit and load actions unless otherwise noted (custom actions could also accept other config options):
  		* @returns Ext.form.Basic this
  		*/
  var doAction: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], IBasic]
  ] = js.native
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var errorReader: js.UndefOr[js.Any] = js.native
  /** [Method] Find a specific Ext form field Field in this form by id or name
  		* @param id String The value to search for (specify either a id or name or hiddenName).
  		* @returns any The first matching field, or null if none was found.
  		*/
  var findField: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getModelData  method to collect the values
  		* @param dirtyOnly Boolean If true, only fields that are dirty will be included in the result.
  		* @returns Object
  		*/
  var getFieldValues: js.UndefOr[js.Function1[/* dirtyOnly */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Return all the Ext form field Field components in the owner container
  		* @returns Ext.util.MixedCollection Collection of the Field objects
  		*/
  var getFields: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Returns the last Ext data Model instance that was loaded via loadRecord
  		* @returns Ext.data.Model The record
  		*/
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Retrieves the fields in the form as a set of key value pairs using their getSubmitData  method to collect the values
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
  /** [Method] Returns true if the form contains any invalid fields  */
  var hasInvalidField: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns true if the form contains a file upload field
  		* @returns Boolean
  		*/
  var hasUpload: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if any fields in this form have changed from their original values
  		* @returns Boolean
  		*/
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if client side validation on the form is successful
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var jsonSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Shortcut to do a load action
  		* @param options Object The options to pass to the action (see doAction for details)
  		* @returns Ext.form.Basic this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Method] Loads an Ext data Model into this form by calling setValues with the record data
  		* @param record Ext.data.Model The record to load
  		* @returns Ext.form.Basic this
  		*/
  var loadRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Method] Mark fields in this form invalid in bulk
  		* @param errors Object/Object[]/Ext.data.Errors Either an array in the form [{id:'fieldId', msg:'The message'}, ...], an object hash of {id: msg, id2: msg2}, or a Ext.data.Errors object.
  		* @returns Ext.form.Basic this
  		*/
  var markInvalid: js.UndefOr[js.Function1[/* errors */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Property] (Ext.container.Container) */
  var owner: js.UndefOr[IContainer] = js.native
  /** [Config Option] (String/String[]) */
  var paramOrder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var paramsAsHash: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.native
  /** [Method] Resets all fields in this form
  		* @param resetRecord Boolean True to unbind any record set by loadRecord
  		* @returns Ext.form.Basic this
  		*/
  var reset: js.UndefOr[js.Function1[/* resetRecord */ js.UndefOr[Boolean], IBasic]] = js.native
  /** [Method] Set values for fields in this form in bulk
  		* @param values Object/Object[] Either an array in the form: [{id:'clientName', value:'Fred. Olsen Lines'}, {id:'portOfLoading', value:'FXT'}, {id:'portOfDischarge', value:'OSL'} ]  or an object hash of the form: {  clientName: 'Fred. Olsen Lines',  portOfLoading: 'FXT',  portOfDischarge: 'OSL' }
  		* @returns Ext.form.Basic this
  		*/
  var setValues: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Boolean) */
  var standardSubmit: js.UndefOr[Boolean] = js.native
  /** [Method] Shortcut to do a submit action
  		* @param options Object The options to pass to the action (see doAction for details).
  		* @returns Ext.form.Basic this
  		*/
  var submit: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var trackResetOnLoad: js.UndefOr[Boolean] = js.native
  /** [Method] Persists the values in this form into the passed Ext data Model object in a beginEdit endEdit block
  		* @param record Ext.data.Model The record to edit
  		* @returns Ext.form.Basic this
  		*/
  var updateRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], IBasic]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var waitMsgTarget: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var waitTitle: js.UndefOr[String] = js.native
}

object IBasicForm {
  @scala.inline
  def apply(): IBasicForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasicForm]
  }
  @scala.inline
  implicit class IBasicFormOps[Self <: IBasicForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyIfToFields(value: /* obj */ js.UndefOr[js.Any] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIfToFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyIfToFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyIfToFields")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyToFields(value: /* obj */ js.UndefOr[js.Any] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyToFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyToFields")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(js.undefined)
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
    def withCheckValidity(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkValidity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCheckValidity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkValidity")(js.undefined)
        ret
    }
    @scala.inline
    def withClearInvalid(value: () => IBasic): Self = {
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
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDoAction(value: (/* action */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDoAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAction")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorReader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorReader")(js.undefined)
        ret
    }
    @scala.inline
    def withFindField(value: /* id */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFieldValues(value: /* dirtyOnly */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFieldValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFields(value: () => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.undefined)
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
    def withHasUpload(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUpload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUpload")(js.undefined)
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
    def withJsonSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* options */ js.UndefOr[js.Any] => IBasic): Self = {
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
    def withMarkInvalid(value: /* errors */ js.UndefOr[js.Any] => IBasic): Self = {
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
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withParamOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsAsHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamsAsHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsAsHash")(js.undefined)
        ret
    }
    @scala.inline
    def withReader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* resetRecord */ js.UndefOr[Boolean] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValues(value: /* values */ js.UndefOr[js.Any] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit(value: /* options */ js.UndefOr[js.Any] => IBasic): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResetOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResetOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResetOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResetOnLoad")(js.undefined)
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
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitMsgTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsgTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitMsgTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitMsgTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTitle")(js.undefined)
        ret
    }
  }
  
}

