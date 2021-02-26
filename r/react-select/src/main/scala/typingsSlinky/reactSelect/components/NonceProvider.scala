package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.nonceProviderMod.NonceProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NonceProvider {
  
  @scala.inline
  def apply(nonce: String): Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] = {
    val __props = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider](js.Array(this.component, __props.asInstanceOf[NonceProviderProps]))
  }
  
  @JSImport("react-select", "NonceProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NonceProviderProps): Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] = new Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
