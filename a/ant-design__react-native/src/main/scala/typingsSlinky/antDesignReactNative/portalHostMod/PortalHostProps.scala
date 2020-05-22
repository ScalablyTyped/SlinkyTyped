package typingsSlinky.antDesignReactNative.portalHostMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalHostProps extends js.Object {
  var children: TagMod[Any]
}

object PortalHostProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): PortalHostProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalHostProps]
  }
}

