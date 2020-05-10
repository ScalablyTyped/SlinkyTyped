package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashMap extends IObservable {
  /** [Method] Adds an item to the collection
  		* @param key String/Object The key to associate with the item, or the new item. If a getKey implementation was specified for this HashMap, or if the key of the stored items is in a property called id, the HashMap will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param o Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Removes all items from the hash
  		* @param initial Object
  		* @returns Ext.util.HashMap this
  		*/
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Performs a shallow copy on this hash
  		* @returns Ext.util.HashMap The new hash object.
  		*/
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Checks whether a value exists in the hash
  		* @param value Object The value to check for.
  		* @returns Boolean True if the value exists in the dictionary.
  		*/
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Checks whether a key exists in the hash
  		* @param key String The key to check for.
  		* @returns Boolean True if they key exists in the hash.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Executes the specified function once for each item in the hash
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in. Defaults to this.
  		* @returns Ext.util.HashMap this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Retrieves an item with a particular key
  		* @param key String The key to lookup.
  		* @returns Object The value at that key. If it doesn't exist, undefined is returned.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] Gets the number of items in the hash
  		* @returns Number The number of items in the hash.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Extracts the key from an object
  		* @param o Object The object to get the key from
  		* @returns String The key to use.
  		*/
  var getKey: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Return all of the keys in the hash
  		* @returns Array An array of keys.
  		*/
  var getKeys: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Return all of the values in the hash
  		* @returns Array An array of values.
  		*/
  var getValues: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[js.Any] = js.native
  /** [Method] Remove an item from the hash
  		* @param o Object The value of the item to remove.
  		* @returns Boolean True if the item was successfully removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Remove an item from the hash
  		* @param key String The key to remove.
  		* @returns Boolean True if the item was successfully removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Method] Replaces an item in the hash
  		* @param key String The key of the item.
  		* @param value Object The new value for the item.
  		* @returns Object The new value of the item.
  		*/
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.native
}

object IHashMap {
  @scala.inline
  def apply(): IHashMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashMap]
  }
  @scala.inline
  implicit class IHashMapOps[Self <: IHashMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (/* key */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any]) => _): Self = {
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
    def withClear(value: /* initial */ js.UndefOr[js.Any] => IHashMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: () => IHashMap): Self = {
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
    def withContains(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = {
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
    def withEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IHashMap): Self = {
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
    def withGet(value: /* key */ js.UndefOr[String] => _): Self = {
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
    def withGetKey(value: /* o */ js.UndefOr[js.Any] => String): Self = {
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
    def withGetKeys(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValues(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFn")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = {
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
    def withRemoveAtKey(value: /* key */ js.UndefOr[String] => Boolean): Self = {
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
    def withReplace(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _): Self = {
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
  }
  
}

