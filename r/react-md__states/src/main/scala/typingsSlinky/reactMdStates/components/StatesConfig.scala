package typingsSlinky.reactMdStates.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdStates.statesConfigMod.StatesConfigProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatesConfig {
  
  @JSImport("@react-md/states", "StatesConfig")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disableProgrammaticRipple(value: Boolean): this.type = set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleClassNames(value: CSSTransitionClassNames): this.type = set("rippleClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rippleTimeout(value: TransitionTimeout): this.type = set("rippleTimeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatesConfigProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StatesConfig.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
