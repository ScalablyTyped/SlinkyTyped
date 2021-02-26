package typingsSlinky.reactNotificationSystem.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNotificationSystem.mod.Attributes
import typingsSlinky.reactNotificationSystem.mod.Style
import typingsSlinky.reactNotificationSystem.mod.System
import typingsSlinky.reactNotificationSystem.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNotificationSystem {
  
  object ReactNotificationSystem {
    
    @JSImport("react-notification-system", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, ^] {
      
      @scala.inline
      def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactNotificationSystem.type): typingsSlinky.reactNotificationSystem.components.ReactNotificationSystem.ReactNotificationSystem.Builder = new typingsSlinky.reactNotificationSystem.components.ReactNotificationSystem.ReactNotificationSystem.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: Attributes): typingsSlinky.reactNotificationSystem.components.ReactNotificationSystem.ReactNotificationSystem.Builder = new typingsSlinky.reactNotificationSystem.components.ReactNotificationSystem.ReactNotificationSystem.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, System] {
    
    @scala.inline
    def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNotificationSystem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Attributes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
