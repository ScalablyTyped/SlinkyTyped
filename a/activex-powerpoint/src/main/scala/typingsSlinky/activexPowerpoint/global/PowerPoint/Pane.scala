package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexPowerpoint.PowerPoint.PpViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Pane")
@js.native
class Pane protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Pane {
  /* CompleteClass */
  override val Active: MsoTriState = js.native
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Pane_typekey")
  override var PowerPointDotPane_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Pane = js.native
  /* CompleteClass */
  override val ViewType: PpViewType = js.native
  /* CompleteClass */
  override def Activate(): Unit = js.native
}

