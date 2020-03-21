package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.components.Cell
import typingsSlinky.griddleReact.mod.components.CellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsCell
  extends ExternalComponentWithAttributesWithRefType[tag.type, Cell] {
  @JSImport("griddle-react", "components.Cell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onMouseEnter, onMouseLeave, style */
  def apply(
    columnId: String = null,
    griddleKey: Int | Double = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Cell] = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (griddleKey != null) __obj.updateDynamic("griddleKey")(griddleKey.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Cell] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.griddleReact.mod.components.Cell](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CellProps
}

