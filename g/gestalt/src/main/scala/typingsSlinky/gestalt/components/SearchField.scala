package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon_SyntheticEvent
import typingsSlinky.gestalt.gestaltMod.SearchFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchField
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.SearchField] {
  @JSImport("gestalt", "SearchField")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onBlur, onFocus, placeholder */
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: Anon_SyntheticEvent => Unit,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.SearchField] = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SearchFieldProps
}

