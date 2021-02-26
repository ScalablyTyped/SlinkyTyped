package typingsSlinky.reactNativeModals.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModals.mod.DragEvent
import typingsSlinky.reactNativeModals.mod.DraggableViewProps
import typingsSlinky.reactNativeModals.mod.SwipeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DraggableView {
  
  @JSImport("react-native-modals", "DraggableView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeModals.mod.DraggableView] {
    
    @scala.inline
    def onMove(value: /* event */ DragEvent => Unit): this.type = set("onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRelease(value: /* event */ DragEvent => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeOut(value: /* event */ DragEvent => Unit): this.type = set("onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwiping(value: /* event */ DragEvent => Unit): this.type = set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipingOut(value: /* event */ DragEvent => Unit): this.type = set("onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
    
    @scala.inline
    def swipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): this.type = set("swipeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeDirectionVarargs(value: SwipeDirection*): this.type = set("swipeDirection", js.Array(value :_*))
    
    @scala.inline
    def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DraggableView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DraggableViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
