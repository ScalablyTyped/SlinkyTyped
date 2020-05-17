package typingsSlinky.antd.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.antd.antdStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var event: select = js.native
  var nativeEvent: MouseEvent = js.native
  var node: js.Any = js.native
  var selected: Boolean = js.native
  var selectedNodes: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
  ] = js.native
}

object Event {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: js.Any,
    selected: Boolean,
    selectedNodes: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ]
  ): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: select): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedNodes(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

