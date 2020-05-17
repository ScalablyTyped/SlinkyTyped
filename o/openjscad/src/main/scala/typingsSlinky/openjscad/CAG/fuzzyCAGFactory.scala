package typingsSlinky.openjscad.CAG

import typingsSlinky.openjscad.CSG.fuzzyFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fuzzyCAGFactory extends js.Object {
  var vertexfactory: fuzzyFactory = js.native
  def getCAG(sourcecag: typingsSlinky.openjscad.CAG): typingsSlinky.openjscad.CAG = js.native
  def getSide(sourceside: Side): Side = js.native
  def getVertex(sourcevertex: Vertex): Vertex = js.native
}

object fuzzyCAGFactory {
  @scala.inline
  def apply(
    getCAG: typingsSlinky.openjscad.CAG => typingsSlinky.openjscad.CAG,
    getSide: Side => Side,
    getVertex: Vertex => Vertex,
    vertexfactory: fuzzyFactory
  ): fuzzyCAGFactory = {
    val __obj = js.Dynamic.literal(getCAG = js.Any.fromFunction1(getCAG), getSide = js.Any.fromFunction1(getSide), getVertex = js.Any.fromFunction1(getVertex), vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCAGFactory]
  }
  @scala.inline
  implicit class fuzzyCAGFactoryOps[Self <: fuzzyCAGFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCAG(value: typingsSlinky.openjscad.CAG => typingsSlinky.openjscad.CAG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCAG")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSide(value: Side => Side): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVertex(value: Vertex => Vertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVertexfactory(value: fuzzyFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexfactory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

