package typingsSlinky.atBlueprintjsTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsTable.libEsmCommonCellMod.IFocusedCellCoordinates
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
import typingsSlinky.atBlueprintjsTable.libEsmInteractionsReorderableMod.IDragReorderable
import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragReorderable
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.atBlueprintjsTable.libEsmInteractionsReorderableMod.DragReorderable
    ] {
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    locateClick: MouseEvent => IRegion,
    locateDrag: (MouseEvent, ICoordinateData) => Double,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onSelection: js.Array[IRegion] => Unit,
    toRegion: (Double, js.UndefOr[Double]) => IRegion,
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    selectedRegions: js.Array[IRegion] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.atBlueprintjsTable.libEsmInteractionsReorderableMod.DragReorderable
  ] = {
    val __obj = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction2(locateDrag), onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection), toRegion = js.Any.fromFunction2(toRegion))
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDragReorderable
}

