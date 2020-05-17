package typingsSlinky.openjscad.CAG

import typingsSlinky.openjscad.CSG.Vector2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vertex extends js.Object {
  var pos: Vector2D = js.native
  var tag: Double = js.native
  def getTag(): Double = js.native
}

object Vertex {
  @scala.inline
  def apply(getTag: () => Double, pos: Vector2D, tag: Double): Vertex = {
    val __obj = js.Dynamic.literal(getTag = js.Any.fromFunction0(getTag), pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
  @scala.inline
  implicit class VertexOps[Self <: Vertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTag(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPos(value: Vector2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

