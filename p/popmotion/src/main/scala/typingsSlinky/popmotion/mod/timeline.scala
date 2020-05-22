package typingsSlinky.popmotion.mod

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.timelineTypesMod.Instruction
import typingsSlinky.popmotion.tweenTypesMod.TweenInterface
import typingsSlinky.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "timeline")
@js.native
object timeline extends js.Object {
  def apply[V](instructions: js.Array[Instruction]): Action[TweenInterface[V]] = js.native
  def apply[V](instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action[TweenInterface[V]] = js.native
}

