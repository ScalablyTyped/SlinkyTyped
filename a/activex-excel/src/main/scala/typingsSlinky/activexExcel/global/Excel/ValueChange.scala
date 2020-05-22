package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlAllocationMethod
import typingsSlinky.activexExcel.Excel.XlAllocationValue
import typingsSlinky.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.ValueChange")
@js.native
class ValueChange protected ()
  extends typingsSlinky.activexExcel.Excel.ValueChange {
  /* CompleteClass */
  override val AllocationMethod: XlAllocationMethod = js.native
  /* CompleteClass */
  override val AllocationValue: XlAllocationValue = js.native
  /* CompleteClass */
  override val AllocationWeightExpression: String = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.ValueChange_typekey")
  override var ExcelDotValueChange_typekey: typingsSlinky.activexExcel.Excel.ValueChange = js.native
  /* CompleteClass */
  override val Order: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PivotCell: typingsSlinky.activexExcel.Excel.PivotCell = js.native
  /* CompleteClass */
  override val Tuple: String = js.native
  /* CompleteClass */
  override val Value: Double = js.native
  /* CompleteClass */
  override val VisibleInPivotTable: Boolean = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

