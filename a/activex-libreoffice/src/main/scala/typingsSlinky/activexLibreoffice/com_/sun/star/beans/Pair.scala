package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple, or pair.
  *
  * This structure allows for conveniently packing together two values of any type, and could be useful as the result type of methods.
  * @since OOo 3.0
  */
@js.native
trait Pair[T, U] extends js.Object {
  var First: T = js.native
  var Second: U = js.native
}

object Pair {
  @scala.inline
  def apply[T, U](First: T, Second: U): Pair[T, U] = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair[T, U]]
  }
  @scala.inline
  implicit class PairOps[Self[t, u] <: Pair[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withFirst(value: T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("First")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

