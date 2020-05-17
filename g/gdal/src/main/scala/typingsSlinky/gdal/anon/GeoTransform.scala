package typingsSlinky.gdal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoTransform extends js.Object {
  var geoTransform: js.Any = js.native
  var rasterSize: js.Any = js.native
}

object GeoTransform {
  @scala.inline
  def apply(geoTransform: js.Any, rasterSize: js.Any): GeoTransform = {
    val __obj = js.Dynamic.literal(geoTransform = geoTransform.asInstanceOf[js.Any], rasterSize = rasterSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoTransform]
  }
  @scala.inline
  implicit class GeoTransformOps[Self <: GeoTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRasterSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rasterSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

