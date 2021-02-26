package typingsSlinky.reactNativeModals.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModals.mod.DragEvent
import typingsSlinky.reactNativeModals.mod.FadeAnimation
import typingsSlinky.reactNativeModals.mod.ModalProps
import typingsSlinky.reactNativeModals.mod.OverlayPointerEventTypes
import typingsSlinky.reactNativeModals.mod.ScaleAnimation
import typingsSlinky.reactNativeModals.mod.SlideAnimation
import typingsSlinky.reactNativeModals.mod.SwipeDirection
import typingsSlinky.reactNativeModals.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModals {
  
  @scala.inline
  def apply(visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("react-native-modals", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hasOverlay(value: Boolean): this.type = set("hasOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): this.type = set("modalAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalStyle(value: StyleProp[ViewStyle]): this.type = set("modalStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalStyleNull: this.type = set("modalStyle", null)
    
    @scala.inline
    def modalTitle(value: ReactElement): this.type = set("modalTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalTitleReactElement(value: ReactElement): this.type = set("modalTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onHardwareBackPress(value: () => Boolean): this.type = set("onHardwareBackPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMove(value: /* event */ DragEvent => Unit): this.type = set("onMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSwipeOut(value: /* event */ DragEvent => Unit): this.type = set("onSwipeOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipeRelease(value: /* event */ DragEvent => Unit): this.type = set("onSwipeRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwiping(value: /* event */ DragEvent => Unit): this.type = set("onSwiping", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSwipingOut(value: /* event */ DragEvent => Unit): this.type = set("onSwipingOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchOutside(value: () => Unit): this.type = set("onTouchOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def overlayBackgroundColor(value: String): this.type = set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayOpacity(value: Double): this.type = set("overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayPointerEvents(value: OverlayPointerEventTypes): this.type = set("overlayPointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
