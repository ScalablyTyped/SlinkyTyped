package typingsSlinky.reactMdTransition.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdTransition.useTransitionGroupMod.TransitionGroupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionGroup {
  
  @JSImport("@react-md/transition/types/TransitionGroup", "TransitionGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: TransitionGroupOptions): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TransitionGroup.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
