package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`landscape-left`
import typingsSlinky.reactNative.reactNativeStrings.`landscape-right`
import typingsSlinky.reactNative.reactNativeStrings.`portrait-upside-down`
import typingsSlinky.reactNative.reactNativeStrings.fade
import typingsSlinky.reactNative.reactNativeStrings.formSheet
import typingsSlinky.reactNative.reactNativeStrings.fullScreen
import typingsSlinky.reactNative.reactNativeStrings.landscape
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.overFullScreen
import typingsSlinky.reactNative.reactNativeStrings.pageSheet
import typingsSlinky.reactNative.reactNativeStrings.portrait
import typingsSlinky.reactNative.reactNativeStrings.slide
import typingsSlinky.reactNativeElements.mod.OverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("react-native-elements", "Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.Overlay] {
    
    @scala.inline
    def ModalComponent(value: ReactComponentClass[js.Object]): this.type = set("ModalComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animationType(value: none | slide | fade): this.type = set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropStyle(value: StyleProp[ViewStyle]): this.type = set("backdropStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backdropStyleNull: this.type = set("backdropStyle", null)
    
    @scala.inline
    def fullScreen(value: Boolean): this.type = set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hardwareAccelerated(value: Boolean): this.type = set("hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBackdropPress(value: () => Unit): this.type = set("onBackdropPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def onOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRequestClose(value: () => Unit): this.type = set("onRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def onShow(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def overlayStyle(value: StyleProp[ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlayStyleNull: this.type = set("overlayStyle", null)
    
    @scala.inline
    def presentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): this.type = set("presentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statusBarTranslucent(value: Boolean): this.type = set("statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def supportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): this.type = set("supportedOrientations", js.Array(value :_*))
    
    @scala.inline
    def supportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): this.type = set("supportedOrientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(isVisible: Boolean): Builder = {
    val __props = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
}
