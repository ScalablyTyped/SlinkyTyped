package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ExtraColors")
@js.native
class ExtraColors protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.ExtraColors {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ExtraColors_typekey")
  override var PowerPointDotExtraColors_typekey: typingsSlinky.activexPowerpoint.PowerPoint.ExtraColors = js.native
  /* CompleteClass */
  override def Add(Type: MsoRGBType): Unit = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def Item(Index: Double): MsoRGBType = js.native
}

