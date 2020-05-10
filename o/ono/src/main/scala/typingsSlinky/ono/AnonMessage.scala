package typingsSlinky.ono

import typingsSlinky.ono.typesMod.ErrorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMessage[E /* <: ErrorLike */, P /* <: js.Object */] extends js.Object {
  var message: String = js.native
  var originalError: js.UndefOr[E] = js.native
  var props: js.UndefOr[P] = js.native
}

object AnonMessage {
  @scala.inline
  def apply[E, P](message: String): AnonMessage[E, P] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage[E, P]]
  }
  @scala.inline
  implicit class AnonMessageOps[Self[e, p] <: AnonMessage[e, p], E, P] (val x: Self[E, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[E, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[E, P]) with Other]
    @scala.inline
    def withMessage(value: String): Self[E, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalError(value: E): Self[E, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalError: Self[E, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalError")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: P): Self[E, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[E, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

