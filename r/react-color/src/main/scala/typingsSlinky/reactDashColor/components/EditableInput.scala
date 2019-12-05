package typingsSlinky.reactDashColor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashColor.libComponentsCommonEditableInputMod.EditableInputProps
import typingsSlinky.reactDashColor.libComponentsCommonEditableInputMod.EditableInputStyles
import typingsSlinky.reactDashColor.libComponentsCommonEditableInputMod.default
import typingsSlinky.reactDashColor.reactDashColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-color/lib/components/common/EditableInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    color: Color = null,
    dragLabel: String = null,
    dragMax: String = null,
    label: String = null,
    style: EditableInputStyles = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dragLabel != null) __obj.updateDynamic("dragLabel")(dragLabel.asInstanceOf[js.Any])
    if (dragMax != null) __obj.updateDynamic("dragMax")(dragMax.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EditableInputProps
}

