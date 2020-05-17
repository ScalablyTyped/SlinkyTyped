package typingsSlinky.phosphorAlgorithm.retroMod

import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRetroable[T] extends RetroableOrArrayLike[T] {
  /**
    * Get a reverse iterator over the object's values.
    *
    * @returns An iterator which yields the object's values in reverse.
    */
  def retro(): IIterator[T] = js.native
}

object IRetroable {
  @scala.inline
  def apply[T](retro: () => IIterator[T]): IRetroable[T] = {
    val __obj = js.Dynamic.literal(retro = js.Any.fromFunction0(retro))
    __obj.asInstanceOf[IRetroable[T]]
  }
  @scala.inline
  implicit class IRetroableOps[Self[t] <: IRetroable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRetro(value: () => IIterator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retro")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

