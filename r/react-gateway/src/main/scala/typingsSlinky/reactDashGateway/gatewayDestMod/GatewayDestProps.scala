package typingsSlinky.reactDashGateway.gatewayDestMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayDestProps extends js.Object {
  var component: js.UndefOr[String | ReactComponentClass[js.Object]] = js.undefined
  var name: String
  var tagName: js.UndefOr[String] = js.undefined
}

object GatewayDestProps {
  @scala.inline
  def apply(name: String, component: String | ReactComponentClass[js.Object] = null, tagName: String = null): GatewayDestProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayDestProps]
  }
}

