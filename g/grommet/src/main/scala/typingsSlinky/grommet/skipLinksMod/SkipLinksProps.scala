package typingsSlinky.grommet.skipLinksMod

import slinky.core.TagMod
import typingsSlinky.grommet.anon.SkipTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: TagMod[Any]
  var messages: js.UndefOr[SkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, messages: SkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinksProps]
  }
}

