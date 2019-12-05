package typingsSlinky.atAntDashDesignReactDashNative.libWhiteDashSpaceMod

import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.lg
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.md
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sm
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xl
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.xs
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: StyleProp[ViewStyle] = null): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

