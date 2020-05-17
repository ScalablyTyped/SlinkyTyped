package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Triangulator extends js.Object {
  var convexPolygons: js.Any = js.native
  var convexPolygonsIndices: js.Any = js.native
  var indicesArray: js.Any = js.native
  var isConcaveArray: js.Any = js.native
  var polygonIndicesPool: js.Any = js.native
  var polygonPool: js.Any = js.native
  var triangles: js.Any = js.native
  def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double] = js.native
}

object Triangulator {
  @scala.inline
  def apply(
    convexPolygons: js.Any,
    convexPolygonsIndices: js.Any,
    decompose: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]],
    indicesArray: js.Any,
    isConcaveArray: js.Any,
    polygonIndicesPool: js.Any,
    polygonPool: js.Any,
    triangles: js.Any,
    triangulate: ArrayLike[Double] => js.Array[Double]
  ): Triangulator = {
    val __obj = js.Dynamic.literal(convexPolygons = convexPolygons.asInstanceOf[js.Any], convexPolygonsIndices = convexPolygonsIndices.asInstanceOf[js.Any], decompose = js.Any.fromFunction2(decompose), indicesArray = indicesArray.asInstanceOf[js.Any], isConcaveArray = isConcaveArray.asInstanceOf[js.Any], polygonIndicesPool = polygonIndicesPool.asInstanceOf[js.Any], polygonPool = polygonPool.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], triangulate = js.Any.fromFunction1(triangulate))
    __obj.asInstanceOf[Triangulator]
  }
  @scala.inline
  implicit class TriangulatorOps[Self <: Triangulator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvexPolygons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convexPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvexPolygonsIndices(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convexPolygonsIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecompose(value: (js.Array[Double], js.Array[Double]) => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIndicesArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicesArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConcaveArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConcaveArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonIndicesPool(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonIndicesPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonPool(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangulate(value: ArrayLike[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangulate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

