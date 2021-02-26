package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.handsontableStrings.change
import typingsSlinky.handsontable.handsontableStrings.filter
import typingsSlinky.handsontable.handsontableStrings.insert_col
import typingsSlinky.handsontable.handsontableStrings.insert_row
import typingsSlinky.handsontable.handsontableStrings.remove_col
import typingsSlinky.handsontable.handsontableStrings.remove_row
import typingsSlinky.handsontable.mod.Handsontable.CellChange
import typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.Change
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.InsertRow
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.RemoveRow
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.InsertCol
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.RemoveCol
  - typingsSlinky.handsontable.mod.Handsontable.plugins.UndoRedoAction.Filter
*/
trait UndoRedoAction extends StObject
object UndoRedoAction {
  
  @js.native
  trait Change extends UndoRedoAction {
    
    var actionType: change = js.native
    
    var changes: js.Array[CellChange] = js.native
    
    var selected: js.Array[js.Tuple2[Double, Double]] = js.native
  }
  object Change {
    
    @scala.inline
    def apply(actionType: change, changes: js.Array[CellChange], selected: js.Array[js.Tuple2[Double, Double]]): Change = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    @scala.inline
    implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: change): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChanges(value: js.Array[CellChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesVarargs(value: CellChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
      
      @scala.inline
      def setSelected(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Filter extends UndoRedoAction {
    
    var actionType: filter = js.native
    
    var conditionsStack: js.Array[ColumnConditions] = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(actionType: filter, conditionsStack: js.Array[ColumnConditions]): Filter = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], conditionsStack = conditionsStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: filter): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsStack(value: js.Array[ColumnConditions]): Self = StObject.set(x, "conditionsStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionsStackVarargs(value: ColumnConditions*): Self = StObject.set(x, "conditionsStack", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InsertCol extends UndoRedoAction {
    
    var actionType: insert_col = js.native
    
    var amount: Double = js.native
    
    var index: Double = js.native
  }
  object InsertCol {
    
    @scala.inline
    def apply(actionType: insert_col, amount: Double, index: Double): InsertCol = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertCol]
    }
    
    @scala.inline
    implicit class InsertColMutableBuilder[Self <: InsertCol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: insert_col): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InsertRow extends UndoRedoAction {
    
    var actionType: insert_row = js.native
    
    var amount: Double = js.native
    
    var index: Double = js.native
  }
  object InsertRow {
    
    @scala.inline
    def apply(actionType: insert_row, amount: Double, index: Double): InsertRow = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertRow]
    }
    
    @scala.inline
    implicit class InsertRowMutableBuilder[Self <: InsertRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: insert_row): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveCol extends UndoRedoAction {
    
    var actionType: remove_col = js.native
    
    var amount: Double = js.native
    
    var columnPositions: js.Array[Double] = js.native
    
    var data: js.Array[js.Array[CellValue]] = js.native
    
    var headers: js.Array[String] = js.native
    
    var index: Double = js.native
    
    var indexes: js.Array[Double] = js.native
  }
  object RemoveCol {
    
    @scala.inline
    def apply(
      actionType: remove_col,
      amount: Double,
      columnPositions: js.Array[Double],
      data: js.Array[js.Array[CellValue]],
      headers: js.Array[String],
      index: Double,
      indexes: js.Array[Double]
    ): RemoveCol = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], columnPositions = columnPositions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveCol]
    }
    
    @scala.inline
    implicit class RemoveColMutableBuilder[Self <: RemoveCol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: remove_col): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPositions(value: js.Array[Double]): Self = StObject.set(x, "columnPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnPositionsVarargs(value: Double*): Self = StObject.set(x, "columnPositions", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexes(value: js.Array[Double]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexesVarargs(value: Double*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RemoveRow extends UndoRedoAction {
    
    var actionType: remove_row = js.native
    
    var data: js.Array[js.Array[CellValue]] = js.native
    
    var index: Double = js.native
  }
  object RemoveRow {
    
    @scala.inline
    def apply(actionType: remove_row, data: js.Array[js.Array[CellValue]], index: Double): RemoveRow = {
      val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveRow]
    }
    
    @scala.inline
    implicit class RemoveRowMutableBuilder[Self <: RemoveRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionType(value: remove_row): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[js.Array[CellValue]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Array[CellValue]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
