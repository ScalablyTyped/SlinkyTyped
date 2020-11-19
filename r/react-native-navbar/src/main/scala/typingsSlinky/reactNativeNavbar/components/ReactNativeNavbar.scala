package typingsSlinky.reactNativeNavbar.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeNavbar.mod.NavigationBarButton
import typingsSlinky.reactNativeNavbar.mod.NavigationBarProps
import typingsSlinky.reactNativeNavbar.mod.NavigationBarTitle
import typingsSlinky.reactNativeNavbar.mod.StatusBar
import typingsSlinky.reactNativeNavbar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeNavbar {
  
  @JSImport("react-native-navbar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def leftButtonReactElement(value: ReactElement): this.type = set("leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftButton(value: NavigationBarButton | ReactElement): this.type = set("leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftButtonNull: this.type = set("leftButton", null)
    
    @scala.inline
    def rightButtonReactElement(value: ReactElement): this.type = set("rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightButton(value: NavigationBarButton | ReactElement): this.type = set("rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightButtonNull: this.type = set("rightButton", null)
    
    @scala.inline
    def statusBar(value: StatusBar): this.type = set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: NavigationBarTitle | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleNull: this.type = set("title", null)
  }
  
  def withProps(p: NavigationBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeNavbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
