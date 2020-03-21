package typingsSlinky.reactSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactSelect.nonceProviderMod.NonceProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NonceProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] {
  @JSImport("react-select", "NonceProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(nonce: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactSelect.mod.NonceProvider] = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NonceProviderProps
}

