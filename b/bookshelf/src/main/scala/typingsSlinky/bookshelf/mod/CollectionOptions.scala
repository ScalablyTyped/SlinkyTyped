package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOptions[T] extends js.Object {
  var comparator: js.UndefOr[Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.native
}

object CollectionOptions {
  @scala.inline
  def apply[T](): CollectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions[T]]
  }
  @scala.inline
  implicit class CollectionOptionsOps[Self[t] <: CollectionOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComparatorFunction2(value: (/* a */ T, /* b */ T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComparator(value: Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
  }
  
}

