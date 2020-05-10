package typingsSlinky.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  var distance: Double = js.native
  var startVertex: String = js.native
  var vertex: String = js.native
}

object Distance {
  @scala.inline
  def apply(distance: Double, startVertex: String, vertex: String): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], startVertex = startVertex.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartVertex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

