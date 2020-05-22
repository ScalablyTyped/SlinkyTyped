package typingsSlinky.rcTree.mod

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEnterData extends js.Object {
  var event: Event
  var expandedKeys: js.Array[String]
  var node: ReactComponentClass[InternalTreeNodeProps]
}

object OnDragEnterData {
  @scala.inline
  def apply(event: Event, expandedKeys: js.Array[String], node: ReactComponentClass[InternalTreeNodeProps]): OnDragEnterData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragEnterData]
  }
}

