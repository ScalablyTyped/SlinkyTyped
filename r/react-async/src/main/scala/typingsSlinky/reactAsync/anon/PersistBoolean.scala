package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.AsyncState
import typingsSlinky.reactAsync.mod.SettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistBoolean[T] extends js.Object {
  var children: js.UndefOr[SettledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
  var state: AsyncState[T]
}

object PersistBoolean {
  @scala.inline
  def apply[T](
    state: AsyncState[T],
    children: SettledChildren[T] = null,
    persist: js.UndefOr[Boolean] = js.undefined
  ): PersistBoolean[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistBoolean[T]]
  }
}

