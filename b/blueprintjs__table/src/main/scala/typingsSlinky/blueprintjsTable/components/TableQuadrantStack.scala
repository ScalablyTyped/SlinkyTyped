package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsSlinky.blueprintjsTable.gridMod.Grid
import typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType
import typingsSlinky.blueprintjsTable.tableQuadrantStackMod.ITableQuadrantStackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableQuadrantStack {
  
  @scala.inline
  def apply(bodyRenderer: (QuadrantType, js.UndefOr[Boolean], js.UndefOr[Boolean]) => ReactElement, grid: Grid): Builder = {
    val __props = js.Dynamic.literal(bodyRenderer = js.Any.fromFunction3(bodyRenderer), grid = grid.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITableQuadrantStackProps]))
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStack", "TableQuadrantStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.tableQuadrantStackMod.TableQuadrantStack] {
    
    @scala.inline
    def bodyRef(value: /* ref */ HTMLElement | Null => _): this.type = set("bodyRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): this.type = set("columnHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def columnHeaderRef(value: /* ref */ HTMLElement | Null => Unit): this.type = set("columnHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def enableColumnInteractionBar(value: Boolean): this.type = set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleColumnResizeGuide(value: /* verticalGuides */ js.Array[Double] => Unit): this.type = set("handleColumnResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleColumnsReordering(value: /* verticalGuides */ js.Array[Double] => Unit): this.type = set("handleColumnsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRowResizeGuide(value: /* horizontalGuides */ js.Array[Double] => Unit): this.type = set("handleRowResizeGuide", js.Any.fromFunction1(value))
    
    @scala.inline
    def handleRowsReordering(value: /* horizontalGuides */ js.Array[Double] => Unit): this.type = set("handleRowsReordering", js.Any.fromFunction1(value))
    
    @scala.inline
    def isHorizontalScrollDisabled(value: Boolean): this.type = set("isHorizontalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isVerticalScrollDisabled(value: Boolean): this.type = set("isVerticalScrollDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingOptions(value: js.Array[TableLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadingOptionsVarargs(value: TableLoadingOption*): this.type = set("loadingOptions", js.Array(value :_*))
    
    @scala.inline
    def menuRenderer(value: /* refHandler */ js.Function1[/* ref */ HTMLElement, Unit] => ReactElement): this.type = set("menuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def numColumns(value: Double): this.type = set("numColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numRows(value: Double): this.type = set("numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScroll(value: SyntheticEvent[Event, HTMLElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def quadrantRef(value: /* ref */ HTMLElement | Null => Unit): this.type = set("quadrantRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowHeaderCellRenderer(
      value: (/* refHandler */ js.Function1[/* ref */ HTMLElement, Unit], /* resizeHandler */ js.Function1[/* verticalGuides */ js.Array[Double], Unit], /* reorderingHandler */ js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit], /* showFrozenRowsOnly */ js.UndefOr[Boolean]) => ReactElement
    ): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction4(value))
    
    @scala.inline
    def rowHeaderRef(value: /* ref */ HTMLElement | Null => _): this.type = set("rowHeaderRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollContainerRef(value: /* ref */ HTMLElement | Null => _): this.type = set("scrollContainerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def throttleScrolling(value: Boolean): this.type = set("throttleScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewSyncDelay(value: Double): this.type = set("viewSyncDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableQuadrantStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
