package typingsSlinky.reactNativeMaterialUi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeMaterialUi.mod.RightElementPressEvent
import typingsSlinky.reactNativeMaterialUi.mod.Searchable
import typingsSlinky.reactNativeMaterialUi.mod.ToolBarRightElement
import typingsSlinky.reactNativeMaterialUi.mod.ToolbarProps
import typingsSlinky.reactNativeMaterialUi.mod.ToolbarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar {
  
  @JSImport("react-native-material-ui", "Toolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Toolbar] {
    
    @scala.inline
    def centerElementReactElement(value: ReactElement): this.type = set("centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centerElement(value: ReactElement | String): this.type = set("centerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isSearchActive(value: Boolean): this.type = set("isSearchActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftElementReactElement(value: ReactElement): this.type = set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftElement(value: ReactElement | String): this.type = set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLeftElementPress(value: () => Unit): this.type = set("onLeftElementPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onRightElementPress(value: /* e */ RightElementPressEvent => Unit): this.type = set("onRightElementPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def rightElementReactElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightElementVarargs(value: String*): this.type = set("rightElement", js.Array(value :_*))
    
    @scala.inline
    def rightElement(value: ReactElement | String | js.Array[String] | ToolBarRightElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchable(value: Searchable): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: ToolbarStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToolbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Toolbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
