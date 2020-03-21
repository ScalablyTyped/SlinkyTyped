package typingsSlinky.antDesignReactNative.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.portalManagerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalManager
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/portal/portal-manager", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

