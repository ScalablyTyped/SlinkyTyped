package typingsSlinky.reactAsync

import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.InitialChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState[T] extends js.Object {
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object AnonState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: InitialChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): AnonState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState[T]]
  }
}

