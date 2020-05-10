package typingsSlinky.arangodb.arangodbGeneralGraphMod

import typingsSlinky.arangodb.ArangoDB.Document
import typingsSlinky.arangodb.ArangoDB.Edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends js.Object {
  var destination: Document[B] = js.native
  var edges: js.Array[Edge[E]] = js.native
  var source: Document[A] = js.native
  var vertice: js.Array[Document[A | B | V]] = js.native
}

object Path {
  @scala.inline
  def apply[A, B, E, V](
    destination: Document[B],
    edges: js.Array[Edge[E]],
    source: Document[A],
    vertice: js.Array[Document[A | B | V]]
  ): Path[A, B, E, V] = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], vertice = vertice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[A, B, E, V]]
  }
  @scala.inline
  implicit class PathOps[Self[a, b, e, v] <: Path[a, b, e, v], A, B, E, V] (val x: Self[A, B, E, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, B, E, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, B, E, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, B, E, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, B, E, V]) with Other]
    @scala.inline
    def withDestination(value: Document[B]): Self[A, B, E, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[Edge[E]]): Self[A, B, E, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Document[A]): Self[A, B, E, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertice(value: js.Array[Document[A | B | V]]): Self[A, B, E, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

