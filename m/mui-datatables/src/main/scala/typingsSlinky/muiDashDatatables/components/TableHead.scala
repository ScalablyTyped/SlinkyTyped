package typingsSlinky.muiDashDatatables.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.muiDashDatatables.muiDashDatatablesMod.MUIDataTableColumnDef
import typingsSlinky.muiDashDatatables.muiDashDatatablesMod.MUIDataTableHead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHead
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("mui-datatables", "TableHead")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    classes: js.Object = null,
    columns: js.Array[MUIDataTableColumnDef] = null,
    count: Int | Double = null,
    data: js.Array[_] = null,
    options: js.Object = null,
    page: js.Any = null,
    selectedRows: js.Any = null,
    setCellRef: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (setCellRef != null) __obj.updateDynamic("setCellRef")(setCellRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MUIDataTableHead
}

