package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.timelineTypesMod.Instruction
import typingsSlinky.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  def default(instructions: js.Array[Instruction]): Action = js.native
  def default(instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action = js.native
}

