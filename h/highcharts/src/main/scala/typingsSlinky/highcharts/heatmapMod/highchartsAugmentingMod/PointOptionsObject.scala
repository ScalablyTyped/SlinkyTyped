package typingsSlinky.highcharts.heatmapMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptionsObject extends js.Object {
  /**
    * Heatmap series only. Point padding for a single point.
    */
  var pointPadding: js.UndefOr[Double] = js.native
  /**
    * Heatmap series only. The value of the point, resulting in a color
    * controled by options as set in the colorAxis configuration.
    */
  var value: js.UndefOr[Double | Null] = js.native
}

object PointOptionsObject {
  @scala.inline
  def apply(): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptionsObject]
  }
  @scala.inline
  implicit class PointOptionsObjectOps[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

