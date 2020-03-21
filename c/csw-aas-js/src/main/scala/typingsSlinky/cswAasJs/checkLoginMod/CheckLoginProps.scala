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
  def apply(children: TagMod[Any], error: TagMod[Any]): CheckLoginProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckLoginProps]
  }
}

