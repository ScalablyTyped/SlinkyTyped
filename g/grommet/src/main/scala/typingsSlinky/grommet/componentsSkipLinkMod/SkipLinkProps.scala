package typingsSlinky.grommet.componentsSkipLinkMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinkProps extends js.Object {
  var id: String
  var label: js.UndefOr[TagMod[Any]] = js.undefined
}

object SkipLinkProps {
  @scala.inline
  def apply(id: String, label: TagMod[Any] = null): SkipLinkProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinkProps]
  }
}

