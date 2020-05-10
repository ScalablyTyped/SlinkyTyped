package typingsSlinky.bidirectionalMap.mod

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiMap[TValue] extends js.Object {
  var size: Double = js.native
  def clear(): Unit = js.native
  def delete(key: String): Unit = js.native
  def deleteValue(value: TValue): Unit = js.native
  def entries(): IterableIterator[js.Tuple2[String, TValue]] = js.native
  def get(key: String): TValue = js.native
  def getKey(value: TValue): String = js.native
  def has(key: String): Boolean = js.native
  def hasValue(value: TValue): Boolean = js.native
  def keys(): IterableIterator[String] = js.native
  def set(key: String, value: TValue): Unit = js.native
  def values(): IterableIterator[TValue] = js.native
}

object BiMap {
  @scala.inline
  def apply[TValue](
    clear: () => Unit,
    delete: String => Unit,
    deleteValue: TValue => Unit,
    entries: () => IterableIterator[js.Tuple2[String, TValue]],
    get: String => TValue,
    getKey: TValue => String,
    has: String => Boolean,
    hasValue: TValue => Boolean,
    keys: () => IterableIterator[String],
    set: (String, TValue) => Unit,
    size: Double,
    values: () => IterableIterator[TValue]
  ): BiMap[TValue] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), deleteValue = js.Any.fromFunction1(deleteValue), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getKey = js.Any.fromFunction1(getKey), has = js.Any.fromFunction1(has), hasValue = js.Any.fromFunction1(hasValue), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[BiMap[TValue]]
  }
  @scala.inline
  implicit class BiMapOps[Self[tvalue] <: BiMap[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteValue(value: TValue => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntries(value: () => IterableIterator[js.Tuple2[String, TValue]]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: String => TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKey(value: TValue => String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHas(value: String => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasValue(value: TValue => Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeys(value: () => IterableIterator[String]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, TValue) => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => IterableIterator[TValue]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

