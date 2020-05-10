package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  /**
    * A string that uniquely identifies the edge within its graph.
    */
  var id: String = js.native
  /**
    * A short description of the edge.
    */
  var label: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the edge.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * Identifies the source node (the node at which the edge starts).
    */
  var sourceNodeId: String = js.native
  /**
    * Identifies the target node (the node at which the edge ends).
    */
  var targetNodeId: String = js.native
}

object Edge {
  @scala.inline
  def apply(id: String, sourceNodeId: String, targetNodeId: String): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceNodeId = sourceNodeId.asInstanceOf[js.Any], targetNodeId = targetNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetNodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

