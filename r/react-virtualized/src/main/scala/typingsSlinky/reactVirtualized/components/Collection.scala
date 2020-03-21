package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellRendererParams
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionProps
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collection
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.Collection] {
  @JSImport("react-virtualized", "Collection")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
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
    noContentRenderer: () => ReactElement = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToCell: Int | Double = null,
    scrollTop: Int | Double = null,
    sectionSize: Int | Double = null,
    verticalOverscanSize: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Collection] = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1(cellGroupRenderer))
    if (horizontalOverscanSize != null) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToCell != null) __obj.updateDynamic("scrollToCell")(scrollToCell.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (verticalOverscanSize != null) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollectionProps
}

