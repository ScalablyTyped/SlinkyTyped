package typingsSlinky.openjscad.anon

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var `class`: String = js.native
  var numPolygons: Double = js.native
  var numVerticesPerPolygon: js.typedarray.Uint32Array = js.native
  var planeData: js.typedarray.Float64Array = js.native
  var polygonPlaneIndexes: js.typedarray.Uint32Array = js.native
  var polygonSharedIndexes: js.typedarray.Uint32Array = js.native
  var polygonVertices: js.typedarray.Uint32Array = js.native
  var shared: js.Array[Shared] = js.native
  var vertexData: js.typedarray.Float64Array = js.native
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
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPolygons(value: Double): Self = this.set("numPolygons", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumVerticesPerPolygon(value: js.typedarray.Uint32Array): Self = this.set("numVerticesPerPolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaneData(value: js.typedarray.Float64Array): Self = this.set("planeData", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonPlaneIndexes(value: js.typedarray.Uint32Array): Self = this.set("polygonPlaneIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonSharedIndexes(value: js.typedarray.Uint32Array): Self = this.set("polygonSharedIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonVertices(value: js.typedarray.Uint32Array): Self = this.set("polygonVertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharedVarargs(value: Shared*): Self = this.set("shared", js.Array(value :_*))
    @scala.inline
    def setShared(value: js.Array[Shared]): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexData(value: js.typedarray.Float64Array): Self = this.set("vertexData", value.asInstanceOf[js.Any])
  }
  
}

