package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoCharacterSet
import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.WebPageFont
import typingsSlinky.activexOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultWebOptions extends js.Object {
  var AllowPNG: MsoTriState = js.native
  var AlwaysSaveInDefaultEncoding: MsoTriState = js.native
  var CheckIfOfficeIsHTMLEditor: MsoTriState = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var FrameColors: PpFrameColors = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  var IncludeNavigation: MsoTriState = js.native
  var OrganizeInFolder: MsoTriState = js.native
  @JSName("PowerPoint.DefaultWebOptions_typekey")
  var PowerPointDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  var RelyOnVML: MsoTriState = js.native
  var ResizeGraphics: MsoTriState = js.native
  var SaveNewWebPagesAsWebArchives: MsoTriState = js.native
  var ScreenSize: MsoScreenSize = js.native
  var ShowSlideAnimation: MsoTriState = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: MsoTriState = js.native
  var UseLongFileNames: MsoTriState = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

