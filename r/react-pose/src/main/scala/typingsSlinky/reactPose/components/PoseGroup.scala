package typingsSlinky.reactPose.components

import typingsSlinky.reactPose.poseGroupMod.default
import typingsSlinky.reactPose.transitionTypesMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PoseGroup {
  @JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props826758526[default] = new SharedBuilder_Props826758526[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PoseGroup.type): SharedBuilder_Props826758526[default] = new SharedBuilder_Props826758526[default](js.Array(this.component, js.Dictionary.empty))()
}

