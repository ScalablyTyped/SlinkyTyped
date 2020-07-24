package typingsSlinky.reactNative.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ModalProps
import typingsSlinky.reactNative.mod.NodeHandle
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("react-native", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.Modal] {
    @scala.inline
    def animated(value: Boolean): this.type = set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def animationType(value: none | slide | fade): this.type = set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def hardwareAccelerated(value: Boolean): this.type = set("hardwareAccelerated", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def onOrientationChange(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onOrientationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRequestClose(value: () => Unit): this.type = set("onRequestClose", js.Any.fromFunction0(value))
    @scala.inline
    def onShow(value: SyntheticEvent[NodeHandle, _] => Unit): this.type = set("onShow", js.Any.fromFunction1(value))
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
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

