package typingsSlinky.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoder[I, A] extends js.Object {
  val name: String = js.native
  def decode(i: I): Validation[A] = js.native
  def validate(i: I, context: Context): Validation[A] = js.native
}

object Decoder {
  @scala.inline
  def apply[I, A](decode: I => Validation[A], name: String, validate: (I, Context) => Validation[A]): Decoder[I, A] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), name = name.asInstanceOf[js.Any], validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[Decoder[I, A]]
  }
  @scala.inline
  implicit class DecoderOps[Self[i, a] <: Decoder[i, a], I, A] (val x: Self[I, A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, A]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, A]) with Other]
    @scala.inline
    def withDecode(value: I => Validation[A]): Self[I, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self[I, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: (I, Context) => Validation[A]): Self[I, A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

