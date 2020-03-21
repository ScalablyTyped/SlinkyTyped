package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.AnonClientHeight
import typingsSlinky.reactVirtualized.AnonStartIndex
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryCellProps
import typingsSlinky.reactVirtualized.esMasonryMod.MasonryProps
import typingsSlinky.reactVirtualized.esMasonryMod.Positioner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Masonry
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.Masonry] {
  @JSImport("react-virtualized", "Masonry")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style, tabIndex */
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: /* props */ MasonryCellProps => TagMod[Any],
    height: Double,
    width: Double,
    keyMapper: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any = null,
    onCellsRendered: /* params */ AnonStartIndex => Unit = null,
    onScroll: /* params */ AnonClientHeight => Unit = null,
    overscanByPixels: Int | Double = null,
    role: String = null,
    scrollingResetTimeInterval: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Masonry] = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], cellCount = cellCount.asInstanceOf[js.Any], cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], cellPositioner = cellPositioner.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(js.Any.fromFunction2(keyMapper))
    if (onCellsRendered != null) __obj.updateDynamic("onCellsRendered")(js.Any.fromFunction1(onCellsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (overscanByPixels != null) __obj.updateDynamic("overscanByPixels")(overscanByPixels.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MasonryProps
}

