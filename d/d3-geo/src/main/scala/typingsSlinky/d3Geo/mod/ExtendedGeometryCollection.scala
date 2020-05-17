package typingsSlinky.d3Geo.mod

import typingsSlinky.d3Geo.anon.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends GeoPermissibleObjects {
  var bbox: js.UndefOr[js.Array[Double]] = js.native
  var crs: js.UndefOr[Properties] = js.native
  var geometries: js.Array[GeometryType] = js.native
  var `type`: String = js.native
}

object ExtendedGeometryCollection {
  @scala.inline
  def apply[GeometryType](geometries: js.Array[GeometryType], `type`: String): ExtendedGeometryCollection[GeometryType] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
  }
  @scala.inline
  implicit class ExtendedGeometryCollectionOps[Self[geometrytype] <: ExtendedGeometryCollection[geometrytype], GeometryType] (val x: Self[GeometryType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[GeometryType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[GeometryType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[GeometryType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[GeometryType] with Other]
    @scala.inline
    def withGeometries(value: js.Array[GeometryType]): Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: js.Array[Double]): Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCrs(value: Properties): Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self[GeometryType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
        ret
    }
  }
  
}

