package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexExcel.activexExcelNumbers.`0`
import typingsSlinky.activexExcel.activexExcelNumbers.`1`
import typingsSlinky.activexExcel.activexExcelNumbers.`2`
import typingsSlinky.activexExcel.activexExcelNumbers.`3`
import typingsSlinky.activexExcel.activexExcelNumbers.`4`
import typingsSlinky.activexExcel.activexExcelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionValue extends js.Object {
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.ConditionValue_typekey")
  var ExcelDotConditionValue_typekey: ConditionValue = js.native
  
  def Modify(newtype: XlConditionValueTypes): Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: js.Any): Unit = js.native
  @JSName("Modify")
  def Modify_0(newtype: `0`, newvalue: Double): Unit = js.native
  @JSName("Modify")
  def Modify_1(newtype: `1`): Unit = js.native
  @JSName("Modify")
  def Modify_2(newtype: `2`): Unit = js.native
  @JSName("Modify")
  def Modify_3(newtype: `3`, newvalue: Double): Unit = js.native
  @JSName("Modify")
  def Modify_4(newtype: `4`, newvalue: String): Unit = js.native
  @JSName("Modify")
  def Modify_5(newtype: `5`, newvalue: Double): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Type: XlConditionValueTypes = js.native
  
  var Value: Double | String = js.native
}
