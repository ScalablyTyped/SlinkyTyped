package typingsSlinky.openjscad.anon

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var `class`: String
  var numPolygons: Double
  var numVerticesPerPolygon: js.typedarray.Uint32Array
  var planeData: js.typedarray.Float64Array
  var polygonPlaneIndexes: js.typedarray.Uint32Array
  var polygonSharedIndexes: js.typedarray.Uint32Array
  var polygonVertices: js.typedarray.Uint32Array
  var shared: js.Array[Shared]
  var vertexData: js.typedarray.Float64Array
}

object Class {
  @scala.inline
  def apply(
    `class`: String,
    numPolygons: Double,
    numVerticesPerPolygon: js.typedarray.Uint32Array,
    planeData: js.typedarray.Float64Array,
    polygonPlaneIndexes: js.typedarray.Uint32Array,
    polygonSharedIndexes: js.typedarray.Uint32Array,
    polygonVertices: js.typedarray.Uint32Array,
    shared: js.Array[Shared],
    vertexData: js.typedarray.Float64Array
  ): Class = {
    val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

