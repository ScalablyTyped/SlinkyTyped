package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignReactNative.portalConsumerMod.PortalConsumerProps
import typingsSlinky.antDesignReactNative.portalConsumerMod.default
import typingsSlinky.antDesignReactNative.portalHostMod.PortalMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalConsumer {
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PortalConsumerProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(manager: PortalMethods): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PortalConsumerProps]))
  }
}

