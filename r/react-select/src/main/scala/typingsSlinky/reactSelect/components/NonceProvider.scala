package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.nonceProviderMod.NonceProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NonceProvider {
  @JSImport("react-select", "NonceProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: NonceProviderProps): Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] = new Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(nonce: String): Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] = {
    val __props = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSelect.mod.NonceProvider](js.Array(this.component, __props.asInstanceOf[NonceProviderProps]))
  }
}

