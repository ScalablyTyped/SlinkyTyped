package typingsSlinky.rcTree.mod

import slinky.core.ReactComponentClass
import typingsSlinky.rcTree.rcTreeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectData extends js.Object {
  var event: select
  var node: ReactComponentClass[InternalTreeNodeProps]
  var selected: Boolean
  var selectedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]]
}

object SelectData {
  @scala.inline
  def apply(
    event: select,
    node: ReactComponentClass[InternalTreeNodeProps],
    selected: Boolean,
    selectedNodes: js.Array[ReactComponentClass[InternalTreeNodeProps]]
  ): SelectData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectData]
  }
}

