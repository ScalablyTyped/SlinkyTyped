package typingsSlinky.reactWindow.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactWindow.AnonColumnIndex
import typingsSlinky.reactWindow.mod.CSSDirection
import typingsSlinky.reactWindow.mod.GridOnItemsRenderedProps
import typingsSlinky.reactWindow.mod.GridOnScrollProps
import typingsSlinky.reactWindow.mod.ReactElementType
import typingsSlinky.reactWindow.mod.VariableSizeGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VariableSizeGrid
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactWindow.mod.VariableSizeGrid] {
  @JSImport("react-window", "VariableSizeGrid")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    columnCount: Double,
    columnWidth: Double => Double,
    height: Double,
    rowCount: Double,
    rowHeight: Double => Double,
    width: Double,
    direction: CSSDirection = null,
    estimatedColumnWidth: Int | Double = null,
    estimatedRowHeight: Int | Double = null,
    initialScrollLeft: Int | Double = null,
    initialScrollTop: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref[_] = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: /* params */ AnonColumnIndex => Key = null,
    onItemsRendered: /* props */ GridOnItemsRenderedProps => _ = null,
    onScroll: /* props */ GridOnScrollProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref[_] = null,
    outerTagName: String = null,
    overscanColumnCount: Int | Double = null,
    overscanColumnsCount: Int | Double = null,
    overscanCount: Int | Double = null,
    overscanRowCount: Int | Double = null,
    overscanRowsCount: Int | Double = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactWindow.mod.VariableSizeGrid] = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnWidth = js.Any.fromFunction1(columnWidth), height = height.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowHeight = js.Any.fromFunction1(rowHeight), width = width.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (estimatedColumnWidth != null) __obj.updateDynamic("estimatedColumnWidth")(estimatedColumnWidth.asInstanceOf[js.Any])
    if (estimatedRowHeight != null) __obj.updateDynamic("estimatedRowHeight")(estimatedRowHeight.asInstanceOf[js.Any])
    if (initialScrollLeft != null) __obj.updateDynamic("initialScrollLeft")(initialScrollLeft.asInstanceOf[js.Any])
    if (initialScrollTop != null) __obj.updateDynamic("initialScrollTop")(initialScrollTop.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction1(itemKey))
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (overscanColumnCount != null) __obj.updateDynamic("overscanColumnCount")(overscanColumnCount.asInstanceOf[js.Any])
    if (overscanColumnsCount != null) __obj.updateDynamic("overscanColumnsCount")(overscanColumnsCount.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (overscanRowsCount != null) __obj.updateDynamic("overscanRowsCount")(overscanRowsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = VariableSizeGridProps
}

