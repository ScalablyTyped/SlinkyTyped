package typingsSlinky.antDesignReactNative.listItemMod

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.anon.PickListStyleBriefBriefTe
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typingsSlinky.antDesignReactNative.listPropsTypeMod.BriefProps
     with WithThemeStyles[PickListStyleBriefBriefTe]

object BriefProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    styles: Partial[PickListStyleBriefBriefTe] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

