package typingsSlinky.rcMotion

import typingsSlinky.rcMotion.interfaceMod.MotionStatus
import typingsSlinky.rcMotion.interfaceMod.StepStatus
import typingsSlinky.rcMotion.rcMotionBooleans.`false`
import typingsSlinky.rcMotion.rcMotionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStepQueueMod {
  
  @JSImport("rc-motion/es/hooks/useStepQueue", JSImport.Default)
  @js.native
  def default(
    status: MotionStatus,
    callback: js.Function1[/* step */ StepStatus, js.Promise[Unit] | Unit | `false` | `true`]
  ): js.Tuple2[js.Function0[Unit], StepStatus] = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "DoStep")
  @js.native
  val DoStep: `true` = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "SkipStep")
  @js.native
  val SkipStep: `false` = js.native
  
  @JSImport("rc-motion/es/hooks/useStepQueue", "isActive")
  @js.native
  def isActive(step: StepStatus): Boolean = js.native
}
