package typingsSlinky.reactDashVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashVirtualized.distEsTableMod.ColumnProps
import typingsSlinky.reactDashVirtualized.distEsTableMod.SortDirectionType
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellDataGetterParams
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableCellProps
import typingsSlinky.reactDashVirtualized.distEsTableMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsTableMod.Column] {
  @JSImport("react-virtualized/dist/es/Table", "Column")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    dataKey: js.Any,
    width: Double,
    `aria-label`: String = null,
    cellDataGetter: /* params */ TableCellDataGetterParams => js.Any = null,
    cellRenderer: /* props */ TableCellProps => TagMod[Any] = null,
    columnData: js.Any = null,
    defaultSortDirection: SortDirectionType = null,
    disableSort: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    headerClassName: String = null,
    headerRenderer: /* props */ TableHeaderProps => TagMod[Any] = null,
    headerStyle: CSSProperties = null,
    label: TagMod[Any] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashVirtualized.distEsTableMod.Column] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (cellDataGetter != null) __obj.updateDynamic("cellDataGetter")(js.Any.fromFunction1(cellDataGetter))
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1(cellRenderer))
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1(headerRenderer))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColumnProps
}

