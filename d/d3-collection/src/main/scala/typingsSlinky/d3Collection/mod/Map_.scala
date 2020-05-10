package typingsSlinky.d3Collection.mod

import typingsSlinky.d3Collection.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map_[T] extends js.Object {
  /**
    * Removes all entries from this map.
    */
  def clear(): Unit = js.native
  /**
    * Calls the specified function for each entry in this map and returns undefined.
    * The iteration order is arbitrary.
    *
    * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
    * followed by the map itself.
    */
  def each(func: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit]): Unit = js.native
  /**
    * Returns true if and only if this map has zero entries.
    */
  def empty(): Boolean = js.native
  /**
    * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
    * Each entry’s key is a string, but the value can have arbitrary type.
    */
  def entries(): js.Array[AnonKey[T]] = js.native
  /**
    * Returns the value for the specified key string.
    * If the map does not have an entry for the specified key, returns undefined.
    *
    * @param key Key of map entry to access.
    */
  def get(key: String): js.UndefOr[T] = js.native
  /**
    * Returns true if and only if this map has an entry for the specified key string.
    * Note: the value may be null or undefined.
    *
    * @param key Key of map entry to access.
    */
  def has(key: String): Boolean = js.native
  /**
    * Returns an array of string keys for every entry in this map.
    * The order of the returned keys is arbitrary.
    */
  def keys(): js.Array[String] = js.native
  /**
    * If the map has an entry for the specified key string, removes the entry and returns true.
    * Otherwise, this method does nothing and returns false.
    *
    * @param key Map key for which to remove the entry.
    */
  def remove(key: String): Boolean = js.native
  /**
    * Sets the value for the specified key string and returns the updated map.
    * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
    *
    * @param key Key of map entry to access.
    * @param value Value to set for entry at key.
    */
  def set(key: String, value: T): this.type = js.native
  /**
    * Returns the number of entries in this map.
    */
  def size(): Double = js.native
  /**
    * Returns an array of values for every entry in this map.
    * The order of the returned values is arbitrary.
    */
  def values(): js.Array[T] = js.native
}

object Map_ {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    each: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit,
    empty: () => Boolean,
    entries: () => js.Array[AnonKey[T]],
    get: String => js.UndefOr[T],
    has: String => Boolean,
    keys: () => js.Array[String],
    remove: String => Boolean,
    set: (String, T) => Map_[T],
    size: () => Double,
    values: () => js.Array[T]
  ): Map_[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[Map_[T]]
  }
  @scala.inline
  implicit class Map_Ops[Self[t] <: Map_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEach(value: js.Function3[/* value */ T, /* key */ String, /* map */ Map_[T], Unit] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmpty(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEntries(value: () => js.Array[AnonKey[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, T) => Map_[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

