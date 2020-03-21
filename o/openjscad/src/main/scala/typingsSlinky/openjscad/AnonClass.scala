package typingsSlinky.openjscad

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var `class`: String
  var numPolygons: Double
  var numVerticesPerPolygon: scala.scalajs.js.typedarray.Uint32Array
  var planeData: scala.scalajs.js.typedarray.Float64Array
  var polygonPlaneIndexes: scala.scalajs.js.typedarray.Uint32Array
  var polygonSharedIndexes: scala.scalajs.js.typedarray.Uint32Array
  var polygonVertices: scala.scalajs.js.typedarray.Uint32Array
  var shared: js.Array[Shared]
  var vertexData: scala.scalajs.js.typedarray.Float64Array
}

object AnonClass {
  @scala.inline
  def apply(
    `class`: String,
    numPolygons: Double,
    numVerticesPerPolygon: scala.scalajs.js.typedarray.Uint32Array,
    planeData: scala.scalajs.js.typedarray.Float64Array,
    polygonPlaneIndexes: scala.scalajs.js.typedarray.Uint32Array,
    polygonSharedIndexes: scala.scalajs.js.typedarray.Uint32Array,
    polygonVertices: scala.scalajs.js.typedarray.Uint32Array,
    shared: js.Array[Shared],
    vertexData: scala.scalajs.js.typedarray.Float64Array
  ): AnonClass = {
    val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

