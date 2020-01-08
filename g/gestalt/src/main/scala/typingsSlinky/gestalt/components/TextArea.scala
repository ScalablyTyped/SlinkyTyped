package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.Anon_EventValue
import typingsSlinky.gestalt.gestaltMod.TextAreaProps
import typingsSlinky.gestalt.gestaltStrings.down
import typingsSlinky.gestalt.gestaltStrings.left
import typingsSlinky.gestalt.gestaltStrings.right
import typingsSlinky.gestalt.gestaltStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.gestaltMod.TextArea] {
  @JSImport("gestalt", "TextArea")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, onBlur, onFocus, placeholder, rows */
  def apply(
    id: String,
    onChange: Anon_EventValue => Unit,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.gestaltMod.TextArea] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextAreaProps
}

