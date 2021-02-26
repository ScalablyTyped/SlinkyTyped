package typingsSlinky.reactPose.components

import typingsSlinky.reactPose.transitionTypesMod.Props
import typingsSlinky.reactPose.transitionTypesMod.TransitionChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PoseGroup {
  
  @scala.inline
  def apply(children: TransitionChildren[_]): SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.PoseGroup] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.PoseGroup](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-pose", "PoseGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.PoseGroup] = new SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.PoseGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
