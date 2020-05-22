package typingsSlinky.activexPowerpoint.global.PowerPoint

import typingsSlinky.activexPowerpoint.PowerPoint.PpPlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Player")
@js.native
class Player protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Player {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var CurrentPosition: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Player_typekey")
  override var PowerPointDotPlayer_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Player = js.native
  /* CompleteClass */
  override val State: PpPlayerState = js.native
  /* CompleteClass */
  override def GoToNextBookmark(): Unit = js.native
  /* CompleteClass */
  override def GoToPreviousBookmark(): Unit = js.native
  /* CompleteClass */
  override def Pause(): Unit = js.native
  /* CompleteClass */
  override def Play(): Unit = js.native
  /* CompleteClass */
  override def Stop(): Unit = js.native
}

