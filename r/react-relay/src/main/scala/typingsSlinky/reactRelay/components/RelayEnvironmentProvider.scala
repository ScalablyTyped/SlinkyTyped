package typingsSlinky.reactRelay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactRelay.relayEnvironmentProviderMod.Props
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RelayEnvironmentProvider {
  
  @JSImport("react-relay/hooks", "RelayEnvironmentProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(environment: Environment): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
