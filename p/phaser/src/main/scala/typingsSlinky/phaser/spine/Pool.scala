package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T] extends js.Object {
  var instantiator: js.Any = js.native
  var items: js.Any = js.native
  def clear(): Unit = js.native
  def free(item: T): Unit = js.native
  def freeAll(items: ArrayLike[T]): Unit = js.native
  def obtain(): T = js.native
}

object Pool {
  @scala.inline
  def apply[T](
    clear: () => Unit,
    free: T => Unit,
    freeAll: ArrayLike[T] => Unit,
    instantiator: js.Any,
    items: js.Any,
    obtain: () => T
  ): Pool[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), free = js.Any.fromFunction1(free), freeAll = js.Any.fromFunction1(freeAll), instantiator = instantiator.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obtain = js.Any.fromFunction0(obtain))
    __obj.asInstanceOf[Pool[T]]
  }
  @scala.inline
  implicit class PoolOps[Self[t] <: Pool[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClear(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFree(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFreeAll(value: ArrayLike[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstantiator(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObtain(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obtain")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

