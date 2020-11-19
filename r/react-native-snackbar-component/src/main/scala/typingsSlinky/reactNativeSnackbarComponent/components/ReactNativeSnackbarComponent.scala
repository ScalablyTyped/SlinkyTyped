package typingsSlinky.reactNativeSnackbarComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSnackbarComponent.mod.SnackbarComponentProps
import typingsSlinky.reactNativeSnackbarComponent.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSnackbarComponent {
  
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def actionHandler(value: () => Unit): this.type = set("actionHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def actionText(value: String): this.type = set("actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoHidingTime(value: Double): this.type = set("autoHidingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottom(value: Double): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def distanceCallback(value: () => Unit): this.type = set("distanceCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messageColor(value: String): this.type = set("messageColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: Double): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textMessage(value: String): this.type = set("textMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeSnackbarComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
