package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.reorderableMod.IDragReorderable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragReorderable {
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.reorderableMod.DragReorderable] {
    @scala.inline
    def disabledFunction1(value: /* event */ MouseEvent => Boolean): this.type = set("disabled", js.Any.fromFunction1(value))
    @scala.inline
    def disabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedRegionsVarargs(value: IRegion*): this.type = set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDragReorderable): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    locateClick: MouseEvent => IRegion,
    locateDrag: (MouseEvent, ICoordinateData) => Double,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onReordered: (Double, Double, Double) => Unit,
    onReordering: (Double, Double, Double) => Unit,
    onSelection: js.Array[IRegion] => Unit,
    toRegion: (Double, js.UndefOr[Double]) => IRegion
  ): Builder = {
    val __props = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction2(locateDrag), onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection), toRegion = js.Any.fromFunction2(toRegion))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDragReorderable]))
  }
}

