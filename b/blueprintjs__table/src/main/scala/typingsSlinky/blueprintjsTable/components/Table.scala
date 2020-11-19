package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData
import typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
import typingsSlinky.blueprintjsTable.esmRegionsMod.IStyledRegionGroup
import typingsSlinky.blueprintjsTable.esmRegionsMod.RegionCardinality
import typingsSlinky.blueprintjsTable.esmRegionsMod.TableLoadingOption
import typingsSlinky.blueprintjsTable.gridMod.IColumnIndices
import typingsSlinky.blueprintjsTable.gridMod.IRowIndices
import typingsSlinky.blueprintjsTable.menuContextMod.IMenuContext
import typingsSlinky.blueprintjsTable.renderModeMod.RenderMode
import typingsSlinky.blueprintjsTable.tableMod.ITableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("@blueprintjs/table", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Table] {
    
    @scala.inline
    def bodyContextMenuRenderer(value: /* context */ IMenuContext => ReactElement): this.type = set("bodyContextMenuRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnWidthsVarargs(value: (js.UndefOr[Double | Null])*): this.type = set("columnWidths", js.Array(value :_*))
    
    @scala.inline
    def columnWidths(value: js.Array[js.UndefOr[Double | Null]]): this.type = set("columnWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultColumnWidth(value: Double): this.type = set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRowHeight(value: Double): this.type = set("defaultRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableColumnInteractionBar(value: Boolean): this.type = set("enableColumnInteractionBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableColumnReordering(value: Boolean): this.type = set("enableColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableColumnResizing(value: Boolean): this.type = set("enableColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableFocusedCell(value: Boolean): this.type = set("enableFocusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableGhostCells(value: Boolean): this.type = set("enableGhostCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableMultipleSelection(value: Boolean): this.type = set("enableMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRowHeader(value: Boolean): this.type = set("enableRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRowReordering(value: Boolean): this.type = set("enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableRowResizing(value: Boolean): this.type = set("enableRowResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusedCell(value: IFocusedCellCoordinates): this.type = set("focusedCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRerenderOnSelectionChange(value: Boolean): this.type = set("forceRerenderOnSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getCellClipboardData(value: (/* row */ Double, /* col */ Double) => _): this.type = set("getCellClipboardData", js.Any.fromFunction2(value))
    
    @scala.inline
    def loadingOptionsVarargs(value: TableLoadingOption*): this.type = set("loadingOptions", js.Array(value :_*))
    
    @scala.inline
    def loadingOptions(value: js.Array[TableLoadingOption]): this.type = set("loadingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxColumnWidth(value: Double): this.type = set("maxColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxRowHeight(value: Double): this.type = set("maxRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minColumnWidth(value: Double): this.type = set("minColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minRowHeight(value: Double): this.type = set("minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenColumns(value: Double): this.type = set("numFrozenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numFrozenRows(value: Double): this.type = set("numFrozenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numRows(value: Double): this.type = set("numRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onColumnWidthChanged(value: (/* index */ Double, /* size */ Double) => Unit): this.type = set("onColumnWidthChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def onColumnsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): this.type = set("onColumnsReordered", js.Any.fromFunction3(value))
    
    @scala.inline
    def onCompleteRender(value: () => Unit): this.type = set("onCompleteRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def onCopy(value: /* success */ Boolean => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): this.type = set("onFocusedCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowHeightChanged(value: (/* index */ Double, /* size */ Double) => Unit): this.type = set("onRowHeightChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowsReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): this.type = set("onRowsReordered", js.Any.fromFunction3(value))
    
    @scala.inline
    def onSelection(value: /* selectedRegions */ js.Array[IRegion] => Unit): this.type = set("onSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVisibleCellsChange(value: (/* rowIndices */ IRowIndices, /* columnIndices */ IColumnIndices) => Unit): this.type = set("onVisibleCellsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def renderMode(value: RenderMode): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): this.type = set("rowHeaderCellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowHeightsVarargs(value: (js.UndefOr[Double | Null])*): this.type = set("rowHeights", js.Array(value :_*))
    
    @scala.inline
    def rowHeights(value: js.Array[js.UndefOr[Double | Null]]): this.type = set("rowHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedRegionTransform(
      value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
    ): this.type = set("selectedRegionTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def selectedRegionsVarargs(value: IRegion*): this.type = set("selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def selectedRegions(value: js.Array[IRegion]): this.type = set("selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionModesVarargs(value: RegionCardinality*): this.type = set("selectionModes", js.Array(value :_*))
    
    @scala.inline
    def selectionModes(value: js.Array[RegionCardinality]): this.type = set("selectionModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styledRegionGroupsVarargs(value: IStyledRegionGroup*): this.type = set("styledRegionGroups", js.Array(value :_*))
    
    @scala.inline
    def styledRegionGroups(value: js.Array[IStyledRegionGroup]): this.type = set("styledRegionGroups", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
