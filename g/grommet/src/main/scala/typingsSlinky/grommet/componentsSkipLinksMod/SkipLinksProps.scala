package typingsSlinky.grommet.componentsSkipLinksMod

import slinky.core.TagMod
import typingsSlinky.grommet.Anon_SkipTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: TagMod[Any]
  var messages: js.UndefOr[Anon_SkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: TagMod[Any], messages: Anon_SkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinksProps]
  }
}

