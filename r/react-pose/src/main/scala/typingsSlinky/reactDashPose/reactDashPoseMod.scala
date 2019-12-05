package typingsSlinky.reactDashPose

import typingsSlinky.reactDashPose.libComponentsTransitionTypesMod.Props
import typingsSlinky.reactDashPose.libComponentsTransitionTypesMod.State
import typingsSlinky.reactDashPose.libPosedMod.Posed
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose", JSImport.Namespace)
@js.native
object reactDashPoseMod extends js.Object {
  @js.native
  class PoseGroup ()
    extends typingsSlinky.reactDashPose.libComponentsTransitionPoseGroupMod.default
  
  @js.native
  class Transition ()
    extends typingsSlinky.reactDashPose.libComponentsTransitionMod.default
  
  val default: Posed = js.native
  /* static members */
  @js.native
  object PoseGroup extends js.Object {
    var defaultProps: Anon_FlipMove = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    var defaultProps: Anon_EnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): Partial[State] = js.native
  }
  
}

