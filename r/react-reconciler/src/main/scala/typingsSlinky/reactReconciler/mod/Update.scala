package typingsSlinky.reactReconciler.mod

import typingsSlinky.reactReconciler.reactReconcilerNumbers.`0`
import typingsSlinky.reactReconciler.reactReconcilerNumbers.`1`
import typingsSlinky.reactReconciler.reactReconcilerNumbers.`2`
import typingsSlinky.reactReconciler.reactReconcilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue
@js.native
trait Update[State] extends js.Object {
  var callback: js.Function0[_] | Null = js.native
  var expirationTime: ExpirationTime = js.native
  var next: Update[State] | Null = js.native
  var nextEffect: Update[State] | Null = js.native
  var payload: js.Any = js.native
  var tag: `0` | `1` | `2` | `3` = js.native
}

object Update {
  @scala.inline
  def apply[State](expirationTime: ExpirationTime, payload: js.Any, tag: `0` | `1` | `2` | `3`): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[State]]
  }
  @scala.inline
  implicit class UpdateOps[Self[state] <: Update[state], State] (val x: Self[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[State] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[State] with Other]
    @scala.inline
    def withExpirationTime(value: ExpirationTime): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: js.Any): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: `0` | `1` | `2` | `3`): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(value: () => _): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallbackNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(null)
        ret
    }
    @scala.inline
    def withNext(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(null)
        ret
    }
    @scala.inline
    def withNextEffect(value: Update[State]): Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextEffectNull: Self[State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextEffect")(null)
        ret
    }
  }
  
}

