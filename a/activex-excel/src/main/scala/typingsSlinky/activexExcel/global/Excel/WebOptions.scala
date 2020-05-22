package typingsSlinky.activexExcel.global.Excel

import typingsSlinky.activexExcel.Excel.XlCreator
import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WebOptions")
@js.native
class WebOptions protected ()
  extends typingsSlinky.activexExcel.Excel.WebOptions {
  /* CompleteClass */
  override var AllowPNG: Boolean = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var DownloadComponents: Boolean = js.native
  /* CompleteClass */
  override var Encoding: MsoEncoding = js.native
  /* CompleteClass */
  @JSName("Excel.WebOptions_typekey")
  override var ExcelDotWebOptions_typekey: typingsSlinky.activexExcel.Excel.WebOptions = js.native
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  /* CompleteClass */
  override var LocationOfComponents: String = js.native
  /* CompleteClass */
  override var OrganizeInFolder: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PixelsPerInch: Double = js.native
  /* CompleteClass */
  override var RelyOnCSS: Boolean = js.native
  /* CompleteClass */
  override var RelyOnVML: Boolean = js.native
  /* CompleteClass */
  override var ScreenSize: MsoScreenSize = js.native
  /* CompleteClass */
  override var TargetBrowser: MsoTargetBrowser = js.native
  /* CompleteClass */
  override var UseLongFileNames: Boolean = js.native
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
}

