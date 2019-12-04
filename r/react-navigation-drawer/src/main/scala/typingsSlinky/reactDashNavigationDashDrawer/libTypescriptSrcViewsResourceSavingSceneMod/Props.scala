package typingsSlinky.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
  var isVisible: Boolean
  var style: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any], isVisible: Boolean, style: js.Any = null): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

