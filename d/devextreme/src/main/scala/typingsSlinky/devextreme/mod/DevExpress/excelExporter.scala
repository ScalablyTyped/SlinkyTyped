package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.anon.ExcelCell
import typingsSlinky.devextreme.anon.NameValue
import typingsSlinky.devextreme.anon.PivotCell
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excelExporter {
  
  @js.native
  trait CellAddress extends StObject {
    
    /**
      * [descr:CellAddress.column]
      */
    var column: js.UndefOr[Double] = js.native
    
    /**
      * [descr:CellAddress.row]
      */
    var row: js.UndefOr[Double] = js.native
  }
  object CellAddress {
    
    @scala.inline
    def apply(): CellAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellAddress]
    }
    
    @scala.inline
    implicit class CellAddressMutableBuilder[Self <: CellAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  @js.native
  trait CellRange extends StObject {
    
    /**
      * [descr:CellRange.from]
      */
    var from: js.UndefOr[CellAddress] = js.native
    
    /**
      * [descr:CellRange.to]
      */
    var to: js.UndefOr[CellAddress] = js.native
  }
  object CellRange {
    
    @scala.inline
    def apply(): CellRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellRange]
    }
    
    @scala.inline
    implicit class CellRangeMutableBuilder[Self <: CellRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: CellAddress): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: CellAddress): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait ExcelDataGridCell extends StObject {
    
    /**
      * [descr:ExcelDataGridCell.column]
      */
    var column: js.UndefOr[dxDataGridColumn] = js.native
    
    /**
      * [descr:ExcelDataGridCell.data]
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * [descr:ExcelDataGridCell.groupIndex]
      */
    var groupIndex: js.UndefOr[Double] = js.native
    
    /**
      * [descr:ExcelDataGridCell.groupSummaryItems]
      */
    var groupSummaryItems: js.UndefOr[js.Array[NameValue]] = js.native
    
    /**
      * [descr:ExcelDataGridCell.rowType]
      */
    var rowType: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExcelDataGridCell.totalSummaryItemName]
      */
    var totalSummaryItemName: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExcelDataGridCell.value]
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object ExcelDataGridCell {
    
    @scala.inline
    def apply(): ExcelDataGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelDataGridCell]
    }
    
    @scala.inline
    implicit class ExcelDataGridCellMutableBuilder[Self <: ExcelDataGridCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: dxDataGridColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      @scala.inline
      def setGroupSummaryItems(value: js.Array[NameValue]): Self = StObject.set(x, "groupSummaryItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSummaryItemsUndefined: Self = StObject.set(x, "groupSummaryItems", js.undefined)
      
      @scala.inline
      def setGroupSummaryItemsVarargs(value: NameValue*): Self = StObject.set(x, "groupSummaryItems", js.Array(value :_*))
      
      @scala.inline
      def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      @scala.inline
      def setTotalSummaryItemName(value: String): Self = StObject.set(x, "totalSummaryItemName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSummaryItemNameUndefined: Self = StObject.set(x, "totalSummaryItemName", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ExcelExportBaseProps extends StObject {
    
    /**
      * [descr:ExcelExportBaseProps.keepColumnWidths]
      */
    var keepColumnWidths: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExcelExportBaseProps.loadPanel]
      */
    var loadPanel: js.UndefOr[ExportLoadPanel] = js.native
    
    /**
      * [descr:ExcelExportBaseProps.topLeftCell]
      */
    var topLeftCell: js.UndefOr[CellAddress | String] = js.native
    
    /**
      * [descr:ExcelExportBaseProps.worksheet]
      */
    var worksheet: js.UndefOr[js.Any] = js.native
  }
  object ExcelExportBaseProps {
    
    @scala.inline
    def apply(): ExcelExportBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportBaseProps]
    }
    
    @scala.inline
    implicit class ExcelExportBasePropsMutableBuilder[Self <: ExcelExportBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepColumnWidths(value: Boolean): Self = StObject.set(x, "keepColumnWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepColumnWidthsUndefined: Self = StObject.set(x, "keepColumnWidths", js.undefined)
      
      @scala.inline
      def setLoadPanel(value: ExportLoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      @scala.inline
      def setTopLeftCell(value: CellAddress | String): Self = StObject.set(x, "topLeftCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftCellUndefined: Self = StObject.set(x, "topLeftCell", js.undefined)
      
      @scala.inline
      def setWorksheet(value: js.Any): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
    }
  }
  
  @js.native
  trait ExcelExportDataGridProps extends ExcelExportBaseProps {
    
    /**
      * [descr:ExcelExportDataGridProps.autoFilterEnabled]
      */
    var autoFilterEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExcelExportDataGridProps.component]
      */
    var component: js.UndefOr[dxDataGrid] = js.native
    
    /**
      * [descr:ExcelExportDataGridProps.customizeCell]
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ ExcelCell, _]] = js.native
    
    /**
      * [descr:ExcelExportDataGridProps.selectedRowsOnly]
      */
    var selectedRowsOnly: js.UndefOr[Boolean] = js.native
  }
  object ExcelExportDataGridProps {
    
    @scala.inline
    def apply(): ExcelExportDataGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportDataGridProps]
    }
    
    @scala.inline
    implicit class ExcelExportDataGridPropsMutableBuilder[Self <: ExcelExportDataGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFilterEnabled(value: Boolean): Self = StObject.set(x, "autoFilterEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFilterEnabledUndefined: Self = StObject.set(x, "autoFilterEnabled", js.undefined)
      
      @scala.inline
      def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setCustomizeCell(value: /* options */ ExcelCell => _): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
      
      @scala.inline
      def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowsOnlyUndefined: Self = StObject.set(x, "selectedRowsOnly", js.undefined)
    }
  }
  
  @js.native
  trait ExcelExportPivotGridProps extends ExcelExportBaseProps {
    
    /**
      * [descr:ExcelExportPivotGridProps.component]
      */
    var component: js.UndefOr[dxPivotGrid] = js.native
    
    /**
      * [descr:ExcelExportPivotGridProps.customizeCell]
      */
    var customizeCell: js.UndefOr[js.Function1[/* options */ PivotCell, _]] = js.native
  }
  object ExcelExportPivotGridProps {
    
    @scala.inline
    def apply(): ExcelExportPivotGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelExportPivotGridProps]
    }
    
    @scala.inline
    implicit class ExcelExportPivotGridPropsMutableBuilder[Self <: ExcelExportPivotGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setCustomizeCell(value: /* options */ PivotCell => _): Self = StObject.set(x, "customizeCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomizeCellUndefined: Self = StObject.set(x, "customizeCell", js.undefined)
    }
  }
  
  @js.native
  trait ExcelPivotGridCell extends dxPivotGridPivotGridCell {
    
    /**
      * [descr:ExcelPivotGridCell.area]
      */
    var area: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExcelPivotGridCell.columnIndex]
      */
    var columnIndex: js.UndefOr[Double] = js.native
    
    /**
      * [descr:ExcelPivotGridCell.rowIndex]
      */
    var rowIndex: js.UndefOr[Double] = js.native
  }
  object ExcelPivotGridCell {
    
    @scala.inline
    def apply(): ExcelPivotGridCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelPivotGridCell]
    }
    
    @scala.inline
    implicit class ExcelPivotGridCellMutableBuilder[Self <: ExcelPivotGridCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  @js.native
  trait ExportLoadPanel extends StObject {
    
    /**
      * [descr:ExportLoadPanel.enabled]
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExportLoadPanel.height]
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * [descr:ExportLoadPanel.indicatorSrc]
      */
    var indicatorSrc: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExportLoadPanel.shading]
      */
    var shading: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExportLoadPanel.shadingColor]
      */
    var shadingColor: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExportLoadPanel.showIndicator]
      */
    var showIndicator: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExportLoadPanel.showPane]
      */
    var showPane: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExportLoadPanel.text]
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExportLoadPanel.width]
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ExportLoadPanel {
    
    @scala.inline
    def apply(): ExportLoadPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportLoadPanel]
    }
    
    @scala.inline
    implicit class ExportLoadPanelMutableBuilder[Self <: ExportLoadPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
      
      @scala.inline
      def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
      
      @scala.inline
      def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
      
      @scala.inline
      def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
      
      @scala.inline
      def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
