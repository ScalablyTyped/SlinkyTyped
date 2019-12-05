package typingsSlinky.reactDashGateway.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGateway.gatewayMod.GatewayProps
import typingsSlinky.reactDashGateway.gatewayMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Gateway
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-gateway/Gateway", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(into: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GatewayProps
}

