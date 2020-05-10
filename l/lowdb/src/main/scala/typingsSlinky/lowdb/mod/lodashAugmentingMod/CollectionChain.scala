package typingsSlinky.lowdb.mod.lodashAugmentingMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChain[T] extends js.Object {
  def write(): ArrayLike[T] with js.Promise[ArrayLike[T]] = js.native
}

object CollectionChain {
  @scala.inline
  def apply[T](write: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): CollectionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
    __obj.asInstanceOf[CollectionChain[T]]
  }
  @scala.inline
  implicit class CollectionChainOps[Self[t] <: CollectionChain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withWrite(value: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

