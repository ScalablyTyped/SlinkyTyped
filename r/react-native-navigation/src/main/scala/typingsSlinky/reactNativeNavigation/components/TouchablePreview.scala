package typingsSlinky.reactNativeNavigation.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.TouchableHighlight
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import typingsSlinky.reactNative.mod.TouchableOpacity
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import typingsSlinky.reactNativeNavigation.anon.ReactTag
import typingsSlinky.reactNativeNavigation.touchablePreviewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TouchablePreview {
  
  @JSImport("react-native-navigation", "Navigation.TouchablePreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactNativeNavigation.reactNativeNavigationMod.Navigation.TouchablePreview
        ] {
    
    @scala.inline
    def onPeekIn(value: () => Unit): this.type = set("onPeekIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPeekOut(value: () => Unit): this.type = set("onPeekOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPressIn(value: /* payload */ ReactTag => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def touchableComponent(
      value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactElement
    ): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchableComponentReactElement(value: ReactElement): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TouchablePreview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
