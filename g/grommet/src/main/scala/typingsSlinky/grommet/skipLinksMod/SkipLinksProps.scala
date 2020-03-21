package typingsSlinky.grommet.skipLinksMod

import slinky.core.TagMod
import typingsSlinky.grommet.AnonSkipTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: TagMod[Any]
  var messages: js.UndefOr[AnonSkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: TagMod[Any], messages: AnonSkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinksProps]
  }
}

