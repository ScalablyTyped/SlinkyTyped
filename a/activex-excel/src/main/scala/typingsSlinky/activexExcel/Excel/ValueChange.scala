package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChange extends js.Object {
  val AllocationMethod: XlAllocationMethod = js.native
  val AllocationValue: XlAllocationValue = js.native
  val AllocationWeightExpression: String = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.ValueChange_typekey")
  var ExcelDotValueChange_typekey: ValueChange = js.native
  val Order: Double = js.native
  val Parent: js.Any = js.native
  val PivotCell: typingsSlinky.activexExcel.Excel.PivotCell = js.native
  val Tuple: String = js.native
  val Value: Double = js.native
  val VisibleInPivotTable: Boolean = js.native
  def Delete(): Unit = js.native
}

object ValueChange {
  @scala.inline
  def apply(
    AllocationMethod: XlAllocationMethod,
    AllocationValue: XlAllocationValue,
    AllocationWeightExpression: String,
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotValueChange_typekey: ValueChange,
    Order: Double,
    Parent: js.Any,
    PivotCell: PivotCell,
    Tuple: String,
    Value: Double,
    VisibleInPivotTable: Boolean
  ): ValueChange = {
    val __obj = js.Dynamic.literal(AllocationMethod = AllocationMethod.asInstanceOf[js.Any], AllocationValue = AllocationValue.asInstanceOf[js.Any], AllocationWeightExpression = AllocationWeightExpression.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotCell = PivotCell.asInstanceOf[js.Any], Tuple = Tuple.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VisibleInPivotTable = VisibleInPivotTable.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ValueChange_typekey")(ExcelDotValueChange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChange]
  }
  @scala.inline
  implicit class ValueChangeOps[Self <: ValueChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationMethod(value: XlAllocationMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationValue(value: XlAllocationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocationWeightExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationWeightExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcelDotValueChange_typekey(value: ValueChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.ValueChange_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPivotCell(value: PivotCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PivotCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTuple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tuple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleInPivotTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleInPivotTable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

