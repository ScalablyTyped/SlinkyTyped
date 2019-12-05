package typingsSlinky.openjscad.CSG

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyCSGFactory")
@js.native
class fuzzyCSGFactory () extends js.Object {
  var planefactory: fuzzyFactory = js.native
  var polygonsharedfactory: js.Any = js.native
  var vertexfactory: fuzzyFactory = js.native
  def getCSG(sourcecsg: typingsSlinky.openjscad.CSG): typingsSlinky.openjscad.CSG = js.native
  def getPlane(sourceplane: Plane): Plane = js.native
  def getPolygon(sourcepolygon: Polygon): Polygon = js.native
  def getPolygonShared(sourceshared: Shared): Shared = js.native
  def getVertex(sourcevertex: Vertex): Vertex = js.native
}

