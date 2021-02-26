package typingsSlinky.reactMessengerCheckbox.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMessengerCheckbox.mod.ReactMessengerProps
import typingsSlinky.reactMessengerCheckbox.mod.^
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMessengerCheckbox {
  
  @scala.inline
  def apply(appId: String, origin: String, pageId: String, userRef: String): Builder = {
    val __props = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMessengerProps]))
  }
  
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def allowLogin(value: Boolean): this.type = set("allowLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoLogAppEvents(value: Boolean): this.type = set("autoLogAppEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centerAlign(value: Boolean): this.type = set("centerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEvent(value: /* event */ js.Any => Unit): this.type = set("onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def prechecked(value: Boolean): this.type = set("prechecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: small | medium | large | standard | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skin(value: light | dark): this.type = set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def version(value: String): this.type = set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xfbml(value: Boolean): this.type = set("xfbml", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactMessengerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
