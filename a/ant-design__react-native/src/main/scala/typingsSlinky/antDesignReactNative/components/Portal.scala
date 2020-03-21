package typingsSlinky.antDesignReactNative.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.portalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/portal", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

