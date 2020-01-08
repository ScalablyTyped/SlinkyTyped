package typingsSlinky.griddleDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.TableBody
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.TableBodyProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, TableBody] {
  @JSImport("griddle-react", "components.TableBody")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    Row: js.Any = null,
    rowIds: js.Array[Double] = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, TableBody] = {
    val __obj = js.Dynamic.literal()
    if (Row != null) __obj.updateDynamic("Row")(Row.asInstanceOf[js.Any])
    if (rowIds != null) __obj.updateDynamic("rowIds")(rowIds.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, TableBody] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.griddleDashReact.griddleDashReactMod.components.TableBody](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableBodyProps
}

