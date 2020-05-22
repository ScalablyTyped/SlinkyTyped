package typingsSlinky.cswAasJs.checkLoginMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckLoginProps extends js.Object {
  var children: TagMod[Any]
  var error: TagMod[Any]
}

object CheckLoginProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, error: TagMod[Any] = null): CheckLoginProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckLoginProps]
  }
}

