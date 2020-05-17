package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apply[T]
  extends Spec[T, js.Any] {
  @JSName("$apply")
  def $apply(v: T): T = js.native
}

object Apply {
  @scala.inline
  def apply[T]($apply: T => T): Apply[T] = {
    val __obj = js.Dynamic.literal($apply = js.Any.fromFunction1($apply))
    __obj.asInstanceOf[Apply[T]]
  }
  @scala.inline
  implicit class ApplyOps[Self[t] <: Apply[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$apply(value: T => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$apply")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

