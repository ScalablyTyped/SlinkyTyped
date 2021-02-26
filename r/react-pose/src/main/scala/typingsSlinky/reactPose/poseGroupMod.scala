package typingsSlinky.reactPose

import typingsSlinky.react.mod.Component
import typingsSlinky.reactPose.anon.FlipMove
import typingsSlinky.reactPose.transitionTypesMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poseGroupMod {
  
  @JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Default)
  @js.native
  class default () extends PoseGroup
  /* static members */
  object default {
    
    @JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-pose/lib/components/Transition/PoseGroup", "default.defaultProps")
    @js.native
    def defaultProps: FlipMove = js.native
    @scala.inline
    def defaultProps_=(x: FlipMove): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PoseGroup
    extends Component[Props, js.Object, js.Any]
}
