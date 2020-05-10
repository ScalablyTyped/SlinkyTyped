package typingsSlinky.extjs.Ext.selection

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IAbstractStore
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.util.IMixedCollection
import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.IBindable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined bindStore, bindStoreListeners, getStore, getStoreListeners, onBindStore, onUnbindStore, unbindStoreListeners */ @js.native
trait IModel extends IObservable {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /** [Method] binds the store to the selModel
  		* @param store Object
  		* @param initial Object
  		*/
  var bindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
  ] = js.native
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean True to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Deselects all records in the view
  		* @param suppressEvent Boolean True to suppress any deselect events
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Deselects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		*/
  var deselectRange: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Returns the count of selected records
  		* @returns Number The number of selected records
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method]
  		* @returns Ext.data.Model Returns the last selected record.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns an array of the currently selected records
  		* @returns Ext.data.Model[] The selected records
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the current selectionMode
  		* @returns String The selectionMode: 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Gets the current store instance
  		* @returns Ext.data.AbstractStore The store, null if one does not exist.
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Method] Returns true if there are any a selected records
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Determines if this record is currently focused
  		* @param record Ext.data.Model
  		*/
  var isFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Returns true if the selections are locked
  		* @returns Boolean
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the specified row is selected
  		* @param from Ext.data.Model/Number The start of the range to check.
  		* @param to Ext.data.Model/Number The end of the range to check.
  		* @returns Boolean
  		*/
  var isRangeSelected: js.UndefOr[
    js.Function2[/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] ("SINGLE"/"SIMPLE"/"MULTI") */
  var mode: js.UndefOr[js.Any] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Ext.data.AbstractStore The store being bound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onBindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Ext.data.AbstractStore The store being unbound
  		* @param initial Boolean True if this store is being bound as initialization of the instance.
  		*/
  var onUnbindStore: js.UndefOr[js.Function2[js.UndefOr[IAbstractStore], js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var pruneRemoved: js.UndefOr[Boolean] = js.native
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean True to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Selects all records in the view
  		* @param suppressEvent Boolean True to suppress any select events
  		*/
  var selectAll: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Selects a range of rows if the selection model is not locked
  		* @param startRow Ext.data.Model/Number The record or index of the first row in the range
  		* @param endRow Ext.data.Model/Number The record or index of the last row in the range
  		* @param keepExisting Boolean True to retain existing selections
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRow */ js.UndefOr[js.Any], 
      /* endRow */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var selected: js.UndefOr[IMixedCollection] = js.native
  /** [Method] Sets a record as the last focused record
  		* @param record Ext.data.Model
  		*/
  var setLastFocused: js.UndefOr[js.Function1[/* record */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Locks the current selection and disables any changes from happening to the selection
  		* @param locked Boolean True to lock, false to unlock.
  		*/
  var setLocked: js.UndefOr[js.Function1[/* locked */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the current selectionMode
  		* @param selMode String 'SINGLE', 'MULTI' or 'SIMPLE'.
  		*/
  var setSelectionMode: js.UndefOr[js.Function1[/* selMode */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var toggleOnClick: js.UndefOr[Boolean] = js.native
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IModel {
  @scala.inline
  def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDeselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStoreFunction2(value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBindStoreFunction1(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBindStore(
      value: (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(value.asInstanceOf[js.Any])
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
    def withDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeselectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectRange(value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDeselectRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectRange")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLastSelected(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLastSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelection(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => IAbstractStore): Self = {
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
    def withHasSelection(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRangeSelected(value: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRangeSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsRangeSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRangeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = {
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
    def withOnUnbindStore(value: (js.UndefOr[IAbstractStore], js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnbindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnbindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withPruneRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPruneRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pruneRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(
      value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAll(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRange(
      value: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelectRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLastFocused(value: /* record */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastFocused")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLastFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLocked(value: /* locked */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSelectionMode(value: /* selMode */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnClick")(js.undefined)
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
  }
  
}

