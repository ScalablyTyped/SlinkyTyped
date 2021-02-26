package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antDesignReactNative.portalHostMod.PortalHostProps
import typingsSlinky.antDesignReactNative.portalPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  object Host {
    
    @JSImport("@ant-design/react-native", "Portal.Host")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Host.type): SharedBuilder_PortalHostProps1518429609[typingsSlinky.antDesignReactNative.mod.Portal.Host] = new SharedBuilder_PortalHostProps1518429609[typingsSlinky.antDesignReactNative.mod.Portal.Host](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PortalHostProps): SharedBuilder_PortalHostProps1518429609[typingsSlinky.antDesignReactNative.mod.Portal.Host] = new SharedBuilder_PortalHostProps1518429609[typingsSlinky.antDesignReactNative.mod.Portal.Host](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "Portal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Portal.type): Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal] = new Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal] = new Default[tag.type, typingsSlinky.antDesignReactNative.mod.Portal](js.Array(this.component, p.asInstanceOf[js.Any]))
}
