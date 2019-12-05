package typingsSlinky.activexDashExcel.Excel

import typingsSlinky.activexDashOffice.Office.MsoCharacterSet
import typingsSlinky.activexDashOffice.Office.MsoEncoding
import typingsSlinky.activexDashOffice.Office.MsoScreenSize
import typingsSlinky.activexDashOffice.Office.MsoTargetBrowser
import typingsSlinky.activexDashOffice.Office.WebPageFont
import typingsSlinky.activexDashOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typingsSlinky.activexDashExcel.Excel.Application = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  var `Excel.DefaultWebOptions_typekey`: DefaultWebOptions = js.native
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

