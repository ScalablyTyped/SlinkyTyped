package typingsSlinky.atKeystonejsApolloDashHelpers.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeystoneProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod.KeystoneProvider
    ] {
  @JSImport("@keystonejs/apollo-helpers", "KeystoneProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.atKeystonejsApolloDashHelpers.atKeystonejsApolloDashHelpersMod.KeystoneProvider
  ] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = js.Object
}

