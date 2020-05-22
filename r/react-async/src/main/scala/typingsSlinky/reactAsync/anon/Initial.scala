package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initial[T] extends js.Object {
  var children: js.UndefOr[PendingChildren[T]] = js.undefined
  var initial: js.UndefOr[Boolean] = js.undefined
}

object Initial {
  @scala.inline
  def apply[T](children: PendingChildren[T] = null, initial: js.UndefOr[Boolean] = js.undefined): Initial[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[T]]
  }
}

