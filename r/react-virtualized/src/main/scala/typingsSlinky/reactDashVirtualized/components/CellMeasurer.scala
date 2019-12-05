package typingsSlinky.reactDashVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCacheInterface
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerProps
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CellMeasurer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurer] {
  @JSImport("react-virtualized/dist/es/CellMeasurer", "CellMeasurer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    cache: CellMeasurerCacheInterface,
    parent: MeasuredCellParent,
    columnIndex: Int | Double = null,
    index: Int | Double = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurer] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CellMeasurerProps
}

