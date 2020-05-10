package typingsSlinky.reduxSagaTypes.mod

import typingsSlinky.reduxSagaTypes.reduxSagaTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinatorEffect[T, E] extends js.Object {
  @JSName("@@redux-saga/IO")
  var `@@redux-sagaSlashIO`: `true` = js.native
  var combinator: `true` = js.native
  var payload: CombinatorEffectDescriptor[E] = js.native
  var `type`: T = js.native
}

object CombinatorEffect {
  @scala.inline
  def apply[T, E](
    `@@redux-sagaSlashIO`: `true`,
    combinator: `true`,
    payload: CombinatorEffectDescriptor[E],
    `type`: T
  ): CombinatorEffect[T, E] = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("@@redux-saga/IO")(`@@redux-sagaSlashIO`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinatorEffect[T, E]]
  }
  @scala.inline
  implicit class CombinatorEffectOps[Self[t, e] <: CombinatorEffect[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def `with@@redux-sagaSlashIO`(value: `true`): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("@@redux-saga/IO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombinator(value: `true`): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: CombinatorEffectDescriptor[E]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

