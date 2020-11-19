package typingsSlinky.poseCore

import typingsSlinky.poseCore.typesMod.PoseMap
import typingsSlinky.poseCore.typesMod.TransitionMap
import typingsSlinky.poseCore.typesMod.TransitionMapFactory
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
@js.native
object transitionsMod extends js.Object {
  
  def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = js.native
}
