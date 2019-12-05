package typingsSlinky.q.qMod

import typingsSlinky.q.qStrings.fulfilled
import typingsSlinky.q.qStrings.pending
import typingsSlinky.q.qStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseState[T] extends js.Object {
  var reason: js.UndefOr[js.Any] = js.undefined
  var state: fulfilled | rejected | pending
  var value: js.UndefOr[T] = js.undefined
}

object PromiseState {
  @scala.inline
  def apply[T](state: fulfilled | rejected | pending, reason: js.Any = null, value: T = null): PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseState[T]]
  }
}

