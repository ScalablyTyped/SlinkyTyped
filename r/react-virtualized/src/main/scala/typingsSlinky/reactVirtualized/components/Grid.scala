package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typingsSlinky.reactVirtualized.esGridMod.GridCellProps
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps
import typingsSlinky.reactVirtualized.esGridMod.GridProps
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.ScrollbarPresenceParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.Grid] {
  @JSImport("react-virtualized", "Grid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style, tabIndex */
  def apply(
    cellRenderer: /* props */ GridCellProps => TagMod[Any],
    columnCount: Double,
    columnWidth: Double | (js.Function1[/* params */ Index, Double]),
    height: Double,
    rowCount: Double,
    rowHeight: Double | (js.Function1[/* params */ Index, Double]),
    width: Double,
    `aria-label`: String = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    autoContainerWidth: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[TagMod[Any]] = null,
    containerProps: js.Object = null,
    containerRole: String = null,
    containerStyle: CSSProperties = null,
    deferredMeasurementCache: CellMeasurerCache = null,
    estimatedColumnSize: Int | Double = null,
    estimatedRowSize: Int | Double = null,
    getScrollbarSize: () => Double = null,
    isScrolling: js.UndefOr[Boolean] = js.undefined,
    noContentRenderer: () => TagMod[Any] = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onScrollbarPresenceChange: /* params */ ScrollbarPresenceParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    overscanColumnCount: Int | Double = null,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices = null,
    overscanRowCount: Int | Double = null,
    role: String = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    scrollingResetTimeInterval: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Grid] = {
    val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoContainerWidth)) __obj.updateDynamic("autoContainerWidth")(autoContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cellRangeRenderer != null) __obj.updateDynamic("cellRangeRenderer")(js.Any.fromFunction1(cellRangeRenderer))
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (containerRole != null) __obj.updateDynamic("containerRole")(containerRole.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache.asInstanceOf[js.Any])
    if (estimatedColumnSize != null) __obj.updateDynamic("estimatedColumnSize")(estimatedColumnSize.asInstanceOf[js.Any])
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (getScrollbarSize != null) __obj.updateDynamic("getScrollbarSize")(js.Any.fromFunction0(getScrollbarSize))
    if (!js.isUndefined(isScrolling)) __obj.updateDynamic("isScrolling")(isScrolling.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollbarPresenceChange != null) __obj.updateDynamic("onScrollbarPresenceChange")(js.Any.fromFunction1(onScrollbarPresenceChange))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanIndicesGetter != null) __obj.updateDynamic("overscanIndicesGetter")(js.Any.fromFunction1(overscanIndicesGetter))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GridProps
}

