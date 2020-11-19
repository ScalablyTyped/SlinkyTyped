package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.anon.Container
import typingsSlinky.reactNativeMaterialUi.mod.ActionButtonProps
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionButton {
  
  @JSImport("react-native-material-ui", "ActionButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ActionButton] {
    
    @scala.inline
    def actionsVarargs(value: (ReactElement | typingsSlinky.reactNativeMaterialUi.anon.Icon | String)*): this.type = set("actions", js.Array(value :_*))
    
    @scala.inline
    def actions(value: js.Array[ReactElement | typingsSlinky.reactNativeMaterialUi.anon.Icon | String]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: Container): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transition(value: toolbar | speedDial): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ActionButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
