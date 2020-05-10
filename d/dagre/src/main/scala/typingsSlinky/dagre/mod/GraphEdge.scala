package typingsSlinky.dagre.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dagre.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphEdge
  extends /* key */ StringDictionary[js.Any] {
  var points: js.Array[AnonX] = js.native
}

object GraphEdge {
  @scala.inline
  def apply(points: js.Array[AnonX]): GraphEdge = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphEdge]
  }
  @scala.inline
  implicit class GraphEdgeOps[Self <: GraphEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[AnonX]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

