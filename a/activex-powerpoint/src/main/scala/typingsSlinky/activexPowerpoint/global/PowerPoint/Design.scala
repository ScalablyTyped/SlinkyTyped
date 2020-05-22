package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Design")
@js.native
class Design protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Design {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val HasTitleMaster: MsoTriState = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Design_typekey")
  override var PowerPointDotDesign_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Design = js.native
  /* CompleteClass */
  override var Preserved: MsoTriState = js.native
  /* CompleteClass */
  override val SlideMaster: typingsSlinky.activexPowerpoint.PowerPoint.Master = js.native
  /* CompleteClass */
  override val TitleMaster: typingsSlinky.activexPowerpoint.PowerPoint.Master = js.native
  /* CompleteClass */
  override def AddTitleMaster(): typingsSlinky.activexPowerpoint.PowerPoint.Master = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
}

