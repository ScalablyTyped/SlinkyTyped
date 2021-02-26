package typingsSlinky.reactMdStates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdStates.rippleContainerMod.RippleContainerProps
import typingsSlinky.reactMdStates.typesMod.RippleState
import typingsSlinky.reactMdStates.typesMod.RipplesState
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RippleContainer {
  
  @scala.inline
  def apply(entered: RippleState => Unit, exited: RippleState => Unit, ripples: RipplesState): Builder = {
    val __props = js.Dynamic.literal(entered = js.Any.fromFunction1(entered), exited = js.Any.fromFunction1(exited), ripples = ripples.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RippleContainerProps]))
  }
  
  @JSImport("@react-md/states/types/ripples/RippleContainer", "RippleContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleClassName(value: String): this.type = set("rippleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RippleContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
