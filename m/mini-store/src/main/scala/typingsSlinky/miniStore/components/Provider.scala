package typingsSlinky.miniStore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.miniStore.providerMod.ProviderProps
import typingsSlinky.miniStore.typesMod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @scala.inline
  def apply(store: Store[js.Object]): Default[tag.type, typingsSlinky.miniStore.mod.Provider] = {
    val __props = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.miniStore.mod.Provider](js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
  
  @JSImport("mini-store", "Provider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps): Default[tag.type, typingsSlinky.miniStore.mod.Provider] = new Default[tag.type, typingsSlinky.miniStore.mod.Provider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
