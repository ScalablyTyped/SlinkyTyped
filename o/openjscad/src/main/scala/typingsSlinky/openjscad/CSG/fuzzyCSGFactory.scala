package typingsSlinky.openjscad.CSG

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fuzzyCSGFactory extends js.Object {
  var planefactory: fuzzyFactory = js.native
  var polygonsharedfactory: js.Any = js.native
  var vertexfactory: fuzzyFactory = js.native
  def getCSG(sourcecsg: typingsSlinky.openjscad.CSG): typingsSlinky.openjscad.CSG = js.native
  def getPlane(sourceplane: Plane): Plane = js.native
  def getPolygon(sourcepolygon: Polygon): Polygon = js.native
  def getPolygonShared(sourceshared: Shared): Shared = js.native
  def getVertex(sourcevertex: Vertex): Vertex = js.native
}

object fuzzyCSGFactory {
  @scala.inline
  def apply(
    getCSG: typingsSlinky.openjscad.CSG => typingsSlinky.openjscad.CSG,
    getPlane: Plane => Plane,
    getPolygon: Polygon => Polygon,
    getPolygonShared: Shared => Shared,
    getVertex: Vertex => Vertex,
    planefactory: fuzzyFactory,
    polygonsharedfactory: js.Any,
    vertexfactory: fuzzyFactory
  ): fuzzyCSGFactory = {
    val __obj = js.Dynamic.literal(getCSG = js.Any.fromFunction1(getCSG), getPlane = js.Any.fromFunction1(getPlane), getPolygon = js.Any.fromFunction1(getPolygon), getPolygonShared = js.Any.fromFunction1(getPolygonShared), getVertex = js.Any.fromFunction1(getVertex), planefactory = planefactory.asInstanceOf[js.Any], polygonsharedfactory = polygonsharedfactory.asInstanceOf[js.Any], vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCSGFactory]
  }
  @scala.inline
  implicit class fuzzyCSGFactoryOps[Self <: fuzzyCSGFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCSG(value: typingsSlinky.openjscad.CSG => typingsSlinky.openjscad.CSG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCSG")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPlane(value: Plane => Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPolygon(value: Polygon => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPolygonShared(value: Shared => Shared): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygonShared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVertex(value: Vertex => Vertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlanefactory(value: fuzzyFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planefactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonsharedfactory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonsharedfactory")(value.asInstanceOf[js.Any])
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

