package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoPictureColorType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Brightness: Double = js.native
  var ColorType: MsoPictureColorType = js.native
  var Contrast: Double = js.native
  val Creator: Double = js.native
  var Crop: typingsSlinky.activexOffice.Office.Crop = js.native
  var CropBottom: Double = js.native
  var CropLeft: Double = js.native
  var CropRight: Double = js.native
  var CropTop: Double = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: Double = js.native
  var TransparentBackground: MsoTriState = js.native
  @JSName("Word.PictureFormat_typekey")
  var WordDotPictureFormat_typekey: PictureFormat = js.native
  def IncrementBrightness(Increment: Double): Unit = js.native
  def IncrementContrast(Increment: Double): Unit = js.native
}

