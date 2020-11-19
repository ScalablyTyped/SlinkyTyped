package typingsSlinky.reactPose

import typingsSlinky.reactPose.anon.EnterAfterExit
import typingsSlinky.reactPose.anon.FlipMove
import typingsSlinky.reactPose.anon.PartialState
import typingsSlinky.reactPose.posedMod.Posed
import typingsSlinky.reactPose.transitionTypesMod.Props
import typingsSlinky.reactPose.transitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-pose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: Posed = js.native
  
  @js.native
  class PoseGroup ()
    extends typingsSlinky.reactPose.poseGroupMod.default
  /* static members */
  @js.native
  object PoseGroup extends js.Object {
    
    var defaultProps: FlipMove = js.native
  }
  
  @js.native
  class Transition ()
    extends typingsSlinky.reactPose.transitionMod.default
  /* static members */
  @js.native
  object Transition extends js.Object {
    
    var defaultProps: EnterAfterExit = js.native
    
    def getDerivedStateFromProps(props: Props, state: State): PartialState = js.native
  }
}
