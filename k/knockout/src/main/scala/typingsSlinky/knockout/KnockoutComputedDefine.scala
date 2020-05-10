package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedDefine[T] extends KnockoutComputedOptions[T] {
  /**
    * A function that is used to evaluate the computed observable’s current value.
    */
  def read(): T = js.native
}

object KnockoutComputedDefine {
  @scala.inline
  def apply[T](read: () => T): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
  @scala.inline
  implicit class KnockoutComputedDefineOps[Self[t] <: KnockoutComputedDefine[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRead(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

