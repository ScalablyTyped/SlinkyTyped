package typingsSlinky.reduxApiMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAARequestTypeDescriptor[State, Payload, Meta] extends js.Object {
  var meta: js.UndefOr[(js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta]) | Meta] = js.native
  var payload: js.UndefOr[
    (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload]) | Payload
  ] = js.native
  var `type`: String | js.Symbol = js.native
}

object RSAARequestTypeDescriptor {
  @scala.inline
  def apply[State, Payload, Meta](`type`: String | js.Symbol): RSAARequestTypeDescriptor[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAARequestTypeDescriptor[State, Payload, Meta]]
  }
  @scala.inline
  implicit class RSAARequestTypeDescriptorOps[Self[state, payload, meta] <: RSAARequestTypeDescriptor[state, payload, meta], State, Payload, Meta] (val x: Self[State, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, Payload, Meta]) with Other]
    @scala.inline
    def withType(value: String | js.Symbol): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Meta): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMeta(value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Meta]) | Meta): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadFunction2(value: (/* action */ RSAAAction[_, _, _], /* state */ State) => Payload): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPayload(value: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ State, Payload]) | Payload): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

