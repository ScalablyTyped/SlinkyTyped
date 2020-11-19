package typingsSlinky.blueprintjsTable.anon

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
@js.native
trait PartialITableQuadrantProp extends js.Object {
  
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ js.UndefOr[QuadrantType], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      ReactElement
    ]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
  
  var enableRowHeader: js.UndefOr[Boolean] = js.native
  
  var grid: js.UndefOr[Grid] = js.native
  
  var menuRenderer: js.UndefOr[js.Function0[ReactElement]] = js.native
  
  var onScroll: js.UndefOr[EventHandler[SyntheticUIEvent[HTMLDivElement]]] = js.native
  
  var onWheel: js.UndefOr[EventHandler[SyntheticWheelEvent[HTMLDivElement]]] = js.native
  
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var quadrantType: js.UndefOr[QuadrantType] = js.native
  
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], ReactElement]] = js.native
  
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialITableQuadrantProp {
  
  @scala.inline
  def apply(): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
  
  @scala.inline
  implicit class PartialITableQuadrantPropOps[Self <: PartialITableQuadrantProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBodyRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBodyRef: Self = this.set("bodyRef", js.undefined)
    
    @scala.inline
    def setBodyRenderer(
      value: (/* quadrantType */ js.UndefOr[QuadrantType], /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): Self = this.set("bodyRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBodyRenderer: Self = this.set("bodyRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => ReactElement): Self = this.set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHeaderCellRenderer: Self = this.set("columnHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setEnableRowHeader(value: Boolean): Self = this.set("enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowHeader: Self = this.set("enableRowHeader", js.undefined)
    
    @scala.inline
    def setGrid(value: Grid): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setMenuRenderer(value: () => ReactElement): Self = this.set("menuRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMenuRenderer: Self = this.set("menuRenderer", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setQuadrantRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQuadrantRef: Self = this.set("quadrantRef", js.undefined)
    
    @scala.inline
    def setQuadrantType(value: QuadrantType): Self = this.set("quadrantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuadrantType: Self = this.set("quadrantType", js.undefined)
    
    @scala.inline
    def setRowHeaderCellRenderer(value: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => ReactElement): Self = this.set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowHeaderCellRenderer: Self = this.set("rowHeaderCellRenderer", js.undefined)
    
    @scala.inline
    def setScrollContainerRef(value: /* ref */ HTMLElement | Null => _): Self = this.set("scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollContainerRef: Self = this.set("scrollContainerRef", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
