package typingsSlinky.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Child extends js.Object {
  var child: typingsSlinky.gatsby.mod.Node
  var parent: typingsSlinky.gatsby.mod.Node
}

object Child {
  @scala.inline
  def apply(child: typingsSlinky.gatsby.mod.Node, parent: typingsSlinky.gatsby.mod.Node): Child = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
}

