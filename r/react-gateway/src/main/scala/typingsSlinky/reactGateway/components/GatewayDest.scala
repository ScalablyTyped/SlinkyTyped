package typingsSlinky.reactGateway.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactGateway.gatewayDestMod.GatewayDestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatewayDest {
  @JSImport("react-gateway", "GatewayDest")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactGateway.mod.GatewayDest] {
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: String | ReactComponentClass[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GatewayDestProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[GatewayDestProps]))
  }
}

