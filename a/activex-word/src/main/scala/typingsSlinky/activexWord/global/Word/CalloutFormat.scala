package typingsSlinky.activexWord.global.Word

import typingsSlinky.activexOffice.Office.MsoCalloutAngleType
import typingsSlinky.activexOffice.Office.MsoCalloutDropType
import typingsSlinky.activexOffice.Office.MsoCalloutType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CalloutFormat")
@js.native
class CalloutFormat protected ()
  extends typingsSlinky.activexWord.Word.CalloutFormat {
  /* CompleteClass */
  override var Accent: MsoTriState = js.native
  /* CompleteClass */
  override var Angle: MsoCalloutAngleType = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var AutoAttach: MsoTriState = js.native
  /* CompleteClass */
  override val AutoLength: MsoTriState = js.native
  /* CompleteClass */
  override var Border: MsoTriState = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Drop: Double = js.native
  /* CompleteClass */
  override val DropType: MsoCalloutDropType = js.native
  /* CompleteClass */
  override var Gap: Double = js.native
  /* CompleteClass */
  override val Length: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Type: MsoCalloutType = js.native
  /* CompleteClass */
  @JSName("Word.CalloutFormat_typekey")
  override var WordDotCalloutFormat_typekey: typingsSlinky.activexWord.Word.CalloutFormat = js.native
  /* CompleteClass */
  override def AutomaticLength(): Unit = js.native
  /* CompleteClass */
  override def CustomDrop(Drop: Double): Unit = js.native
  /* CompleteClass */
  override def CustomLength(Length: Double): Unit = js.native
  /* CompleteClass */
  override def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
}

