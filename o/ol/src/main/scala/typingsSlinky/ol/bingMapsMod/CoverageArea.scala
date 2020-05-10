package typingsSlinky.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageArea extends js.Object {
  var bbox: js.Array[Double] = js.native
  var zoomMax: Double = js.native
  var zoomMin: Double = js.native
}

object CoverageArea {
  @scala.inline
  def apply(bbox: js.Array[Double], zoomMax: Double, zoomMin: Double): CoverageArea = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageArea]
  }
  @scala.inline
  implicit class CoverageAreaOps[Self <: CoverageArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBbox(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

