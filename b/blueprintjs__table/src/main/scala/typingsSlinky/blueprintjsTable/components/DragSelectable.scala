package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.selectableMod.IDragSelectableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragSelectable {
  
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.DragSelectable] {
    
    @scala.inline
    def disabledFunction1(value: /* event */ MouseEvent => Boolean): this.type = set("disabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ignoredSelectorsVarargs(value: String*): this.type = set("ignoredSelectors", js.Array(value :_*))
    
    @scala.inline
    def ignoredSelectors(value: js.Array[String]): this.type = set("ignoredSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): this.type = set("onSelectionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def selectedRegionsVarargs(value: IRegion*): this.type = set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDragSelectableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    locateClick: MouseEvent => IRegion,
    locateDrag: (MouseEvent, ICoordinateData, js.UndefOr[Boolean]) => IRegion,
    onFocusedCell: IFocusedCellCoordinates => Unit,
    onSelection: js.Array[IRegion] => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(locateClick = js.Any.fromFunction1(locateClick), locateDrag = js.Any.fromFunction3(locateDrag), onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDragSelectableProps]))
  }
}
