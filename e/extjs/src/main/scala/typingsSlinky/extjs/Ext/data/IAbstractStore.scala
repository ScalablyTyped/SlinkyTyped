package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IObservable
import typingsSlinky.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ @js.native
trait IAbstractStore extends IObservable {
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var batchUpdateMode: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var defaultProxyType: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Config Option] (Object[]) */
  var fields: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var filterOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object[]/Function[]) */
  var filters: js.UndefOr[js.Any] = js.native
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
  		* @returns Ext.util.Sorter The sorter, null if none exist
  		*/
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.native
  /** [Method] Gets all records added or updated since the last commit
  		* @returns Ext.data.Model[] The added and updated Model instances
  		*/
  var getModifiedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances
  		*/
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the proxy currently attached to this proxy instance
  		* @returns Ext.data.proxy.Proxy The Proxy instance
  		*/
  var getProxy: js.UndefOr[js.Function0[typingsSlinky.extjs.Ext.data.proxy.IProxy]] = js.native
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isDestroyed: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean True if the Store is currently loading
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isStore: js.UndefOr[Boolean] = js.native
  /** [Method] Loads the Store using its configured proxy
  		* @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function
  		* @returns void this
  		*/
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.native
  /** [Method] Reloads the store using the last options passed to the load method
  		* @param options Object A config object which contains options which may override the options passed to the previous load call.
  		*/
  var reload: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.native
  /** [Method] Removes all records from the store  */
  var removeAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.data.Model[]) */
  var removed: js.UndefOr[Array] = js.native
  /** [Method] Resumes automatically syncing the Store with its Proxy  */
  var resumeAutoSync: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Saves all pending changes via the configured proxy  */
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the Store s Proxy by string config object or Proxy instance
  		* @param proxy String/Object/Ext.data.proxy.Proxy The new Proxy, which can be either a type string, a configuration object or an Ext.data.proxy.Proxy instance
  		* @returns Ext.data.proxy.Proxy The attached Proxy object
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], typingsSlinky.extjs.Ext.data.proxy.IProxy]
  ] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.native
  /** [Config Option] (Boolean) */
  var sortOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var statefulFilters: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.native
  /** [Method] Suspends automatically syncing the Store with its Proxy  */
  var suspendAutoSync: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Synchronizes the store with its proxy
  		* @param options Object Object containing one or more properties supported by the sync method (these get passed along to the underlying proxy's batch method):
  		* @returns Ext.data.Store this
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IStore]] = js.native
}

object IAbstractStore {
  @scala.inline
  def apply(): IAbstractStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractStore]
  }
  @scala.inline
  implicit class IAbstractStoreOps[Self <: IAbstractStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLoad(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchUpdateMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchUpdateMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdateMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProxyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProxyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProxyType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateComparator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateComparator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenerateComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateComparator")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFirstSorter(value: () => ISorter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstSorter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFirstSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModifiedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModifiedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModifiedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModifiedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNewRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNewRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProxy(value: () => typingsSlinky.extjs.Ext.data.proxy.IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRemovedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemovedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemovedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemovedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUpdatedRecords(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUpdatedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSortable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDestroyed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestroyed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStore")(js.undefined)
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
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withReload(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteSort")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeAutoSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAutoSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResumeAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProxy(value: /* proxy */ js.UndefOr[js.Any] => typingsSlinky.extjs.Ext.data.proxy.IProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
    @scala.inline
    def withStatefulFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statefulFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatefulFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statefulFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeId")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendAutoSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendAutoSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuspendAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendAutoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: /* options */ js.UndefOr[js.Any] => IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

