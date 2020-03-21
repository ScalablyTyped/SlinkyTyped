package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoShadowStyle
import typingsSlinky.activexOffice.Office.MsoShadowType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ShadowFormat")
@js.native
class ShadowFormat protected () extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Blur: Double = js.native
  val Creator: Double = js.native
  val ForeColor: ColorFormat = js.native
  var Obscured: MsoTriState = js.native
  var OffsetX: Double = js.native
  var OffsetY: Double = js.native
  val Parent: js.Any = js.native
  var RotateWithShape: MsoTriState = js.native
  var Size: Double = js.native
  var Style: MsoShadowStyle = js.native
  var Transparency: Double = js.native
  var Type: MsoShadowType = js.native
  var Visible: MsoTriState = js.native
  @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: ShadowFormat = js.native
  def IncrementOffsetX(Increment: Double): Unit = js.native
  def IncrementOffsetY(Increment: Double): Unit = js.native
}

