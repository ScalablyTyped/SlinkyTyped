package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReducerNextThrowMeta[State, Payload, Meta] extends js.Object {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ ActionMeta[Payload, Meta], State]] = js.native
}

object ReducerNextThrowMeta {
  @scala.inline
  def apply[State, Payload, Meta](): ReducerNextThrowMeta[State, Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerNextThrowMeta[State, Payload, Meta]]
  }
  @scala.inline
  implicit class ReducerNextThrowMetaOps[Self[state, payload, meta] <: ReducerNextThrowMeta[state, payload, meta], State, Payload, Meta] (val x: Self[State, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, Payload, Meta]) with Other]
    @scala.inline
    def withNext(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNext: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withThrow(value: (/* state */ State, /* action */ ActionMeta[Payload, Meta]) => State): Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThrow: Self[State, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.undefined)
        ret
    }
  }
  
}

