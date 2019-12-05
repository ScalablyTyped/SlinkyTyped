package typingsSlinky.reactDashReconciler.reactDashReconcilerMod

import typingsSlinky.reactDashReconciler.reactDashReconcilerNumbers.`0`
import typingsSlinky.reactDashReconciler.reactDashReconcilerNumbers.`1`
import typingsSlinky.reactDashReconciler.reactDashReconcilerNumbers.`2`
import typingsSlinky.reactDashReconciler.reactDashReconcilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue
trait Update[State] extends js.Object {
  var callback: js.Function0[_] | Null
  var expirationTime: ExpirationTime
  var next: Update[State] | Null
  var nextEffect: Update[State] | Null
  var payload: js.Any
  var tag: `0` | `1` | `2` | `3`
}

object Update {
  @scala.inline
  def apply[State](
    expirationTime: ExpirationTime,
    payload: js.Any,
    tag: `0` | `1` | `2` | `3`,
    callback: () => _ = null,
    next: Update[State] = null,
    nextEffect: Update[State] = null
  ): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextEffect != null) __obj.updateDynamic("nextEffect")(nextEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[State]]
  }
}

