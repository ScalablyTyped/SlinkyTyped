package typingsSlinky.reactAsync

import typingsSlinky.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitial[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
}

object AnonInitial {
  @scala.inline
  def apply[T](children: PendingChildren[T] = null, initial: js.UndefOr[Boolean] = js.undefined): AnonInitial[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitial[T]]
  }
}

