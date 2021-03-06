package typingsSlinky.entriaRelayExperimental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.entriaRelayExperimental.relayEnvironmentProviderMod.Props
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RelayEnvironmentProvider {
  
  @scala.inline
  def apply(environment: Environment): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@entria/relay-experimental", "RelayEnvironmentProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
