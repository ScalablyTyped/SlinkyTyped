package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenReactNode extends js.Object {
  var children: TagMod[Any]
  var key: Double
}

object AnonChildrenReactNode {
  @scala.inline
  def apply(children: TagMod[Any], key: Double): AnonChildrenReactNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenReactNode]
  }
}

