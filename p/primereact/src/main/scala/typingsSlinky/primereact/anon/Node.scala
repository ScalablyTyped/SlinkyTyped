package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: js.Any
  var originalEvent: org.scalajs.dom.raw.Event
}

object Node {
  @scala.inline
  def apply(node: js.Any, originalEvent: org.scalajs.dom.raw.Event): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

