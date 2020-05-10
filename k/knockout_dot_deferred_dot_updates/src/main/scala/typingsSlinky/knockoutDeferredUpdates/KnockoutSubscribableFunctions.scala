package typingsSlinky.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observables
@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  var deferUpdates: Boolean = js.native
}

object KnockoutSubscribableFunctions {
  @scala.inline
  def apply[T](deferUpdates: Boolean): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutSubscribableFunctionsOps[Self[t] <: KnockoutSubscribableFunctions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDeferUpdates(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferUpdates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

