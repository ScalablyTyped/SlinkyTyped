package typingsSlinky.antd

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpanded extends js.Object {
  var expanded: Boolean = js.native
  var nativeEvent: MouseEvent = js.native
  var node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any = js.native
}

object AnonExpanded {
  @scala.inline
  def apply(
    expanded: Boolean,
    nativeEvent: MouseEvent,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): AnonExpanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpanded]
  }
  @scala.inline
  implicit class AnonExpandedOps[Self <: AnonExpanded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

