package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexExcel.Excel.XlXmlImportResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.XmlDataBinding")
@js.native
class XmlDataBinding protected ()
  extends typingsSlinky.activexExcel.Excel.XmlDataBinding {
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  @JSName("Excel.XmlDataBinding_typekey")
  override var ExcelDotXmlDataBinding_typekey: typingsSlinky.activexExcel.Excel.XmlDataBinding = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SourceUrl: String = js.native
  /* CompleteClass */
  override val _Default: String = js.native
  /* CompleteClass */
  override def ClearSettings(): Unit = js.native
  /* CompleteClass */
  override def LoadSettings(Url: String): Unit = js.native
  /* CompleteClass */
  override def Refresh(): XlXmlImportResult = js.native
}

