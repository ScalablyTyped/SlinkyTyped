package typingsSlinky.reactNativePopupDialog.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativePopupDialog.mod.DialogProps
import typingsSlinky.reactNativePopupDialog.mod.FadeAnimation
import typingsSlinky.reactNativePopupDialog.mod.OverlayPointerEventTypes
import typingsSlinky.reactNativePopupDialog.mod.ScaleAnimation
import typingsSlinky.reactNativePopupDialog.mod.SlideAnimation
import typingsSlinky.reactNativePopupDialog.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePopupDialog {
  @JSImport("react-native-popup-dialog", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def dialogAnimation(value: FadeAnimation | ScaleAnimation | SlideAnimation): this.type = set("dialogAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogStyle(value: StyleProp[ViewStyle]): this.type = set("dialogStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogStyleNull: this.type = set("dialogStyle", null)
    @scala.inline
    def dialogTitle(value: js.Any): this.type = set("dialogTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def hasOverlay(value: Boolean): this.type = set("hasOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onHardwareBackPress(value: () => Boolean): this.type = set("onHardwareBackPress", js.Any.fromFunction0(value))
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
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
    def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativePopupDialog.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

