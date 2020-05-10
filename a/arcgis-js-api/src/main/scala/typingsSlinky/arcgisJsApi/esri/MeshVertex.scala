package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshVertex extends Object {
  /**
    * The distance parameter for this vertex; this only applies when tessellating polylines. It starts from 0 and runs up to the total length of the polyline. It is expressed in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var distance: Double = js.native
  /**
    * The `u`-coordinate for texture mapping. It varies between 0 and 1 horizontally for quads and polygons, and along the entire length of a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var uTexcoord: Double = js.native
  /**
    * The `v`-coordinate for texture mapping. It varies between 0 and 1 vertically for quads and polygons, and across the width of a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var vTexcoord: Double = js.native
  /**
    * The `x`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var x: Double = js.native
  /**
    * The `x`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var xOffset: Double = js.native
  /**
    * The `y`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var y: Double = js.native
  /**
    * The `y`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var yOffset: Double = js.native
}

object MeshVertex {
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    uTexcoord: Double,
    vTexcoord: Double,
    x: Double,
    xOffset: Double,
    y: Double,
    yOffset: Double
  ): MeshVertex = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), uTexcoord = uTexcoord.asInstanceOf[js.Any], vTexcoord = vTexcoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertex]
  }
  @scala.inline
  implicit class MeshVertexOps[Self <: MeshVertex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUTexcoord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uTexcoord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVTexcoord(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vTexcoord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

