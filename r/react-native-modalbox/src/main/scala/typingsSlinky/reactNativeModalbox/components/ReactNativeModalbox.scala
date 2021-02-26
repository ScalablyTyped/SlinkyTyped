package typingsSlinky.reactNativeModalbox.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalbox.mod.ModalProps
import typingsSlinky.reactNativeModalbox.mod.default
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModalbox {
  
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backButtonClose(value: Boolean): this.type = set("backButtonClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdrop(value: Boolean): this.type = set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropColor(value: String): this.type = set("backdropColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropContent(value: ReactElement): this.type = set("backdropContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropContentReactElement(value: ReactElement): this.type = set("backdropContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropOpacity(value: Double): this.type = set("backdropOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropPressToClose(value: Boolean): this.type = set("backdropPressToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def coverScreen(value: Boolean): this.type = set("coverScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def entry(value: top | bottom | String): this.type = set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardTopOffset(value: Double): this.type = set("keyboardTopOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClosed(value: () => Unit): this.type = set("onClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def onClosingState(value: /* state */ Boolean => Unit): this.type = set("onClosingState", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOpened(value: () => Unit): this.type = set("onOpened", js.Any.fromFunction0(value))
    
    @scala.inline
    def position(value: top | center | bottom | String): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def swipeArea(value: Double): this.type = set("swipeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeToClose(value: Boolean): this.type = set("swipeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeModalbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
