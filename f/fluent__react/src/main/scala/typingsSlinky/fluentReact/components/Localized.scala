package typingsSlinky.fluentReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fluentReact.mod.LocalizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Localized
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fluentReact.mod.Localized] {
  @JSImport("@fluent/react", "Localized")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(id: String, attrs: js.Object = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.fluentReact.mod.Localized] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocalizedProps
}

