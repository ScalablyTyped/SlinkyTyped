package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.timelineTypesMod.Instruction
import typingsSlinky.popmotion.tweenTypesMod.TweenInterface
import typingsSlinky.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/animations/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  
  def default[V](instructions: js.Array[Instruction]): Action[TweenInterface[V]] = js.native
  def default[V](instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action[TweenInterface[V]] = js.native
}
