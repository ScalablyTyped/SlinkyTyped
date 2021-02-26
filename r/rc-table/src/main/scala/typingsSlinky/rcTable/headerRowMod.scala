package typingsSlinky.rcTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.interfaceMod.CellType
import typingsSlinky.rcTable.interfaceMod.ColumnType
import typingsSlinky.rcTable.interfaceMod.CustomizeComponent
import typingsSlinky.rcTable.interfaceMod.GetComponentProps
import typingsSlinky.rcTable.interfaceMod.StickyOffsets
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerRowMod {
  
  object default {
    
    @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
    @js.native
    def apply[RecordType](hasCellsStickyOffsetsFlattenColumnsRowComponentCellComponentOnHeaderRowIndex: RowProps[RecordType]): ReactElement = js.native
    @JSImport("rc-table/lib/Header/HeaderRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Header/HeaderRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RowProps[RecordType] extends StObject {
    
    var cellComponent: CustomizeComponent = js.native
    
    var cells: js.Array[CellType[RecordType]] = js.native
    
    var flattenColumns: js.Array[ColumnType[RecordType]] = js.native
    
    var index: Double = js.native
    
    var onHeaderRow: GetComponentProps[js.Array[ColumnType[RecordType]]] = js.native
    
    var rowComponent: CustomizeComponent = js.native
    
    var stickyOffsets: StickyOffsets = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply[RecordType](
      cellComponent: CustomizeComponent,
      cells: js.Array[CellType[RecordType]],
      flattenColumns: js.Array[ColumnType[RecordType]],
      index: Double,
      onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
      rowComponent: CustomizeComponent,
      stickyOffsets: StickyOffsets
    ): RowProps[RecordType] = {
      val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onHeaderRow = js.Any.fromFunction2(onHeaderRow), rowComponent = rowComponent.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowProps[RecordType]]
    }
    
    @scala.inline
    implicit class RowPropsMutableBuilder[Self <: RowProps[_], RecordType] (val x: Self with RowProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setCellComponent(value: CustomizeComponent): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "cellComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCells(value: js.Array[CellType[RecordType]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellsVarargs(value: CellType[RecordType]*): Self = StObject.set(x, "cells", js.Array(value :_*))
      
      @scala.inline
      def setFlattenColumns(value: js.Array[ColumnType[RecordType]]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenColumnsVarargs(value: ColumnType[RecordType]*): Self = StObject.set(x, "flattenColumns", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowComponent(value: CustomizeComponent): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponentComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "rowComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    }
  }
}
