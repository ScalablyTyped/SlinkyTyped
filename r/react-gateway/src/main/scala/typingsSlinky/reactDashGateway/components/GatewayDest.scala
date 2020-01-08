package typingsSlinky.reactDashGateway.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashGateway.gatewayDestMod.GatewayDestProps
import typingsSlinky.reactDashGateway.gatewayDestMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatewayDest
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-gateway/GatewayDest", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    name: String,
    component: String | ReactComponentClass[js.Object] = null,
    tagName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GatewayDestProps
}

