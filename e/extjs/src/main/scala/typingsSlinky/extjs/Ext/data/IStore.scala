package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStore extends IAbstractStore {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
  		* @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
  		* @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
  		*/
  var addFilter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Local sort only Inserts the passed Record into the Store at the index where it should go based on the current sort
  		* @param record Ext.data.Record
  		*/
  var addSorted: js.UndefOr[js.Function1[/* record */ js.UndefOr[IRecord], Unit]] = js.native
  /** [Method] Runs the aggregate function for all the records in the store
  		* @param fn Function The function to execute. The function is called with a single parameter, an array of records for that group.
  		* @param scope Object The scope to execute the function in. Defaults to the store.
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @param args Array Any arguments to append to the function call
  		* @returns Object An object literal with the group names and their appropriate values.
  		*/
  var aggregate: js.UndefOr[
    js.Function4[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* grouped */ js.UndefOr[Boolean], 
      /* args */ js.UndefOr[Array], 
      _
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.native
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean If true the filter is cleared silently. For a locally filtered Store, this means that the filter collection is cleared without firing the datachanged event. For a remotely filtered Store, this means that the filter collection is cleared, but the store is not reloaded from the server.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Clear any groupers in the store */
  var clearGrouping: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.native
  /** [Method] Collects unique values for a particular dataIndex from this store
  		* @param dataIndex String The property to collect
  		* @param allowNull Boolean Pass true to allow null, undefined or empty string values
  		* @param bypassFilter Boolean Pass true to collect from all records, even ones which are filtered.
  		* @returns Object[] An array of the unique values
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* dataIndex */ js.UndefOr[String], 
      /* allowNull */ js.UndefOr[Boolean], 
      /* bypassFilter */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  /** [Method] Commits all Records with outstanding changes  */
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the count of items in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the count for each group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number the count
  		*/
  var count: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Double]] = js.native
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.native
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.native
  /** [Method] Calls the specified function for each record in the store
  		* @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
  		* @param value String value to filter by (only if using a property string as the first argument)
  		*/
  var filter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Filters by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.native
  /** [Method] Convenience function for getting the first model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the first record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined
  		*/
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.native
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IModel]] = js.native
  /** [Method] Get the Record with the specified id
  		* @param id Mixed The id of the Record to find.
  		* @returns Ext.data.Model The Record with the passed id. Returns null if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Gets the number of records in store
  		* @returns Number The number of Records in the Store.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the string to group on for a given model instance
  		* @param instance Ext.data.Model The model instance
  		* @returns String The string to compare when forming groups
  		*/
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.native
  /** [Method] Returns an array containing the result of applying grouping to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by getGroupString.
  		* @returns Object/Object[] The grouped data
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.native
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Gathers a range of Records between specified indices
  		* @param start Number The starting index. Defaults to zero for non buffered Stores.
  		* @param end Number The ending index. Defaults to the last Record for non buffered Stores.
  		* @param options Object Used when the Store is {@link buffered] and the range may not be available synchronously.
  		* @returns Ext.data.Model[] An array of records if the records are immediately available. For buffered stores, you should pass the callback option unless you know that the range will be present - see rangeCached.
  		*/
  var getRange: js.UndefOr[
    js.Function3[
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.native
  /** [Method] Returns the total number of Model instances that the Proxy indicates exist
  		* @returns Number The total number of Model instances available via the Proxy. 0 returned if no value has been set via the reader.
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Groups data inside the store
  		* @param groupers String/Object[] Either a string name of one of the fields in this Store's configured Model, or an Array of grouper configurations.
  		* @param direction String The overall direction to group the data by.
  		*/
  var group: js.UndefOr[
    js.Function2[/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.util.MixedCollection) */
  var groupers: js.UndefOr[IMixedCollection] = js.native
  /** [Method] Guarantee a specific range this will load the store with a range that must be the pageSize or smaller and take car
  		* @param start Object
  		* @param end Object
  		* @param callback Object
  		* @param scope Object
  		* @param options Object
  		*/
  var guaranteeRange: js.UndefOr[
    js.Function5[
      /* start */ js.UndefOr[js.Any], 
      /* end */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Get the index of the record within the store
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  /** [Method] Get the index within the store of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the store.
  		* @returns Ext.data.Model[] records The added records
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Checks if the store is currently grouped
  		* @returns Boolean true if the store is grouped.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Convenience function for getting the last model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the last record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined
  		*/
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.native
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		*/
  var loadPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Loads data via the bound Proxy s reader Use this method if you are attempting to load data and want to utilize the c
  		* @param data Object[] The full JSON object you'd like to load into the Data store.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadRawData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Loads an array of model instances into the store fires the datachanged event
  		* @param records Ext.data.Model[] The array of records to load
  		* @param options Object
  		*/
  var loadRecords: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Ensures that the specified range of rows is present in the cache
  		* @param start Object
  		* @param end Object
  		*/
  var prefetchRange: js.UndefOr[js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.native
  /** [Method] Query all the cached records in this Store by name value pair
  		* @param property String The property to create the filter function for
  		* @param value String/RegExp The string/regex to compare the property value to
  		* @param anyMatch Boolean true if we don't care if the filter value is not the full value.
  		* @param caseSensitive Boolean true to create a case-sensitive regex.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex). Ignored if anyMatch is true.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var query: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.native
  /** [Method] Query all the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.native
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
  		* @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Removes all items from the store
  		* @param silent Boolean Pass true to prevent the record bulkremove and clear events from being fired.
  		*/
  @JSName("removeAll")
  var removeAll_IStore: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Removes the model instance s at the given index
  		* @param index Number The record index
  		* @param count Number The number of records to delete
  		*/
  var removeAt: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Removes an individual Filter from the current filter set using the passed Filter Filter id and by default applys the
  		* @param toRemove Mixed The id of a Filter to remove from the filter set, or a Filter instance to remove.
  		* @param applyFilters Boolean Pass as false to remove the filter but not apply the updated filter set. If null is passed, all anonymous Filters (Filters with no id property) will be removed.
  		*/
  var removeFilter: js.UndefOr[
    js.Function2[/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var snapshot: js.UndefOr[IMixedCollection] = js.native
  /** [Config Option] (Boolean) */
  var sortOnFilter: js.UndefOr[Boolean] = js.native
  /** [Method] because prefetchData is stored by index this invalidates all of the prefetchedData
  		* @returns Ext.util.Sorter[]
  		*/
  @JSName("sort")
  var sort_IStore: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sums the value of field for each record in store and returns the result
  		* @param field String A field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the sum for that group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number The sum
  		*/
  var sum: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Double]
  ] = js.native
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
}

object IStore {
  @scala.inline
  def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  @scala.inline
  implicit class IStoreOps[Self <: IStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* model */ js.UndefOr[js.Any] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddFilter(value: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSorted(value: /* record */ js.UndefOr[IRecord] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregate(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAverage(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffered")(js.undefined)
        ret
    }
    @scala.inline
    def withClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withClearGrouping(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearGrouping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnPageLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnPageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnPageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withClearRemovedOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRemovedOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearRemovedOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearRemovedOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCollect(
      value: (/* dataIndex */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCollect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collect")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCommitChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: /* grouped */ js.UndefOr[Boolean] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withFindBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findExact")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findExact")(js.undefined)
        ret
    }
    @scala.inline
    def withFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutFindRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: /* grouped */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAt(value: /* index */ js.UndefOr[Double] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetById(value: /* id */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.undefined)
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
    def withGetGroupString(value: /* instance */ js.UndefOr[IModel] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroupString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupString")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGroups(value: /* groupName */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPageFromRecordIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageFromRecordIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRange(
      value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDir")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupField")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupers(value: IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupers")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteeRange(
      value: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteeRange")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutGuaranteeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = {
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
    def withIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfTotal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFiltered(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGrouped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: /* grouped */ js.UndefOr[Boolean] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRawData(value: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRawData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadRawData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRawData")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRecords(value: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecords")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.undefined)
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
    def withPrefetch(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrefetchPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetchRange(value: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrefetchRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviousPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgePageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgePageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgePageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutQueryBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRejectChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* records */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAt(value: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveFilter(value: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshot(value: IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOnFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOnFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOnFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(js.undefined)
        ret
    }
  }
  
}

