package typingsSlinky.fixedDashDataDashTable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.CellProps
import typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.ColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Column] {
  @JSImport("fixed-data-table", "Column")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    width: Double,
    align: String = null,
    allowCellsRecycling: js.UndefOr[Boolean] = js.undefined,
    cell: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement]) = null,
    columnKey: String | Double = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    footer: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement]) = null,
    header: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement]) = null,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.fixedDashDataDashTable.fixedDashDataDashTableMod.Column] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellsRecycling)) __obj.updateDynamic("allowCellsRecycling")(allowCellsRecycling.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColumnProps
}

