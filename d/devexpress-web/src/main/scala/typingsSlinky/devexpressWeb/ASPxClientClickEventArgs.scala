package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientClickEventArgsOps[Self <: ASPxClientClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HtmlEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

