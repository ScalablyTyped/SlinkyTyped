package typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashConsumerMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.libPortalPortalDashHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalConsumerProps extends js.Object {
  var children: TagMod[Any]
  var manager: PortalMethods
}

object PortalConsumerProps {
  @scala.inline
  def apply(children: TagMod[Any], manager: PortalMethods): PortalConsumerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortalConsumerProps]
  }
}

