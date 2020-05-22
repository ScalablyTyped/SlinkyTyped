package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.FulfilledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistState[T] extends js.Object {
  var children: js.UndefOr[FulfilledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object PersistState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: FulfilledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): PersistState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistState[T]]
  }
}

