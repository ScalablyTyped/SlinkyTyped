package typingsSlinky.openjscad

import typingsSlinky.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClass extends js.Object {
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

object AnonClass {
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
  ): AnonClass = {
    val __obj = js.Dynamic.literal(numPolygons = numPolygons.asInstanceOf[js.Any], numVerticesPerPolygon = numVerticesPerPolygon.asInstanceOf[js.Any], planeData = planeData.asInstanceOf[js.Any], polygonPlaneIndexes = polygonPlaneIndexes.asInstanceOf[js.Any], polygonSharedIndexes = polygonSharedIndexes.asInstanceOf[js.Any], polygonVertices = polygonVertices.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], vertexData = vertexData.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
  @scala.inline
  implicit class AnonClassOps[Self <: AnonClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPolygons(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumVerticesPerPolygon(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numVerticesPerPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaneData(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonPlaneIndexes(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonPlaneIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonSharedIndexes(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonSharedIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonVertices(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared(value: js.Array[Shared]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexData(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

