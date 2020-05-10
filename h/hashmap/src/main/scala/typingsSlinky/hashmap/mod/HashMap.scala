package typingsSlinky.hashmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashMap[TKey, TValue] extends js.Object {
  /**
    * Clears hashmap.
    *
    * @return Self.
    */
  def clear(): HashMap[TKey, TValue] = js.native
  /**
    * Copy all key-value pairs from other to this instance.
    *
    * @param map Other map.
    * @return Self.
    */
  def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue] = js.native
  /**
    * Returns size of hashmap (number of entries).
    *
    * @return Number of entries in hashmap.
    */
  def count(): Double = js.native
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    */
  def delete(key: TKey): HashMap[TKey, TValue] = js.native
  /**
    * Returns all key-value pairs.
    *
    * @return List of key-value pairs.
    * @since 2.3.0
    */
  def entries(): js.Array[js.Tuple2[TKey, TValue]] = js.native
  /**
    * Iterates over hashmap.
    *
    * @param callback Function to be invoked for every hashmap entry.
    * @return Self.
    */
  def forEach(callback: js.Function2[/* value */ TValue, /* key */ TKey, Unit]): HashMap[TKey, TValue] = js.native
  /**
    * Return value from hashmap.
    *
    * @param key Key.
    * @return Value stored under given key.
    */
  def get(key: TKey): TValue = js.native
  /**
    * Checks if given key exists in hashmap.
    *
    * @param key Key.
    * @return Whether given key exists in hashmap.
    */
  def has(key: TKey): Boolean = js.native
  /**
    * Returns all contained keys.
    *
    * @return List of keys.
    */
  def keys(): js.Array[TKey] = js.native
  /**
    * Store several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    * @return Self.
    */
  def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue] = js.native
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    * @deprecated Since 2.3.0
    */
  def remove(key: TKey): HashMap[TKey, TValue] = js.native
  /**
    * Returns key under which given value is stored.
    *
    * @param value Value.
    * @return Key which is assigned to value stored.
    */
  def search(value: TValue): TKey = js.native
  /**
    * Store value in hashmap.
    *
    * @param key Key.
    * @param value Value.
    * @return Self.
    */
  def set(key: TKey, value: TValue): HashMap[TKey, TValue] = js.native
  /**
    * Returns all container values.
    *
    * @return List of values.
    */
  def values(): js.Array[TValue] = js.native
}

object HashMap {
  @scala.inline
  def apply[TKey, TValue](
    clear: () => HashMap[TKey, TValue],
    copy: HashMap[TKey, TValue] => HashMap[TKey, TValue],
    count: () => Double,
    delete: TKey => HashMap[TKey, TValue],
    entries: () => js.Array[js.Tuple2[TKey, TValue]],
    forEach: js.Function2[/* value */ TValue, /* key */ TKey, Unit] => HashMap[TKey, TValue],
    get: TKey => TValue,
    has: TKey => Boolean,
    keys: () => js.Array[TKey],
    multi: /* repeated */ TKey | TValue => HashMap[TKey, TValue],
    remove: TKey => HashMap[TKey, TValue],
    search: TValue => TKey,
    set: (TKey, TValue) => HashMap[TKey, TValue],
    values: () => js.Array[TValue]
  ): HashMap[TKey, TValue] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), copy = js.Any.fromFunction1(copy), count = js.Any.fromFunction0(count), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), multi = js.Any.fromFunction1(multi), remove = js.Any.fromFunction1(remove), search = js.Any.fromFunction1(search), set = js.Any.fromFunction2(set), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[HashMap[TKey, TValue]]
  }
  @scala.inline
  implicit class HashMapOps[Self[tkey, tvalue] <: HashMap[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TValue]) with Other]
    @scala.inline
    def withClear(value: () => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: HashMap[TKey, TValue] => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: TKey => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntries(value: () => js.Array[js.Tuple2[TKey, TValue]]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function2[/* value */ TValue, /* key */ TKey, Unit] => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: TKey => TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: TKey => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => js.Array[TKey]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMulti(value: /* repeated */ TKey | TValue => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: TKey => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: TValue => TKey): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (TKey, TValue) => HashMap[TKey, TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

