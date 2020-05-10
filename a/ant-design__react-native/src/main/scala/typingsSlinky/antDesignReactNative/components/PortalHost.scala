package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignReactNative.portalHostMod.PortalHostProps
import typingsSlinky.antDesignReactNative.portalHostMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalHost {
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PortalHostProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PortalHost.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

