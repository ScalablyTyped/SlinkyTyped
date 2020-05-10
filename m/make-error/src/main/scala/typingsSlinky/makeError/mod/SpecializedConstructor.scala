package typingsSlinky.makeError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecializedConstructor[T] extends js.Object {
  var super_ : js.Any = js.native
}

object SpecializedConstructor {
  @scala.inline
  def apply[T](super_ : js.Any): SpecializedConstructor[T] = {
    val __obj = js.Dynamic.literal(super_ = super_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecializedConstructor[T]]
  }
  @scala.inline
  implicit class SpecializedConstructorOps[Self[t] <: SpecializedConstructor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSuper_(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("super_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

