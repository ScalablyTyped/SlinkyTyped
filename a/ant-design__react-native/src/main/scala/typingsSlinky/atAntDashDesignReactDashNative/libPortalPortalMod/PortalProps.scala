package typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  /**
    * Content of the `Portal`.
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

