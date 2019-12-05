package typingsSlinky.antdDashMobileDashRn.libListListItemDotNativeMod

import slinky.core.TagMod
import typingsSlinky.antdDashMobileDashRn.Anon_Brief
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typingsSlinky.antdDashMobileDashRn.libListPropsTypeMod.BriefProps {
  var styles: js.UndefOr[Anon_Brief] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    styles: Anon_Brief = null,
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

