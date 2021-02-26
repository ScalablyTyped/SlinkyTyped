package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick client events.
  */
@js.native
trait ASPxClientClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a column field name.
    */
  var ColumnFieldName: String = js.native
  
  /**
    * Gets the index of a column that owns the processed cell.
    */
  var ColumnIndex: Double = js.native
  
  /**
    * Gets a column field value.
    */
  var ColumnValue: js.Any = js.native
  
  /**
    * Gets a column value type.
    */
  var ColumnValueType: String = js.native
  
  /**
    * Gets the index of the data field which corresponds to the clicked summary value.
    */
  var DataIndex: Double = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientPivotGrid.CellClick and ASPxClientPivotGrid.CellDblClick events.
    */
  var HtmlEvent: js.Any = js.native
  
  /**
    * Gets a row field name.
    */
  var RowFieldName: String = js.native
  
  /**
    * Gets the index of a row that owns the processed cell.
    */
  var RowIndex: Double = js.native
  
  /**
    * Gets a row field value.
    */
  var RowValue: js.Any = js.native
  
  /**
    * Gets a row value type.
    */
  var RowValueType: String = js.native
  
  /**
    * Gets the processed cell's value.
    */
  var Value: js.Any = js.native
}
object ASPxClientClickEventArgs {
  
  @scala.inline
  def apply(
    ColumnFieldName: String,
    ColumnIndex: Double,
    ColumnValue: js.Any,
    ColumnValueType: String,
    DataIndex: Double,
    HtmlEvent: js.Any,
    RowFieldName: String,
    RowIndex: Double,
    RowValue: js.Any,
    RowValueType: String,
    Value: js.Any
  ): ASPxClientClickEventArgs = {
    val __obj = js.Dynamic.literal(ColumnFieldName = ColumnFieldName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], ColumnValue = ColumnValue.asInstanceOf[js.Any], ColumnValueType = ColumnValueType.asInstanceOf[js.Any], DataIndex = DataIndex.asInstanceOf[js.Any], HtmlEvent = HtmlEvent.asInstanceOf[js.Any], RowFieldName = RowFieldName.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any], RowValue = RowValue.asInstanceOf[js.Any], RowValueType = RowValueType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientClickEventArgsMutableBuilder[Self <: ASPxClientClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFieldName(value: String): Self = StObject.set(x, "ColumnFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnValue(value: js.Any): Self = StObject.set(x, "ColumnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnValueType(value: String): Self = StObject.set(x, "ColumnValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "DataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "HtmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldName(value: String): Self = StObject.set(x, "RowFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValue(value: js.Any): Self = StObject.set(x, "RowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowValueType(value: String): Self = StObject.set(x, "RowValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
