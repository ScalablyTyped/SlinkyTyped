package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMeta[Payload, Meta] extends Action[Payload] {
  var meta: Meta = js.native
}

object ActionMeta {
  @scala.inline
  def apply[Payload, Meta](meta: Meta, payload: Payload, `type`: String): ActionMeta[Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[Payload, Meta]]
  }
  @scala.inline
  implicit class ActionMetaOps[Self[payload, meta] <: ActionMeta[payload, meta], Payload, Meta] (val x: Self[Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Payload, Meta]) with Other]
    @scala.inline
    def withMeta(value: Meta): Self[Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

