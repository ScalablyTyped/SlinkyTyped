package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoChartMagnifyingGlass extends js.Object {
  var enable: js.UndefOr[Boolean] = js.native
  var zoomFactor: js.UndefOr[Double] = js.native
}

object GeoChartMagnifyingGlass {
  @scala.inline
  def apply(): GeoChartMagnifyingGlass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoChartMagnifyingGlass]
  }
  @scala.inline
  implicit class GeoChartMagnifyingGlassOps[Self <: GeoChartMagnifyingGlass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

