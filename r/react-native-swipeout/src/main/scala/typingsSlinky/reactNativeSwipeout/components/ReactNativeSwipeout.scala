package typingsSlinky.reactNativeSwipeout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typingsSlinky.reactNativeSwipeout.mod.SwipeoutProperties
import typingsSlinky.reactNativeSwipeout.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSwipeout {
  
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def buttonWidth(value: Double): this.type = set("buttonWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: Boolean): this.type = set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: js.Array[SwipeoutButtonProperties]): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftVarargs(value: SwipeoutButtonProperties*): this.type = set("left", js.Array(value :_*))
    
    @scala.inline
    def onClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): this.type = set("onClose", js.Any.fromFunction3(value))
    
    @scala.inline
    def onOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): this.type = set("onOpen", js.Any.fromFunction3(value))
    
    @scala.inline
    def openLeft(value: Boolean): this.type = set("openLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def openRight(value: Boolean): this.type = set("openRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: js.Array[SwipeoutButtonProperties]): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightVarargs(value: SwipeoutButtonProperties*): this.type = set("right", js.Array(value :_*))
    
    @scala.inline
    def rowId(value: Double): this.type = set("rowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: /* scrollEnabled */ Boolean => Unit): this.type = set("scroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def sectionId(value: Double): this.type = set("sectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sensitivity(value: Double): this.type = set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSwipeout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeoutProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
