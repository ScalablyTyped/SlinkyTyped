package typingsSlinky.reactPose.components

import typingsSlinky.reactPose.transitionTypesMod.Props
import typingsSlinky.reactPose.transitionTypesMod.TransitionChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transition {
  @JSImport("react-pose", "Transition")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.Transition] = new SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.Transition](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: TransitionChildren[_]): SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.Transition] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Props826758526[typingsSlinky.reactPose.mod.Transition](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

