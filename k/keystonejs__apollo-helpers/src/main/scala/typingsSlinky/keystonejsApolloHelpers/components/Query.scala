package typingsSlinky.keystonejsApolloHelpers.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.keystonejsApolloHelpers.mod.KeystoneQueryTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Query
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query] {
  @JSImport("@keystonejs/apollo-helpers", "Query")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(query: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.keystonejsApolloHelpers.mod.Query] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KeystoneQueryTypeProps
}

