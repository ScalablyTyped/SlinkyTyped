package typingsSlinky.reactIsDeprecated.mod

import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deprecatable[T] extends js.Object {
  def isDeprecated(message: String): Validator[T] = js.native
}

object Deprecatable {
  @scala.inline
  def apply[T](isDeprecated: String => Validator[T]): Deprecatable[T] = {
    val __obj = js.Dynamic.literal(isDeprecated = js.Any.fromFunction1(isDeprecated))
    __obj.asInstanceOf[Deprecatable[T]]
  }
  @scala.inline
  implicit class DeprecatableOps[Self[t] <: Deprecatable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsDeprecated(value: String => Validator[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeprecated")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

