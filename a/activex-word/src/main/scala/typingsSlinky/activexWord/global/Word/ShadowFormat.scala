package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexOffice.Office.MsoShadowStyle
import typingsSlinky.activexOffice.Office.MsoShadowType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ShadowFormat")
@js.native
class ShadowFormat protected ()
  extends typingsSlinky.activexWord.Word.ShadowFormat {
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Blur: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val ForeColor: typingsSlinky.activexWord.Word.ColorFormat = js.native
  /* CompleteClass */
  override var Obscured: MsoTriState = js.native
  /* CompleteClass */
  override var OffsetX: Double = js.native
  /* CompleteClass */
  override var OffsetY: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RotateWithShape: MsoTriState = js.native
  /* CompleteClass */
  override var Size: Double = js.native
  /* CompleteClass */
  override var Style: MsoShadowStyle = js.native
  /* CompleteClass */
  override var Transparency: Double = js.native
  /* CompleteClass */
  override var Type: MsoShadowType = js.native
  /* CompleteClass */
  override var Visible: MsoTriState = js.native
  /* CompleteClass */
  @JSName("Word.ShadowFormat_typekey")
  override var WordDotShadowFormat_typekey: typingsSlinky.activexWord.Word.ShadowFormat = js.native
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
}

