package typingsSlinky.atReachSkipDashNav.atReachSkipDashNavMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipNavProps extends js.Object {
  var children: js.UndefOr[String | TagMod[Any]] = js.undefined
}

object SkipNavProps {
  @scala.inline
  def apply(children: String | TagMod[Any] = null): SkipNavProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipNavProps]
  }
}

