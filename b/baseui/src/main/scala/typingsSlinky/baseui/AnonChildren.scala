package typingsSlinky.baseui

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ T, TagMod[Any]]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply[T](children: /* args */ T => TagMod[Any] = null): AnonChildren[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren[T]]
  }
}

