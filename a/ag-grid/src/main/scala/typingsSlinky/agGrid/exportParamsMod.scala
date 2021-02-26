package typingsSlinky.agGrid

import typingsSlinky.agGrid.columnApiMod.ColumnApi
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.gridApiMod.GridApi
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportParamsMod {
  
  @js.native
  trait BaseExportParams extends StObject {
    
    var allColumns: js.UndefOr[Boolean] = js.native
    
    var columnGroups: js.UndefOr[Boolean] = js.native
    
    var columnKeys: js.UndefOr[js.Array[String | Column]] = js.native
    
    var fileName: js.UndefOr[String] = js.native
    
    var onlySelected: js.UndefOr[Boolean] = js.native
    
    var onlySelectedAllPages: js.UndefOr[Boolean] = js.native
    
    var processCellCallback: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, String]] = js.native
    
    var processHeaderCallback: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, String]] = js.native
    
    var shouldRowBeSkipped: js.UndefOr[js.Function1[/* params */ ShouldRowBeSkippedParams, Boolean]] = js.native
    
    var skipFooters: js.UndefOr[Boolean] = js.native
    
    var skipGroups: js.UndefOr[Boolean] = js.native
    
    var skipHeader: js.UndefOr[Boolean] = js.native
    
    var skipPinnedBottom: js.UndefOr[Boolean] = js.native
    
    var skipPinnedTop: js.UndefOr[Boolean] = js.native
    
    var suppressQuotes: js.UndefOr[Boolean] = js.native
  }
  object BaseExportParams {
    
    @scala.inline
    def apply(): BaseExportParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseExportParams]
    }
    
    @scala.inline
    implicit class BaseExportParamsMutableBuilder[Self <: BaseExportParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllColumns(value: Boolean): Self = StObject.set(x, "allColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllColumnsUndefined: Self = StObject.set(x, "allColumns", js.undefined)
      
      @scala.inline
      def setColumnGroups(value: Boolean): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
      
      @scala.inline
      def setColumnKeys(value: js.Array[String | Column]): Self = StObject.set(x, "columnKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeysUndefined: Self = StObject.set(x, "columnKeys", js.undefined)
      
      @scala.inline
      def setColumnKeysVarargs(value: (String | Column)*): Self = StObject.set(x, "columnKeys", js.Array(value :_*))
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setOnlySelected(value: Boolean): Self = StObject.set(x, "onlySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlySelectedAllPages(value: Boolean): Self = StObject.set(x, "onlySelectedAllPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlySelectedAllPagesUndefined: Self = StObject.set(x, "onlySelectedAllPages", js.undefined)
      
      @scala.inline
      def setOnlySelectedUndefined: Self = StObject.set(x, "onlySelected", js.undefined)
      
      @scala.inline
      def setProcessCellCallback(value: /* params */ ProcessCellForExportParams => String): Self = StObject.set(x, "processCellCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessCellCallbackUndefined: Self = StObject.set(x, "processCellCallback", js.undefined)
      
      @scala.inline
      def setProcessHeaderCallback(value: /* params */ ProcessHeaderForExportParams => String): Self = StObject.set(x, "processHeaderCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessHeaderCallbackUndefined: Self = StObject.set(x, "processHeaderCallback", js.undefined)
      
      @scala.inline
      def setShouldRowBeSkipped(value: /* params */ ShouldRowBeSkippedParams => Boolean): Self = StObject.set(x, "shouldRowBeSkipped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRowBeSkippedUndefined: Self = StObject.set(x, "shouldRowBeSkipped", js.undefined)
      
      @scala.inline
      def setSkipFooters(value: Boolean): Self = StObject.set(x, "skipFooters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFootersUndefined: Self = StObject.set(x, "skipFooters", js.undefined)
      
      @scala.inline
      def setSkipGroups(value: Boolean): Self = StObject.set(x, "skipGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipGroupsUndefined: Self = StObject.set(x, "skipGroups", js.undefined)
      
      @scala.inline
      def setSkipHeader(value: Boolean): Self = StObject.set(x, "skipHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHeaderUndefined: Self = StObject.set(x, "skipHeader", js.undefined)
      
      @scala.inline
      def setSkipPinnedBottom(value: Boolean): Self = StObject.set(x, "skipPinnedBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPinnedBottomUndefined: Self = StObject.set(x, "skipPinnedBottom", js.undefined)
      
      @scala.inline
      def setSkipPinnedTop(value: Boolean): Self = StObject.set(x, "skipPinnedTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPinnedTopUndefined: Self = StObject.set(x, "skipPinnedTop", js.undefined)
      
      @scala.inline
      def setSuppressQuotes(value: Boolean): Self = StObject.set(x, "suppressQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressQuotesUndefined: Self = StObject.set(x, "suppressQuotes", js.undefined)
    }
  }
  
  @js.native
  trait CsvExportParams extends ExportParams[String] {
    
    var columnSeparator: js.UndefOr[String] = js.native
  }
  object CsvExportParams {
    
    @scala.inline
    def apply(): CsvExportParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsvExportParams]
    }
    
    @scala.inline
    implicit class CsvExportParamsMutableBuilder[Self <: CsvExportParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnSeparator(value: String): Self = StObject.set(x, "columnSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnSeparatorUndefined: Self = StObject.set(x, "columnSeparator", js.undefined)
    }
  }
  
  @js.native
  trait ExportParams[T] extends BaseExportParams {
    
    var customFooter: js.UndefOr[T] = js.native
    
    var customHeader: js.UndefOr[T] = js.native
  }
  object ExportParams {
    
    @scala.inline
    def apply[T](): ExportParams[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportParams[T]]
    }
    
    @scala.inline
    implicit class ExportParamsMutableBuilder[Self <: ExportParams[_], T] (val x: Self with ExportParams[T]) extends AnyVal {
      
      @scala.inline
      def setCustomFooter(value: T): Self = StObject.set(x, "customFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFooterUndefined: Self = StObject.set(x, "customFooter", js.undefined)
      
      @scala.inline
      def setCustomHeader(value: T): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
    }
  }
  
  @js.native
  trait ProcessCellForExportParams extends StObject {
    
    var api: GridApi = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var node: RowNode = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  object ProcessCellForExportParams {
    
    @scala.inline
    def apply(
      api: GridApi,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      node: RowNode,
      `type`: String,
      value: js.Any
    ): ProcessCellForExportParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessCellForExportParams]
    }
    
    @scala.inline
    implicit class ProcessCellForExportParamsMutableBuilder[Self <: ProcessCellForExportParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessHeaderForExportParams extends StObject {
    
    var api: GridApi = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
  }
  object ProcessHeaderForExportParams {
    
    @scala.inline
    def apply(api: GridApi, column: Column, columnApi: ColumnApi, context: js.Any): ProcessHeaderForExportParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessHeaderForExportParams]
    }
    
    @scala.inline
    implicit class ProcessHeaderForExportParamsMutableBuilder[Self <: ProcessHeaderForExportParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShouldRowBeSkippedParams extends StObject {
    
    var api: GridApi = js.native
    
    var context: js.Any = js.native
    
    var node: RowNode = js.native
  }
  object ShouldRowBeSkippedParams {
    
    @scala.inline
    def apply(api: GridApi, context: js.Any, node: RowNode): ShouldRowBeSkippedParams = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShouldRowBeSkippedParams]
    }
    
    @scala.inline
    implicit class ShouldRowBeSkippedParamsMutableBuilder[Self <: ShouldRowBeSkippedParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
