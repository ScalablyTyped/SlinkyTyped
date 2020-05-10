package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IXTemplate
import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IComboBox
  extends typingsSlinky.extjs.Ext.form.field.IPicker {
  /** [Method] A method called when the filtering caused by the doQuery call is complete and the store has been either filtered loca
  		* @param queryPlan Object An object containing details about the query was executed.
  		*/
  var afterQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var allQuery: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /** [Method] Template method to do any pre blur processing  */
  @JSName("beforeBlur")
  var beforeBlur_IComboBox: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] A method which may modify aspects of how the store is to be filtered if queryMode is local  of loaded if queryMod
  		* @param queryPlan Object An object containing details about the query to be executed.
  		*/
  var beforeQuery: js.UndefOr[js.Function1[/* queryPlan */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Binds a store to this instance
  		* @param store Ext.data.AbstractStore/String The store to bind or ID of the store. When no store given (or when null or undefined passed), unbinds the existing store.
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** [Method] Clears any value currently set in the ComboBox  */
  var clearValue: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var defaultListConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var delimiter: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  /** [Method] Executes a query to filter the dropdown list
  		* @param queryString String The string to use to filter available items by matching against the configured valueField.
  		* @param forceAll Boolean true to force the query to execute even if there are currently fewer characters in the field than the minimum specified by the minChars config option. It also clears any filter previously saved in the current store.
  		* @param rawQuery Boolean Pass as true if the raw typed value is being used as the query string. This causes the resulting store load to leave the raw value undisturbed.
  		* @returns Boolean true if the query was permitted to run, false if it was cancelled by a beforequery handler.
  		*/
  var doQuery: js.UndefOr[
    js.Function3[
      /* queryString */ js.UndefOr[String], 
      /* forceAll */ js.UndefOr[Boolean], 
      /* rawQuery */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enableRegEx: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.XTemplate) */
  var fieldSubTpl: js.UndefOr[IXTemplate] = js.native
  /** [Method] Finds the record by searching for a specific field value combination
  		* @param field String The name of the field to test.
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecord: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], IModel]
  ] = js.native
  /** [Method] Finds the record by searching values in the displayField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByDisplay: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Finds the record by searching values in the valueField
  		* @param value Object The value to match the field against.
  		* @returns Ext.data.Model The matched record or false.
  		*/
  var findRecordByValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Config Option] (Boolean) */
  var forceSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the store associated with this ComboBox
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Method] Returns the value that would be included in a standard form submit for this field
  		* @returns String The value to be submitted, or null.
  		*/
  @JSName("getSubmitValue")
  var getSubmitValue_IComboBox: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean) */
  var growToLongestValue: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var hiddenName: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var lastQuery: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var minChars: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		*/
  var onBindStore: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean], Unit]
  ] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.native
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var queryCaching: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var queryDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var queryMode: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var queryParam: js.UndefOr[String] = js.native
  /** [Method] Selects an item by a Model or by a key value
  		* @param r Object
  		*/
  var select: js.UndefOr[js.Function1[/* r */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var selectOnTab: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Store/String/Array) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var transform: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var triggerAction: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var typeAhead: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var typeAheadDelay: js.UndefOr[Double] = js.native
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var valueNotFoundText: js.UndefOr[String] = js.native
}

object IComboBox {
  @scala.inline
  def apply(): IComboBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBox]
  }
  @scala.inline
  implicit class IComboBoxOps[Self <: IComboBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterQuery(value: /* queryPlan */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withAllQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
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
    def withBeforeQuery(value: /* queryPlan */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStore(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withClearValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultListConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultListConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultListConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultListConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withDoQuery(
      value: (/* queryString */ js.UndefOr[String], /* forceAll */ js.UndefOr[Boolean], /* rawQuery */ js.UndefOr[Boolean]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doQuery")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRegEx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegEx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRegEx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegEx")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSubTpl(value: IXTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSubTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSubTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSubTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withFindRecord(value: (/* field */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withFindRecordByDisplay(value: /* value */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecordByDisplay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindRecordByDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecordByDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withFindRecordByValue(value: /* value */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecordByValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindRecordByValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecordByValue")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => IAbstractStore | IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStoreListenersFunction1(value: /* store */ js.UndefOr[IStore] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStoreListenersFunction0(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStoreListeners(value: js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStoreListeners")(js.undefined)
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
    def withGrowToLongestValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growToLongestValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowToLongestValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growToLongestValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withListConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChars")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBindStore(value: (js.UndefOr[js.Any | IAbstractStore], js.UndefOr[js.Any | Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnbindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnUnbindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUnbindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnbindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMode")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* r */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOnTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOnTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOnTab")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAhead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAhead")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAheadDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAheadDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAheadDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAheadDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUnbindStoreListeners(value: js.UndefOr[IAbstractStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnbindStoreListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindStoreListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNotFoundText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNotFoundText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueNotFoundText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueNotFoundText")(js.undefined)
        ret
    }
  }
  
}

