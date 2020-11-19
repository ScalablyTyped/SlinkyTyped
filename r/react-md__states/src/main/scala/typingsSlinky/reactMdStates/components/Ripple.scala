package typingsSlinky.reactMdStates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdStates.rippleMod.RippleProps
import typingsSlinky.reactMdStates.typesMod.RippleState
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ripple {
  
  @JSImport("@react-md/states/types/ripples/Ripple", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RippleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripple: RippleState): Builder = {
    val __props = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripple = ripple.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RippleProps]))
  }
}
