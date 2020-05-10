package typingsSlinky.akamaiEdgeworkers.urlSearchParamsMod

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLSearchParams extends js.Object {
  /**
    * Add a new name/value to the receiver.
    */
  def append(name: String, value: String): Unit = js.native
  /**
    * Remove the given name/value from the receiver.
    */
  def delete(name: String): Unit = js.native
  /**
    * Iterate through the name/value pairs.
    */
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  /**
    * Return the first value with the specified name.
    */
  def get(name: String): String | Null = js.native
  /**
    * Return *all* values association with the specified name.
    */
  def getAll(name: String): js.Array[String] = js.native
  /**
    * Check if the given name exists.
    */
  def has(name: String): Boolean = js.native
  /**
    * Iterate through the names.
    */
  def keys(): IterableIterator[String] = js.native
  /**
    * Replace all instances of `name` with a single name/value pair.
    */
  def set(name: String, value: String): Unit = js.native
  /**
    * Iterate through the values.
    */
  def values(): IterableIterator[String] = js.native
}

object URLSearchParams {
  @scala.inline
  def apply(
    append: (String, String) => Unit,
    delete: String => Unit,
    entries: () => IterableIterator[js.Tuple2[String, String]],
    get: String => String | Null,
    getAll: String => js.Array[String],
    has: String => Boolean,
    keys: () => IterableIterator[String],
    set: (String, String) => Unit,
    values: () => IterableIterator[String]
  ): URLSearchParams = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[URLSearchParams]
  }
  @scala.inline
  implicit class URLSearchParamsOps[Self <: URLSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntries(value: () => IterableIterator[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAll(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => IterableIterator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValues(value: () => IterableIterator[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

