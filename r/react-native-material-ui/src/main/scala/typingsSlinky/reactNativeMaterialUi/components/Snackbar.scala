package typingsSlinky.reactNativeMaterialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Message
import typingsSlinky.reactNativeMaterialUi.mod.ButtonProps
import typingsSlinky.reactNativeMaterialUi.mod.SnackbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  @scala.inline
  def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: () => Unit,
    timeout: Double,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackbarProps]))
  }
  
  @JSImport("react-native-material-ui", "Snackbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Snackbar] {
    
    @scala.inline
    def actionText(value: String): this.type = set("actionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def button(value: ButtonProps): this.type = set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActionPress(value: () => Unit): this.type = set("onActionPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: Message): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
