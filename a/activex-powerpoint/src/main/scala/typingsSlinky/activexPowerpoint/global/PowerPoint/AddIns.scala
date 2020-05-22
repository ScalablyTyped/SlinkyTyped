package typingsSlinky.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIns")
@js.native
class AddIns protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.AddIns {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.AddIns_typekey")
  override var PowerPointDotAddIns_typekey: typingsSlinky.activexPowerpoint.PowerPoint.AddIns = js.native
  /* CompleteClass */
  override def Add(FileName: String): typingsSlinky.activexPowerpoint.PowerPoint.AddIn = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typingsSlinky.activexPowerpoint.PowerPoint.AddIn = js.native
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
}

