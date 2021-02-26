package typingsSlinky.reactCssTransitionReplace.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCssTransitionReplace.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCssTransitionReplace {
  
  object Class {
    
    @JSImport("react-css-transition-replace", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.reactCssTransitionReplace.mod.Class] {
      
      @scala.inline
      def changeWidth(value: Boolean): this.type = set("changeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def overflowHidden(value: Boolean): this.type = set("overflowHidden", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Class.type): typingsSlinky.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder = new typingsSlinky.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Props): typingsSlinky.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder = new typingsSlinky.reactCssTransitionReplace.components.ReactCssTransitionReplace.Class.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def changeWidth(value: Boolean): this.type = set("changeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflowHidden(value: Boolean): this.type = set("overflowHidden", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCssTransitionReplace.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
