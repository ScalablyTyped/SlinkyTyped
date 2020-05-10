package typingsSlinky.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStatus extends js.Object {
  /** Selects the icon color. */
  var fill: StatusFill = js.native
  /** Selects either ring or dot shape. */
  var shape: StatusShape = js.native
  /** Status label. */
  var text: String = js.native
}

object NodeStatus {
  @scala.inline
  def apply(fill: StatusFill, shape: StatusShape, text: String): NodeStatus = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatus]
  }
  @scala.inline
  implicit class NodeStatusOps[Self <: NodeStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: StatusFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: StatusShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

