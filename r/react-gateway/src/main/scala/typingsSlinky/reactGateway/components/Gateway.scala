package typingsSlinky.reactGateway.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Gateway
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactGateway.mod.Gateway] {
  @JSImport("react-gateway", "Gateway")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(into: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactGateway.mod.Gateway] = {
    val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GatewayProps
}

