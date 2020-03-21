package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.components.Row
import typingsSlinky.griddleReact.mod.components.RowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsRow
  extends ExternalComponentWithAttributesWithRefType[tag.type, Row] {
  @JSImport("griddle-react", "components.Row")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onMouseEnter, onMouseLeave, style */
  def apply(
    Cell: js.Any = null,
    columnIds: js.Array[Double] = null,
    griddleKey: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Row] = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds.asInstanceOf[js.Any])
    if (griddleKey != null) __obj.updateDynamic("griddleKey")(griddleKey.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, Row] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.griddleReact.mod.components.Row](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RowProps
}

