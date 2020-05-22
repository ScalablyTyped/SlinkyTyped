package typingsSlinky.reactFocusLock.interfacesMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InFocusGuardProps extends js.Object {
  var children: TagMod[Any]
}

object InFocusGuardProps {
  @scala.inline
  def apply(children: TagMod[Any] = null): InFocusGuardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[InFocusGuardProps]
  }
}

