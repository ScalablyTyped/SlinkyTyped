package typingsSlinky.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit = js.native
  def clear(): Unit = js.native
  def get(key: TKey): TValue = js.native
  def getValues(): js.Array[TValue] = js.native
  def has(key: TKey): Boolean = js.native
  def length(): Double = js.native
  def remove(key: TKey): Boolean = js.native
  def set(key: TKey, value: TValue): Unit = js.native
  def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]] = js.native
  def tryGetValue(key: TKey): TValue = js.native
}

object Dictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Unit,
    clear: () => Unit,
    get: TKey => TValue,
    getValues: () => js.Array[TValue],
    has: TKey => Boolean,
    length: () => Double,
    remove: TKey => Boolean,
    set: (TKey, TValue) => Unit,
    toEnumerable: () => Enumerable[KeyValuePair[TKey, TValue]],
    tryGetValue: TKey => TValue
  ): Dictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), getValues = js.Any.fromFunction0(getValues), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable), tryGetValue = js.Any.fromFunction1(tryGetValue))
    __obj.asInstanceOf[Dictionary[TKey, TValue]]
  }
  @scala.inline
  implicit class DictionaryOps[Self[tkey, tvalue] <: Dictionary[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
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
    def withGet(value: TKey => TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValues(value: () => js.Array[TValue]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHas(value: TKey => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: TKey => Boolean): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (TKey, TValue) => Unit): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToEnumerable(value: () => Enumerable[KeyValuePair[TKey, TValue]]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEnumerable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryGetValue(value: TKey => TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

