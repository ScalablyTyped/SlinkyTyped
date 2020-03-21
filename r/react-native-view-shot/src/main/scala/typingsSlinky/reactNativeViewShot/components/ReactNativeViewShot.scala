package typingsSlinky.reactNativeViewShot.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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

object ReactNativeViewShot
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-view-shot", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    captureMode: mount | continuous | update = null,
    onCapture: /* uri */ String => Unit = null,
    onCaptureFailure: /* error */ js.Error => Unit = null,
    options: CaptureOptions = null,
    style: ViewStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (captureMode != null) __obj.updateDynamic("captureMode")(captureMode.asInstanceOf[js.Any])
    if (onCapture != null) __obj.updateDynamic("onCapture")(js.Any.fromFunction1(onCapture))
    if (onCaptureFailure != null) __obj.updateDynamic("onCaptureFailure")(js.Any.fromFunction1(onCaptureFailure))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactNativeViewShot.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ViewShotProperties
}

