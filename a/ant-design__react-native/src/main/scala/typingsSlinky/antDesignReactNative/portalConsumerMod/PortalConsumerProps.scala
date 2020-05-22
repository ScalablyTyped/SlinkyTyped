package typingsSlinky.antDesignReactNative.portalConsumerMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.portalHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalConsumerProps extends js.Object {
  var children: TagMod[Any]
  var manager: PortalMethods
}

object PortalConsumerProps {
  @scala.inline
  def apply(manager: PortalMethods, children: TagMod[Any] = null): PortalConsumerProps = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalConsumerProps]
  }
}

