package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViterbiNode extends js.Object {
  var cost: Double = js.native
  var left_id: Double = js.native
  var length: Double = js.native
  var name: String = js.native
  var prev: ViterbiNode = js.native
  var right_id: Double = js.native
  var shortest_cost: Double = js.native
  var start_pos: Double = js.native
  var surface_form: String = js.native
  var `type`: String = js.native
}

object ViterbiNode {
  @scala.inline
  def apply(
    cost: Double,
    left_id: Double,
    length: Double,
    name: String,
    prev: ViterbiNode,
    right_id: Double,
    shortest_cost: Double,
    start_pos: Double,
    surface_form: String,
    `type`: String
  ): ViterbiNode = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], left_id = left_id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], right_id = right_id.asInstanceOf[js.Any], shortest_cost = shortest_cost.asInstanceOf[js.Any], start_pos = start_pos.asInstanceOf[js.Any], surface_form = surface_form.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiNode]
  }
  @scala.inline
  implicit class ViterbiNodeOps[Self <: ViterbiNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: ViterbiNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortest_cost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortest_cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurface_form(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface_form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

