package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.tableQuadrantMod.ITableQuadrantProps
import typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableQuadrant {
  
  @scala.inline
  def apply(
    bodyRenderer: (js.UndefOr[QuadrantType], js.UndefOr[Boolean], js.UndefOr[Boolean]) => ReactElement,
    grid: Grid
  ): Builder = {
    val __props = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), grid = grid.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableQuadrantProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableQuadrantMod.TableQuadrant] {
    
    @scala.inline
    def bodyRef(value: /* ref */ HTMLElement | Null => _): this.type = set("bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnHeaderCellRenderer(value: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => ReactElement): this.type = set("columnHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menuRenderer(value: () => ReactElement): this.type = set("menuRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def quadrantRef(value: /* ref */ HTMLElement | Null => _): this.type = set("quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def quadrantType(value: QuadrantType): this.type = set("quadrantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowHeaderCellRenderer(value: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => ReactElement): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollContainerRef(value: /* ref */ HTMLElement | Null => _): this.type = set("scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableQuadrantProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
