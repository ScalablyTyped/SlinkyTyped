package typingsSlinky.expo.rootErrorBoundaryMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: TagMod[Any]
}

object Props {
  @scala.inline
  def apply(children: TagMod[Any]): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

