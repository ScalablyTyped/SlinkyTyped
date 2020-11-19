package typingsSlinky.reactRelay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.relayRuntime.relayStoreTypesMod.RelayContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-relay", "ReactRelayContext.Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: RelayContext): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: ProviderProps[RelayContext | Null]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
