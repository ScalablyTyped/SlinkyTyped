package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonProperties extends GeometryProperties {
  /**
    * The centroid of the polygon. For a polygon with multiple rings, it represents the centroid of the largest ring.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
    */
  var centroid: js.UndefOr[PointProperties] = js.native
  /**
    * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
    */
  var isSelfIntersecting: js.UndefOr[Boolean] = js.native
  /**
    * An array of rings. Each ring is a two-dimensional array of numbers representing the coordinates of each vertex in the ring in the spatial reference of the view. The first vertex of each ring should always be the same as the last vertex. Each vertex is an array of two, three, or four numbers. The table below shows the various structures of a vertex array.
    *
    * Case | Vertex array
    * --- | ---
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM)| [x, y]
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, m]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z, m]
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
    */
  var rings: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
}

object PolygonProperties {
  @scala.inline
  def apply(): PolygonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonProperties]
  }
  @scala.inline
  implicit class PolygonPropertiesOps[Self <: PolygonProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentroid(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centroid")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelfIntersecting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelfIntersecting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelfIntersecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelfIntersecting")(js.undefined)
        ret
    }
    @scala.inline
    def withRings(value: js.Array[js.Array[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rings")(js.undefined)
        ret
    }
  }
  
}

