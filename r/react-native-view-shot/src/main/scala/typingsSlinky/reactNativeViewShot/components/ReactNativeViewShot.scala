package typingsSlinky.reactNativeViewShot.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeViewShot.mod.CaptureOptions
import typingsSlinky.reactNativeViewShot.mod.ViewShotProperties
import typingsSlinky.reactNativeViewShot.mod.default
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.continuous
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.mount
import typingsSlinky.reactNativeViewShot.reactNativeViewShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeViewShot {
  @JSImport("react-native-view-shot", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def captureMode(value: mount | continuous | update): this.type = set("captureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def onCapture(value: /* uri */ String => Unit): this.type = set("onCapture", js.Any.fromFunction1(value))
    @scala.inline
    def onCaptureFailure(value: /* error */ js.Error => Unit): this.type = set("onCaptureFailure", js.Any.fromFunction1(value))
    @scala.inline
    def options(value: CaptureOptions): this.type = set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ViewShotProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeViewShot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

