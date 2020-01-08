package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.gestaltMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.Label] {
  @JSImport("gestalt", "Label")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(htmlFor: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.Label] = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LabelProps
}

