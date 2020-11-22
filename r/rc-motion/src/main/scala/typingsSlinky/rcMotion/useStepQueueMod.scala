package typingsSlinky.rcMotion

import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.rcMotion.interfaceMod.StepStatus
import typingsSlinky.rcMotion.rcMotionBooleans.`false`
import typingsSlinky.rcMotion.rcMotionBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-motion/es/hooks/useStepQueue", JSImport.Namespace)
@js.native
object useStepQueueMod extends js.Object {
  
  val DoStep: `true` = js.native
  
  val SkipStep: `false` = js.native
  
  def default(
    status: MotionStatus,
    callback: js.Function1[/* step */ StepStatus, js.Promise[Unit] | Unit | `false` | `true`]
  ): js.Tuple2[js.Function0[Unit], StepStatus] = js.native
  
  def isActive(step: StepStatus): Boolean = js.native
}
