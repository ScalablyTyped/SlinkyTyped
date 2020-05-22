package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.mod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenPersist[T] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object ChildrenPersist {
  @scala.inline
  def apply[T](children: RejectedChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): ChildrenPersist[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPersist[T]]
  }
}

