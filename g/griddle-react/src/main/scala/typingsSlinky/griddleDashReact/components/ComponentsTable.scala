package typingsSlinky.griddleDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.Table
import typingsSlinky.griddleDashReact.griddleDashReactMod.components.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTable
  extends ExternalComponentWithAttributesWithRefType[tag.type, Table] {
  @JSImport("griddle-react", "components.Table")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    NoResults: js.Any = null,
    TableBody: js.Any = null,
    TableHeading: js.Any = null,
    visibleRows: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Table] = {
    val __obj = js.Dynamic.literal()
    if (NoResults != null) __obj.updateDynamic("NoResults")(NoResults.asInstanceOf[js.Any])
    if (TableBody != null) __obj.updateDynamic("TableBody")(TableBody.asInstanceOf[js.Any])
    if (TableHeading != null) __obj.updateDynamic("TableHeading")(TableHeading.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableProps
}

