package typingsSlinky.sanctuary.mod

import typingsSlinky.sanctuary.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Either[A, B] extends js.Object {
  var constructor: `0` = js.native
}

object Either {
  @scala.inline
  def apply[A, B](constructor: `0`): Either[A, B] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Either[A, B]]
  }
  @scala.inline
  implicit class EitherOps[Self[a, b] <: Either[a, b], A, B] (val x: Self[A, B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, B]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, B]) with Other]
    @scala.inline
    def withConstructor(value: `0`): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

