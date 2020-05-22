package typingsSlinky.openjscad.global.CSG

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.fuzzyCSGFactory")
@js.native
class fuzzyCSGFactory ()
  extends typingsSlinky.openjscad.CSG.fuzzyCSGFactory {
  /* CompleteClass */
  override var planefactory: typingsSlinky.openjscad.CSG.fuzzyFactory = js.native
  /* CompleteClass */
  override var polygonsharedfactory: js.Any = js.native
  /* CompleteClass */
  override var vertexfactory: typingsSlinky.openjscad.CSG.fuzzyFactory = js.native
  /* CompleteClass */
  override def getCSG(sourcecsg: typingsSlinky.openjscad.CSG): typingsSlinky.openjscad.CSG = js.native
  /* CompleteClass */
  override def getPlane(sourceplane: typingsSlinky.openjscad.CSG.Plane): typingsSlinky.openjscad.CSG.Plane = js.native
  /* CompleteClass */
  override def getPolygon(sourcepolygon: typingsSlinky.openjscad.CSG.Polygon): typingsSlinky.openjscad.CSG.Polygon = js.native
  /* CompleteClass */
  override def getPolygonShared(sourceshared: Shared): Shared = js.native
  /* CompleteClass */
  override def getVertex(sourcevertex: typingsSlinky.openjscad.CSG.Vertex): typingsSlinky.openjscad.CSG.Vertex = js.native
}

