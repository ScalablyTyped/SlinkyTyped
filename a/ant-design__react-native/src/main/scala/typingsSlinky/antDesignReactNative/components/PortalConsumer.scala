package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignReactNative.portalConsumerMod.PortalConsumerProps
import typingsSlinky.antDesignReactNative.portalConsumerMod.default
import typingsSlinky.antDesignReactNative.portalHostMod.PortalMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalConsumer {
  
  @scala.inline
  def apply(manager: PortalMethods): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[PortalConsumerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PortalConsumerProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
