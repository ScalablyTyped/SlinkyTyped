package typingsSlinky.griddleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleReact.mod.components.TableHeadingCell
import typingsSlinky.griddleReact.mod.components.TableHeadingCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTableHeadingCell
  extends ExternalComponentWithAttributesWithRefType[tag.type, TableHeadingCell] {
  @JSImport("griddle-react", "components.TableHeadingCell")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, onMouseEnter, onMouseLeave, style, title */
  def apply(columnId: Int | Double = null, icon: js.Any = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, TableHeadingCell] = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, TableHeadingCell] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleReact.mod.components.TableHeadingCell](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableHeadingCellProps
}

