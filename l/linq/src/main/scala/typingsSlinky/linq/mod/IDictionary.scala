package typingsSlinky.linq.mod

import typingsSlinky.linq.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit = js.native
  def clear(): Unit = js.native
  def contains(key: TKey): Boolean = js.native
  def count(): Double = js.native
  def get(key: TKey): TValue = js.native
  def remove(key: TKey): Unit = js.native
  def set(key: TKey, value: TValue): Boolean = js.native
  def toEnumerable(): IEnumerable[Value[TKey, TValue]] = js.native
}

object IDictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Unit,
    clear: () => Unit,
    contains: TKey => Boolean,
    count: () => Double,
    get: TKey => TValue,
    remove: TKey => Unit,
    set: (TKey, TValue) => Boolean,
    toEnumerable: () => IEnumerable[Value[TKey, TValue]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
  @scala.inline
  implicit class IDictionaryOps[Self[tkey, tvalue] <: IDictionary[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TValue]) with Other]
    @scala.inline
    def withAdd(value: (TKey, TValue) => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: TKey => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: TKey => TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: TKey => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (TKey, TValue) => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToEnumerable(value: () => IEnumerable[Value[TKey, TValue]]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEnumerable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

