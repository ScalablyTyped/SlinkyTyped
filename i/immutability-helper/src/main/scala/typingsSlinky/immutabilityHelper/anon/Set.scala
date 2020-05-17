package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set[T]
  extends Spec[T, js.Any] {
  @JSName("$set")
  var $set: T = js.native
}

object Set {
  @scala.inline
  def apply[T]($set: T): Set[T] = {
    val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Set[T]]
  }
  @scala.inline
  implicit class SetOps[Self[t] <: Set[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$set(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

