package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoEncoding
import typingsSlinky.activexOffice.Office.MsoScreenSize
import typingsSlinky.activexOffice.Office.MsoTargetBrowser
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexPowerpoint.PowerPoint.PpFrameColors
import typingsSlinky.activexPowerpoint.PowerPoint.PpHTMLVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.WebOptions")
@js.native
class WebOptions protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.WebOptions {
  /* CompleteClass */
  override var AllowPNG: MsoTriState = js.native
  /* CompleteClass */
  override var Encoding: MsoEncoding = js.native
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  /* CompleteClass */
  override var FrameColors: PpFrameColors = js.native
  /* CompleteClass */
  override var HTMLVersion: PpHTMLVersion = js.native
  /* CompleteClass */
  override var IncludeNavigation: MsoTriState = js.native
  /* CompleteClass */
  override var OrganizeInFolder: MsoTriState = js.native
  /* CompleteClass */
  @JSName("PowerPoint.WebOptions_typekey")
  override var PowerPointDotWebOptions_typekey: typingsSlinky.activexPowerpoint.PowerPoint.WebOptions = js.native
  /* CompleteClass */
  override var RelyOnVML: MsoTriState = js.native
  /* CompleteClass */
  override var ResizeGraphics: MsoTriState = js.native
  /* CompleteClass */
  override var ScreenSize: MsoScreenSize = js.native
  /* CompleteClass */
  override var ShowSlideAnimation: MsoTriState = js.native
  /* CompleteClass */
  override var TargetBrowser: MsoTargetBrowser = js.native
  /* CompleteClass */
  override var UseLongFileNames: MsoTriState = js.native
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
}

