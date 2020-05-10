package typingsSlinky.colorNamer

import typingsSlinky.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOmit[T /* <: Palette */] extends js.Object {
  var omit: js.Array[T] = js.native
}

object AnonOmit {
  @scala.inline
  def apply[T](omit: js.Array[T]): AnonOmit[T] = {
    val __obj = js.Dynamic.literal(omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOmit[T]]
  }
  @scala.inline
  implicit class AnonOmitOps[Self[t] <: AnonOmit[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOmit(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

