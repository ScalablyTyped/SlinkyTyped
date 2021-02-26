package typingsSlinky.reactSAlert.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSAlert.mod.SAlert.SAlertBeepProps
import typingsSlinky.reactSAlert.mod.SAlert.SAlertProps
import typingsSlinky.reactSAlert.mod.SAlert.SAlertStackProps
import typingsSlinky.reactSAlert.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSAlert {
  
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def beep(value: String | Boolean | SAlertBeepProps): this.type = set("beep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentTemplate(value: /* repeated */ js.Any => _): this.type = set("contentTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def customFields(value: js.Object): this.type = set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def effect(value: String): this.type = set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stack(value: Boolean | SAlertStackProps): this.type = set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeout(value: String | Double): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSAlert.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SAlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
