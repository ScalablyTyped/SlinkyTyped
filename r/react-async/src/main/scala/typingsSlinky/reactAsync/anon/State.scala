package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.InitialChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[T] extends js.Object {
  var children: js.UndefOr[InitialChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object State {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: InitialChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): State[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T]]
  }
}

