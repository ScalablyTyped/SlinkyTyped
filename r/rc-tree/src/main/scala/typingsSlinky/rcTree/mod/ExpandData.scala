package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandData extends js.Object {
  var expanded: Boolean
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object ExpandData {
  @scala.inline
  def apply(expanded: Boolean, node: ReactComponentClass[InternalTreeNodeProps]): ExpandData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandData]
  }
}

