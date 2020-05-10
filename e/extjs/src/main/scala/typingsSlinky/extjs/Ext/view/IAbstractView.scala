package typingsSlinky.extjs.Ext.view

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IEventObject
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
trait IAbstractView extends IComponent {
  /** [Method] Changes the data store bound to this view and refreshes it
  		* @param store Ext.data.Store The store to bind to this view
  		*/
  var bindStore: js.UndefOr[js.Function1[js.UndefOr[js.Any | IStore], Unit]] = js.native
  /** [Method] Binds listeners for this component to the store
  		* @param store Ext.data.AbstractStore The store to bind to
  		*/
  var bindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var blockRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects all selected records  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Ext.data.Model[] An Array of Ext.data.Models to be rendered into the DataView.
  		* @param startIndex Number the index number of the Record being prepared for rendering.
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  var collectData: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Config Option] (Boolean) */
  var deferEmptyText: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var deferInitialRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param suppressEvent Boolean Set to false to not fire a deselect event
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  /** [Method] Returns the template node the passed child belongs to or null if it doesn t belong to one
  		* @param node HTMLElement
  		* @returns HTMLElement The template node
  		*/
  var findItemByChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], HTMLElement]] = js.native
  /** [Method] Returns the template node by the Ext EventObject or null if it is not found
  		* @param e Ext.EventObject
  		*/
  var findTargetByEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Method] Gets a template node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the record associated with the node.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  var getNode: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], HTMLElement]] = js.native
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var getNodes: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Gets a record from a node
  		* @param node Ext.Element/HTMLElement The node to evaluate
  		* @returns Ext.data.Model record The Ext.data.Model object
  		*/
  var getRecord: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Gets an array of the records from an array of nodes
  		* @param nodes HTMLElement[] The nodes to evaluate
  		* @returns Ext.data.Model[] records The Ext.data.Model objects
  		*/
  var getRecords: js.UndefOr[js.Function1[/* nodes */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Gets the currently selected nodes
  		* @returns HTMLElement[] An array of HTMLElements
  		*/
  var getSelectedNodes: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets an array of the selected records
  		* @returns Ext.data.Model[] An array of Ext.data.Model objects
  		*/
  var getSelectedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Gets the number of selected nodes
  		* @returns Number The node count
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the selection model for this view
  		* @returns Ext.selection.Model The selection model
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.selection.IModel]] = js.native
  /** [Method] Returns the store associated with this DataView
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IAbstractStore | IStore]] = js.native
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  var getStoreListeners: js.UndefOr[js.Function0[_] | (js.Function1[/* store */ js.UndefOr[IStore], _])] = js.native
  /** [Method] Finds the index of the passed node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or a record associated with a node.
  		* @returns Number The index of the node or -1
  		*/
  var indexOf: js.UndefOr[js.Function1[/* nodeInfo */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns true if the passed node is selected else false
  		* @param node HTMLElement/Number/Ext.data.Model The node, node index or record to check
  		* @returns Boolean True if selected, else false
  		*/
  var isSelected: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var itemSelector: js.UndefOr[String] = js.native
  /** [Config Option] (String/String[]/Ext.XTemplate) */
  var itemTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/Object) */
  var loadMask: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var loadingCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var loadingHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /** [Method] Template method it is called when a new store is bound to the current instance
  		* @param store Object
  		* @param initial Object
  		* @param propName Object
  		*/
  var onBindStore: js.UndefOr[
    (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
      /* store */ js.UndefOr[js.Any], 
      /* initial */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IAbstractView: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method it is called when an existing store is unbound from the current instance
  		* @param store Object
  		*/
  var onUnbindStore: js.UndefOr[
    (js.Function1[/* store */ js.UndefOr[js.Any], Unit]) | (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit])
  ] = js.native
  /** [Config Option] (String) */
  var overItemCls: js.UndefOr[String] = js.native
  /** [Method] Function which can be overridden to provide custom formatting for each Record that is used by this DataView s templat
  		* @param data Object/Object[] The raw data object that was used to create the Record.
  		* @param recordIndex Number the index number of the Record being prepared for rendering.
  		* @param record Ext.data.Model The Record being prepared for rendering.
  		* @returns Array/Object The formatted data in a format expected by the internal template's overwrite() method. (either an array if your params are numeric (i.e. {0}) or an object (i.e. {foo: 'bar'}))
  		*/
  var prepareData: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* recordIndex */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      _
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var preserveScrollOnRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Refreshes the view by reloading the data from the store and re rendering the template  */
  var refresh: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Refreshes an individual node s data from the store
  		* @param index Number The item's data index in the store
  		*/
  var refreshNode: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model[]/Number An array of records or an index
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var selectedItemCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var singleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (Boolean) */
  var trackOver: js.UndefOr[Boolean] = js.native
  /** [Method] Unbinds listeners from this component to the store
  		* @param store Ext.data.AbstractStore The store to unbind from
  		*/
  var unbindStoreListeners: js.UndefOr[js.Function1[js.UndefOr[IAbstractStore], Unit]] = js.native
}

object IAbstractView {
  @scala.inline
  def apply(): IAbstractView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractView]
  }
  @scala.inline
  implicit class IAbstractViewOps[Self <: IAbstractView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindStore(value: js.UndefOr[js.Any | IStore] => Unit): Self = {
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
    def withBlockRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withClearSelections(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectData(value: (/* records */ js.UndefOr[Array], /* startIndex */ js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferEmptyText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEmptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferInitialRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferInitialRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferInitialRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferInitialRefresh")(js.undefined)
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
    def withDisableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(js.undefined)
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
    def withFindItemByChild(value: /* node */ js.UndefOr[HTMLElement] => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findItemByChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindItemByChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findItemByChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFindTargetByEvent(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTargetByEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindTargetByEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTargetByEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNode(value: /* nodeInfo */ js.UndefOr[js.Any] => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodes(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecord(value: /* node */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecords(value: /* nodes */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedNodes(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionModel(value: () => typingsSlinky.extjs.Ext.selection.IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionModel")(js.undefined)
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
    def withIndexOf(value: /* nodeInfo */ js.UndefOr[js.Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelected(value: /* node */ js.UndefOr[js.Any] => Boolean): Self = {
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
    def withItemCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadMask(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMask")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingCls")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
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
    def withOnBindStoreFunction2(value: (/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnBindStoreFunction3(
      value: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any], /* propName */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnBindStore(
      value: (js.Function2[/* store */ js.UndefOr[IAbstractStore], /* initial */ js.UndefOr[Boolean], Unit]) | (js.Function3[
          /* store */ js.UndefOr[js.Any], 
          /* initial */ js.UndefOr[js.Any], 
          /* propName */ js.UndefOr[js.Any], 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBindStore")(js.undefined)
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
    def withOverItemCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overItemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareData(
      value: (/* data */ js.UndefOr[js.Any], /* recordIndex */ js.UndefOr[Double], /* record */ js.UndefOr[IModel]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPrepareData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareData")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveScrollOnRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollOnRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveScrollOnRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveScrollOnRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshNode(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshNode")(js.undefined)
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
    def withSelectedItemCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
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
    def withTrackOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackOver")(js.undefined)
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

