package typingsSlinky.muiDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.muiDatatables.AnonRowIndex
import typingsSlinky.muiDatatables.mod.MUIDataTableBody
import typingsSlinky.muiDatatables.mod.MUIDataTableColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mui-datatables", "TableBody")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: js.Object,
    filterList: js.Array[js.Array[String]] = null,
    onRowClick: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => Unit = null,
    searchText: String = null,
    selectRowUpdate: /* args */ js.Any => _ = null,
    selectedRows: js.Object = null,
    toggleExpandRow: /* args */ js.Any => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1(selectRowUpdate))
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (toggleExpandRow != null) __obj.updateDynamic("toggleExpandRow")(js.Any.fromFunction1(toggleExpandRow))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MUIDataTableBody
}

