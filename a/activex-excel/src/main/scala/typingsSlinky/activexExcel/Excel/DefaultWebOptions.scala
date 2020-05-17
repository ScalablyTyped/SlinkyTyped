package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoCharacterSet
import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import typingsSlinky.activexOffice.Office.WebPageFont
import typingsSlinky.activexOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultWebOptions extends js.Object {
  var AllowPNG: Boolean = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  @JSName("Excel.DefaultWebOptions_typekey")
  var ExcelDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var LoadPictures: Boolean = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var SaveHiddenData: Boolean = js.native
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

