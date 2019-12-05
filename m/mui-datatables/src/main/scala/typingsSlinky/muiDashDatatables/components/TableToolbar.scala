package typingsSlinky.muiDashDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.muiDashDatatables.muiDashDatatablesMod.MUIDataTableColumnDef
import typingsSlinky.muiDashDatatables.muiDashDatatablesMod.MUIDataTableToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableToolbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mui-datatables", "TableToolbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    classes: js.Object = null,
    data: js.Array[_] = null,
    filterData: js.Any = null,
    filterList: js.Array[js.Array[String]] = null,
    filterUpdate: js.Any = null,
    options: js.Object = null,
    resetFilters: js.Any = null,
    searchTextUpdate: /* args */ js.Any => _ = null,
    setTableActions: /* args */ js.Any => _ = null,
    tableRef: /* args */ js.Any => _ = null,
    title: js.Any = null,
    toggleViewColumn: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filterData != null) __obj.updateDynamic("filterData")(filterData.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterUpdate != null) __obj.updateDynamic("filterUpdate")(filterUpdate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resetFilters != null) __obj.updateDynamic("resetFilters")(resetFilters.asInstanceOf[js.Any])
    if (searchTextUpdate != null) __obj.updateDynamic("searchTextUpdate")(js.Any.fromFunction1(searchTextUpdate))
    if (setTableActions != null) __obj.updateDynamic("setTableActions")(js.Any.fromFunction1(setTableActions))
    if (tableRef != null) __obj.updateDynamic("tableRef")(js.Any.fromFunction1(tableRef))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toggleViewColumn != null) __obj.updateDynamic("toggleViewColumn")(toggleViewColumn.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MUIDataTableToolbar
}

