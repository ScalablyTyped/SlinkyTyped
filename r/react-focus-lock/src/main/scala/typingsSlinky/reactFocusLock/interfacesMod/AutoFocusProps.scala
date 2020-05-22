package typingsSlinky.reactFocusLock.interfacesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFocusProps extends js.Object {
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
}

object AutoFocusProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, className: String = null): AutoFocusProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocusProps]
  }
}

