package typingsSlinky.antDashDesignDashPro.libFooterToolbarMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterToolbarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: TagMod[Any]
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FooterToolbarProps {
  @scala.inline
  def apply(extra: TagMod[Any], className: String = null, style: CSSProperties = null): FooterToolbarProps = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterToolbarProps]
  }
}

