package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexPowerpoint.PowerPoint.PpTabStopType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TabStops")
@js.native
class TabStops protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.TabStops {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override var DefaultSpacing: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.TabStops_typekey")
  override var PowerPointDotTabStops_typekey: typingsSlinky.activexPowerpoint.PowerPoint.TabStops = js.native
  /* CompleteClass */
  override def Add(Type: PpTabStopType, Position: Double): typingsSlinky.activexPowerpoint.PowerPoint.TabStop = js.native
  /* CompleteClass */
  override def Item(Index: Double): typingsSlinky.activexPowerpoint.PowerPoint.TabStop = js.native
}

