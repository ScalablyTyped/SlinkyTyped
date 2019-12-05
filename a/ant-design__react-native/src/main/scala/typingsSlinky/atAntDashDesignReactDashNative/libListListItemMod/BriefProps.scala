package typingsSlinky.atAntDashDesignReactDashNative.libListListItemMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.PickListStyleBriefBriefText
import typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typingsSlinky.atAntDashDesignReactDashNative.libListPropsTypeMod.BriefProps
     with WithThemeStyles[PickListStyleBriefBriefText]

object BriefProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    style: StyleProp[TextStyle] = null,
    styles: Partial[PickListStyleBriefBriefText] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

