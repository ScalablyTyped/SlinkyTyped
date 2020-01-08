package typingsSlinky.reactDashGateway.components

import slinky.core.ExternalComponentNoPropsWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGateway.gatewayProviderMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatewayProvider
  extends ExternalComponentNoPropsWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-gateway/GatewayProvider", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
}

