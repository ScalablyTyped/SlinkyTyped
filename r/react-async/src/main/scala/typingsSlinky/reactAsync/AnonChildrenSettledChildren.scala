package typingsSlinky.reactAsync

import typingsSlinky.reactAsync.mod.SettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenSettledChildren[T] extends js.Object {
  var children: js.UndefOr[SettledChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object AnonChildrenSettledChildren {
  @scala.inline
  def apply[T](children: SettledChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): AnonChildrenSettledChildren[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenSettledChildren[T]]
  }
}

