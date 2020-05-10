package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractMixedCollection extends IObservable {
  /** [Method] Adds an item to the collection
  		* @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param obj Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
  		*/
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[Boolean] = js.native
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FIAbstractMixedCollection: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Collects unique values of a particular property in this MixedCollection
  		* @param property String The property to collect on
  		* @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
  		* @param allowBlank Boolean Pass true to allow null, undefined or empty string values
  		* @returns Array The unique values
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* allowBlank */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param o Object The Object to look for in the collection.
  		* @returns Boolean True if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean True if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
  		* @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
  		* @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.native
  /** [Method] Filter by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
  var find: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
  		* @param property String The name of a property on your objects.
  		* @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
  		* @param start Number The index to start searching at.
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean True for case sensitive comparison.
  		* @returns Number The matched index or -1
  		*/
  var findIndex: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Find the index of the first matching object in this collection by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @param start Number The index to start searching at.
  		* @returns Number The matched index or -1
  		*/
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection..
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the item associated with the passed key OR index
  		* @param key String/Number The key or index of the item.
  		* @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the item at the specified index
  		* @param index Number The index of the item.
  		* @returns Object The item at the specified index.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] A function which will be called passing a newly added object when the object is added without a separate id
  		* @param item Object The item for which to find the key.
  		* @returns Object The key for the passed item.
  		*/
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns a range of items in this collection
  		* @param startIndex Number The starting index. Defaults to 0.
  		* @param endIndex Number The ending index. Defaults to the last item.
  		* @returns Array An array of items
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Returns index within the collection of the passed Object
  		* @param o Object The item to find the index of.
  		* @returns Number index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.native
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String/Object/String[]/Object[] The key to associate with the new item, or the item itself. May also be an array of either to insert multiple items at once.
  		* @param o Object/Object[] If the second parameter was a key, the new item. May also be an array to insert multiple items at once.
  		* @returns Object The item inserted or an array of items inserted.
  		*/
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Property] (Boolean) */
  var isMixedCollection: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection..
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Remove an item from the collection
  		* @param o Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Remove all items in the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.native
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Removes an item associated with the passed key fom the collection
  		* @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
  		* @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] Remove a range of items starting at a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @param removeCount Number The nuber of items to remove beginning at the specified index.
  		* @returns Object The last item removed or false if no item was removed.
  		*/
  var removeRange: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double], _]
  ] = js.native
  /** [Method] Replaces an item in the collection
  		* @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Collects all of the values of the given property and returns their sum
  		* @param property String The property to sum by
  		* @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
  		* @param start Number The record index to start at
  		* @param end Number The record index to end at
  		* @returns Number The total
  		*/
  var sum: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /** [Method] Change the key for an existing item in the collection
  		* @param oldKey Object The old key
  		* @param newKey Object The new key
  		*/
  var updateKey: js.UndefOr[
    js.Function2[/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IAbstractMixedCollection {
  @scala.inline
  def apply(): IAbstractMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractMixedCollection]
  }
  @scala.inline
  implicit class IAbstractMixedCollectionOps[Self <: IAbstractMixedCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (/* key */ js.UndefOr[js.Any], /* obj */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withAddAll(value: /* objs */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: () => IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withCollect(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowBlank */ js.UndefOr[Boolean]) => Array
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
    def withContains(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContainsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsKey")(js.undefined)
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
    def withEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEachKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = {
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
    def withFind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFindBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFindIndex(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndex")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutFindIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindIndexBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndexBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: /* key */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAt(value: /* index */ js.UndefOr[Double] => _): Self = {
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
    def withGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByKey")(js.undefined)
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
    def withGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* o */ js.UndefOr[js.Any] => Double): Self = {
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
    def withIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfKey")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMixedCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMixedCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMixedCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* o */ js.UndefOr[js.Any] => _): Self = {
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
    def withRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = {
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
    def withRemoveAt(value: /* index */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAtKey(value: /* key */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAtKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAtKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAtKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRange(value: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withSum(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateKey(value: (/* oldKey */ js.UndefOr[js.Any], /* newKey */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateKey")(js.undefined)
        ret
    }
  }
  
}

