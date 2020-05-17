package typingsSlinky.reapop.anon

import typingsSlinky.reapop.mod.ActionTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadType extends js.Object {
  var payload: js.Any = js.native
  var `type`: ActionTypes = js.native
}

object PayloadType {
  @scala.inline
  def apply(payload: js.Any, `type`: ActionTypes): PayloadType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType]
  }
  @scala.inline
  implicit class PayloadTypeOps[Self <: PayloadType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ActionTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

