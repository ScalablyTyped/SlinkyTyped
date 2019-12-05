package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.lg
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.md
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sm
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xl
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xs
import typingsSlinky.atAntDashDesignReactDashNative.libWhiteDashSpaceMod.WhiteSpaceProps
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_WhiteSpaceProps1456367875[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    size: xs | sm | md | lg | xl = null,
    style: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = WhiteSpaceProps
}

