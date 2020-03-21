package typingsSlinky.rcFieldForm

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChild extends js.Object {
  var child: TagMod[Any]
  var isFunction: Boolean
}

object AnonChild {
  @scala.inline
  def apply(child: TagMod[Any], isFunction: Boolean): AnonChild = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], isFunction = isFunction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChild]
  }
}

