package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoder[A, O] extends js.Object {
  def encode(a: A): O = js.native
}

object Encoder {
  @scala.inline
  def apply[A, O](encode: A => O): Encoder[A, O] = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Encoder[A, O]]
  }
  @scala.inline
  implicit class EncoderOps[Self[a, o] <: Encoder[a, o], A, O] (val x: Self[A, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, O]) with Other]
    @scala.inline
    def withEncode(value: A => O): Self[A, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

