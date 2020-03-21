package typingsSlinky.reactVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import typingsSlinky.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CellMeasurer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVirtualized.mod.CellMeasurer] {
  @JSImport("react-virtualized", "CellMeasurer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    cache: CellMeasurerCacheInterface,
    parent: MeasuredCellParent,
    columnIndex: Int | Double = null,
    index: Int | Double = null,
    rowIndex: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.CellMeasurer] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CellMeasurerProps
}

