package typingsSlinky.arangodb.arangodbGeneralGraphMod

import typingsSlinky.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortestPath[T /* <: js.Object */] extends js.Object {
  var distance: Double = js.native
  var edges: js.Array[Edge[T]] = js.native
  var vertices: js.Array[String] = js.native
}

object ShortestPath {
  @scala.inline
  def apply[T](distance: Double, edges: js.Array[Edge[T]], vertices: js.Array[String]): ShortestPath[T] = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortestPath[T]]
  }
  @scala.inline
  implicit class ShortestPathOps[Self[t] <: ShortestPath[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDistance(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[Edge[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

