package typingsSlinky.blueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsTable.columnMod.IColumnProps
import typingsSlinky.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import typingsSlinky.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsTable.mod.Column] {
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, name */
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => ReactElement = null,
    columnHeaderCellRenderer: /* columnIndex */ Double => slinky.core.facade.ReactElement = null,
    id: String | Double = null,
    loadingOptions: js.Array[ColumnLoadingOption] = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => slinky.core.facade.ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Column] = {
    val __obj = js.Dynamic.literal()
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2(cellRenderer))
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(columnHeaderCellRenderer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2(nameRenderer))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Column] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsTable.mod.Column](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IColumnProps
}

