package typingsSlinky.reactNativeLoadingSpinnerOverlay.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeLoadingSpinnerOverlay.mod.SpinnerProps
import typingsSlinky.reactNativeLoadingSpinnerOverlay.mod.default
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeLoadingSpinnerOverlay {
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def animation(value: none | slide | fade): this.type = set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelable(value: Boolean): this.type = set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def customIndicator(value: ReactElement): this.type = set("customIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayColor(value: String): this.type = set("overlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: normal | small | large): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def textContent(value: String): this.type = set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyleNull: this.type = set("textStyle", null)
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeLoadingSpinnerOverlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

