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
  @scala.inline
  implicit class OnDragEnterDataOps[Self <: OnDragEnterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent(value: Event): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: String*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[String]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: ReactComponentClass[InternalTreeNodeProps]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

