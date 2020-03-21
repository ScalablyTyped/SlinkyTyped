package typingsSlinky.reactBreadcrumbs

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(title: TagMod[Any] = null): AnonTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

