package typingsSlinky.poseDashCore

import typingsSlinky.poseDashCore.libTypesMod.PoseMap
import typingsSlinky.poseDashCore.libTypesMod.TransitionMap
import typingsSlinky.poseDashCore.libTypesMod.TransitionMapFactory
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/factories/transitions", JSImport.Namespace)
@js.native
object libFactoriesTransitionsMod extends js.Object {
  def default[A, TD](
    poses: PoseMap[A, TD],
    defaultTransitions: Map[String, (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])]
  ): PoseMap[A, TD] = js.native
}

