package typingsSlinky.reactBreadcrumbs.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object Title {
  @scala.inline
  def apply(title: TagMod[Any] = null): Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

