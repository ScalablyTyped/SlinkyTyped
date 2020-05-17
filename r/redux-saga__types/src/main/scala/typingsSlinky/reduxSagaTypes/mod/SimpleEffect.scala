package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.reduxSagaTypes.reduxSagaTypesBooleans.`false`
import typingsSlinky.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEffect[T, P]
  extends Effect[T]
     with StrictEffect[T] {
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true` = js.native
  var combinator: `false` = js.native
  var payload: P = js.native
  var `type`: T = js.native
}

object SimpleEffect {
  @scala.inline
  def apply[T, P](`@@redux-sagaSlashIO`: `true`, combinator: `false`, payload: P, `type`: T): SimpleEffect[T, P] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEffect[T, P]]
  }
  @scala.inline
  implicit class SimpleEffectOps[Self[t, p] <: SimpleEffect[t, p], T, P] (val x: Self[T, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, P]) with Other]
    @scala.inline
    def `with@@redux-sagaSlashIO`(value: `true`): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@redux-saga/IO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombinator(value: `false`): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: P): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

