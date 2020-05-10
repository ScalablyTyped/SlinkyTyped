package typingsSlinky.jsgraph

import typingsSlinky.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonG extends js.Object {
  var g: DirectedGraph = js.native
  var u: String = js.native
}

object AnonG {
  @scala.inline
  def apply(g: DirectedGraph, u: String): AnonG = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonG]
  }
  @scala.inline
  implicit class AnonGOps[Self <: AnonG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG(value: DirectedGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

