package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("spine.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain extends RotateMode
  
  @js.native
  sealed trait ChainScale extends RotateMode
  
  @js.native
  sealed trait Tangent extends RotateMode
  
  /* 1 */ val Chain: typingsSlinky.phaser.spine.RotateMode.Chain with Double = js.native
  /* 2 */ val ChainScale: typingsSlinky.phaser.spine.RotateMode.ChainScale with Double = js.native
  /* 0 */ val Tangent: typingsSlinky.phaser.spine.RotateMode.Tangent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RotateMode with Double] = js.native
}

