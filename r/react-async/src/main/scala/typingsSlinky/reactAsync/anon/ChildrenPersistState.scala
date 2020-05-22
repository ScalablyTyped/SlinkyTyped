package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenPersistState[T] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object ChildrenPersistState {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: RejectedChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): ChildrenPersistState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPersistState[T]]
  }
}

