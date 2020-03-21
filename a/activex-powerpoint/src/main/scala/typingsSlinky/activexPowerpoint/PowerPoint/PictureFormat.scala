package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoPictureColorType
import typingsSlinky.activexOffice.Office.MsoRGBType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  val Crop: typingsSlinky.activexOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PictureFormat_typekey")
  var PowerPointDotPictureFormat_typekey: PictureFormat = js.native
  var TransparencyColor: MsoRGBType = js.native
  var TransparentBackground: MsoTriState = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

