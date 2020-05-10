package typingsSlinky.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue] = js.native
  def has(key: TKey): Boolean = js.native
  def length(): Double = js.native
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]] = js.native
}

object Lookup {
  @scala.inline
  def apply[TKey, TValue](
    get: TKey => Enumerable[TValue],
    has: TKey => Boolean,
    length: () => Double,
    toEnumerable: () => Enumerable[Grouping[TKey, TValue]]
  ): Lookup[TKey, TValue] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[Lookup[TKey, TValue]]
  }
  @scala.inline
  implicit class LookupOps[Self[tkey, tvalue] <: Lookup[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TValue]) with Other]
    @scala.inline
    def withGet(value: TKey => Enumerable[TValue]): Self[TKey, TValue] = {
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
    def withLength(value: () => Double): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToEnumerable(value: () => Enumerable[Grouping[TKey, TValue]]): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEnumerable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

