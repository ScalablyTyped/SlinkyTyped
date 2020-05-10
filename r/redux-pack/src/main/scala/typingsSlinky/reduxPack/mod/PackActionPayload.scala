package typingsSlinky.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux.redux.Action<any> & {  payload  :Payload,   meta  :redux-pack.redux-pack.MetaPayload<M>} */
@js.native
trait PackActionPayload[Payload, M] extends js.Object {
  var meta: MetaPayload[M] = js.native
  var payload: Payload = js.native
  var `type`: js.Any = js.native
}

object PackActionPayload {
  @scala.inline
  def apply[Payload, M](meta: MetaPayload[M], payload: Payload, `type`: js.Any): PackActionPayload[Payload, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackActionPayload[Payload, M]]
  }
  @scala.inline
  implicit class PackActionPayloadOps[Self[payload, m] <: PackActionPayload[payload, m], Payload, M] (val x: Self[Payload, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Payload, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Payload, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Payload, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Payload, M]) with Other]
    @scala.inline
    def withMeta(value: MetaPayload[M]): Self[Payload, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Payload): Self[Payload, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self[Payload, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

