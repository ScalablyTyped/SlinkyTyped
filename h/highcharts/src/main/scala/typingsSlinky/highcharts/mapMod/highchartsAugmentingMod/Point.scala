package typingsSlinky.highcharts.mapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var pointPadding: js.UndefOr[Double] = js.native
  /**
    * In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's
    * properies are copied over here.
    */
  var properties: js.Any = js.native
  var value: js.UndefOr[Double | Null] = js.native
  /**
    * Highmaps only. Zoom in on the point using the global animation.
    */
  def zoomTo(): Unit = js.native
}

object Point {
  @scala.inline
  def apply(properties: js.Any, zoomTo: () => Unit): Point = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], zoomTo = js.Any.fromFunction0(zoomTo))
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPointPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

