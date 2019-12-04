package typingsSlinky.reactDashNativeDashViewDashShot.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.CaptureOptions
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.ViewShotProperties
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotMod.default
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.continuous
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.mount
import typingsSlinky.reactDashNativeDashViewDashShot.reactDashNativeDashViewDashShotStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashViewDashShot
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
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (captureMode != null) __obj.updateDynamic("captureMode")(captureMode.asInstanceOf[js.Any])
    if (onCapture != null) __obj.updateDynamic("onCapture")(js.Any.fromFunction1(onCapture))
    if (onCaptureFailure != null) __obj.updateDynamic("onCaptureFailure")(js.Any.fromFunction1(onCaptureFailure))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ViewShotProperties
}

