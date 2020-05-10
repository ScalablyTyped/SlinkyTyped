package typingsSlinky.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNot[T] extends js.Object {
  var not: T = js.native
}

object AnonNot {
  @scala.inline
  def apply[T](not: T): AnonNot[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNot[T]]
  }
  @scala.inline
  implicit class AnonNotOps[Self[t] <: AnonNot[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNot(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

