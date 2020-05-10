package typingsSlinky.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookup[TKey, TElement] extends js.Object {
  def contains(key: TKey): Boolean = js.native
  def count(): Double = js.native
  def get(key: TKey): IEnumerable[TElement] = js.native
  def toEnumerable(): IEnumerable[IGrouping[TKey, TElement]] = js.native
}

object ILookup {
  @scala.inline
  def apply[TKey, TElement](
    contains: TKey => Boolean,
    count: () => Double,
    get: TKey => IEnumerable[TElement],
    toEnumerable: () => IEnumerable[IGrouping[TKey, TElement]]
  ): ILookup[TKey, TElement] = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[ILookup[TKey, TElement]]
  }
  @scala.inline
  implicit class ILookupOps[Self[tkey, telement] <: ILookup[tkey, telement], TKey, TElement] (val x: Self[TKey, TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TElement]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TElement]) with Other]
    @scala.inline
    def withContains(value: TKey => Boolean): Self[TKey, TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self[TKey, TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: TKey => IEnumerable[TElement]): Self[TKey, TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToEnumerable(value: () => IEnumerable[IGrouping[TKey, TElement]]): Self[TKey, TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toEnumerable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

