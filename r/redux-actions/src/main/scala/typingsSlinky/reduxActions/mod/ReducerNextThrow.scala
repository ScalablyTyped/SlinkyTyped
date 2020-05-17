package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReducerNextThrow[State, Payload] extends ReducerMapValue[State, Payload] {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.native
}

object ReducerNextThrow {
  @scala.inline
  def apply[State, Payload](): ReducerNextThrow[State, Payload] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
  }
  @scala.inline
  implicit class ReducerNextThrowOps[Self[state, payload] <: ReducerNextThrow[state, payload], State, Payload] (val x: Self[State, Payload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, Payload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, Payload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, Payload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, Payload]) with Other]
    @scala.inline
    def withNext(value: (/* state */ State, /* action */ Action[Payload]) => State): Self[State, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNext: Self[State, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withThrow(value: (/* state */ State, /* action */ Action[Payload]) => State): Self[State, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThrow: Self[State, Payload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throw")(js.undefined)
        ret
    }
  }
  
}

