package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ARTSurfaceProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ARTSurfaceProps2055821533[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    height: Double,
    width: Double,
    style: StyleProp[ViewStyle] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ARTSurfaceProps
}

