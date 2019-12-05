package typingsSlinky.reactDashVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionCellGroupRendererParams
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionCellRendererParams
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionCellSizeAndPosition
import typingsSlinky.reactDashVirtualized.distEsCollectionMod.CollectionProps
import typingsSlinky.reactDashVirtualized.distEsGridMod.SectionRenderedParams
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.Alignment
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collection
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsCollectionMod.Collection] {
  @JSImport("react-virtualized/dist/es/Collection", "Collection")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, onScroll */
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => TagMod[Any],
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    height: Double,
    width: Double,
    `aria-label`: String = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]] = null,
    horizontalOverscanSize: Int | Double = null,
    noContentRenderer: () => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToCell: Int | Double = null,
    scrollTop: Int | Double = null,
    sectionSize: Int | Double = null,
    style: CSSProperties = null,
    verticalOverscanSize: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashVirtualized.distEsCollectionMod.Collection] = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1(cellGroupRenderer))
    if (horizontalOverscanSize != null) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToCell != null) __obj.updateDynamic("scrollToCell")(scrollToCell.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalOverscanSize != null) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollectionProps
}

