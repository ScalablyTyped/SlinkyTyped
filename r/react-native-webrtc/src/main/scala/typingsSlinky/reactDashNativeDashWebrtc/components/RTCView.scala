package typingsSlinky.reactDashNativeDashWebrtc.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod.RTCViewProps
import typingsSlinky.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcStrings.contain
import typingsSlinky.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RTCView
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod.RTCView
    ] {
  @JSImport("react-native-webrtc", "RTCView")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    streamURL: String,
    mirror: js.UndefOr[Boolean] = js.undefined,
    objectFit: contain | cover = null,
    style: ViewStyle = null,
    zOrder: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod.RTCView
  ] = {
    val __obj = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (objectFit != null) __obj.updateDynamic("objectFit")(objectFit.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (zOrder != null) __obj.updateDynamic("zOrder")(zOrder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RTCViewProps
}

