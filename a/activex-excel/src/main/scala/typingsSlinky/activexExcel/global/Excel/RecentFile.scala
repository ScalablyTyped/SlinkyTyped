package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.RecentFile")
@js.native
class RecentFile protected ()
  extends typingsSlinky.activexExcel.Excel.RecentFile {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.RecentFile_typekey")
  override var ExcelDotRecentFile_typekey: typingsSlinky.activexExcel.Excel.RecentFile = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Path: String = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): typingsSlinky.activexExcel.Excel.Workbook = js.native
}

