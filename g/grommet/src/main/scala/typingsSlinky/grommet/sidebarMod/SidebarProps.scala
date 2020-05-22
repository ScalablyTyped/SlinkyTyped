package typingsSlinky.grommet.sidebarMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var footer: js.UndefOr[TagMod[Any]] = js.undefined
  var header: js.UndefOr[TagMod[Any]] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(footer: TagMod[Any] = null, header: TagMod[Any] = null): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

