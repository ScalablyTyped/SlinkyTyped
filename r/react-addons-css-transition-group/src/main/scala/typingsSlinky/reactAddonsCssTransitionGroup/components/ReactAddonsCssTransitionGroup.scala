package typingsSlinky.reactAddonsCssTransitionGroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupProps
import typingsSlinky.reactAddonsCssTransitionGroup.mod.reactAugmentingMod.CSSTransitionGroupTransitionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAddonsCssTransitionGroup {
  
  @scala.inline
  def apply(transitionName: String | CSSTransitionGroupTransitionName): Builder = {
    val __props = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CSSTransitionGroupProps]))
  }
  
  object Class {
    
    @scala.inline
    def apply(transitionName: String | CSSTransitionGroupTransitionName): typingsSlinky.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder = {
      val __props = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
      new typingsSlinky.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder(js.Array(this.component, __props.asInstanceOf[CSSTransitionGroupProps]))
    }
    
    @JSImport("react-addons-css-transition-group", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactAddonsCssTransitionGroup.mod.Class] {
      
      @scala.inline
      def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionAppearTimeout(value: Double): this.type = set("transitionAppearTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionEnter(value: Boolean): this.type = set("transitionEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionEnterTimeout(value: Double): this.type = set("transitionEnterTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionLeave(value: Boolean): this.type = set("transitionLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def transitionLeaveTimeout(value: Double): this.type = set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CSSTransitionGroupProps): typingsSlinky.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder = new typingsSlinky.reactAddonsCssTransitionGroup.components.ReactAddonsCssTransitionGroup.Class.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionAppearTimeout(value: Double): this.type = set("transitionAppearTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionEnter(value: Boolean): this.type = set("transitionEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionEnterTimeout(value: Double): this.type = set("transitionEnterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionLeave(value: Boolean): this.type = set("transitionLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionLeaveTimeout(value: Double): this.type = set("transitionLeaveTimeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CSSTransitionGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
