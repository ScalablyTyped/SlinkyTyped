package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Wrap a type in a container, making it an object type.
// This is primarily useful in circumventing special handling of union/intersection in typescript
@js.native
trait Boxed[T] extends js.Object {
  var _value: T = js.native
}

object Boxed {
  @scala.inline
  def apply[T](_value: T): Boxed[T] = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boxed[T]]
  }
  @scala.inline
  implicit class BoxedOps[Self[t] <: Boxed[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_value(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

