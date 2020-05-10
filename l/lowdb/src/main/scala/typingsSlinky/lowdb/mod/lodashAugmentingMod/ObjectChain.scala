package typingsSlinky.lowdb.mod.lodashAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectChain[T] extends js.Object {
  /**
    * @description Be careful: This function overwrites the whole database.
    */
  def write(): T with js.Promise[T] = js.native
}

object ObjectChain {
  @scala.inline
  def apply[T](write: () => T with js.Promise[T]): ObjectChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
    __obj.asInstanceOf[ObjectChain[T]]
  }
  @scala.inline
  implicit class ObjectChainOps[Self[t] <: ObjectChain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withWrite(value: () => T with js.Promise[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

