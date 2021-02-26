package typingsSlinky.antDesignReactNative.components

import typingsSlinky.antDesignReactNative.portalHostMod.PortalHostProps
import typingsSlinky.antDesignReactNative.portalHostMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalHost {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PortalHost.type): SharedBuilder_PortalHostProps1518429609[default] = new SharedBuilder_PortalHostProps1518429609[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalHostProps): SharedBuilder_PortalHostProps1518429609[default] = new SharedBuilder_PortalHostProps1518429609[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
