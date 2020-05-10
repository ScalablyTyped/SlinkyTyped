package typingsSlinky.reduxApiMiddleware.mod

import typingsSlinky.reduxApiMiddleware.reduxApiMiddlewareBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAction[Payload] extends js.Object {
  var error: `true` = js.native
  var payload: Payload = js.native
  var `type`: String | js.Symbol = js.native
}

object InvalidAction {
  @scala.inline
  def apply[Payload](error: `true`, payload: Payload, `type`: String | js.Symbol): InvalidAction[Payload] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAction[Payload]]
  }
  @scala.inline
  implicit class InvalidActionOps[Self[payload] <: InvalidAction[payload], Payload] (val x: Self[Payload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Payload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Payload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Payload] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Payload] with Other]
    @scala.inline
    def withError(value: `true`): Self[Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self[Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String | js.Symbol): Self[Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

