package typingsSlinky.activexLibreoffice

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sequence[T] extends SeqEquiv[T] {
  var typekey: sequence[T] = js.native
}

object sequence {
  @scala.inline
  def apply[T](typekey: sequence[T]): sequence[T] = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[sequence[T]]
  }
  @scala.inline
  implicit class sequenceOps[Self[t] <: sequence[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTypekey(value: sequence[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

