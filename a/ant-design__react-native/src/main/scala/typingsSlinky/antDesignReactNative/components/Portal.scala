package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignReactNative.portalPortalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  @JSImport("@ant-design/react-native", "Portal")
  @js.native
  object component extends js.Object
  
  def withProps(p: PortalProps): Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal] = new Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Portal.type): Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal] = new Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal](js.Array(this.component, js.Dictionary.empty))()
}

