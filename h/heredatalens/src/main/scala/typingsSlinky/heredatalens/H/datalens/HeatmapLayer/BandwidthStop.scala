package typingsSlinky.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the bandwidth for a given zoom level and uses this to calculate the increment or decrement of the bandwidth at other zoom levels
  * This object defines the behavior of the bandwidth value across all zoom levels, initialized by a reference zoom level and its value at that level.
  * The default behavior with zoomIncrementFactor = 1 doubles the bandwidth with every increasing zoom level and halves it on every decrease in zoom level.
  * For example, a bandwidth of 10@zoom1 turns to 20@zoom2 and 5@zoom0. A zoomIncrementFactor of 0 effectively equals the bandwidth number, ignoring the provided zoom level.
  * A zoomIncrementFactor of 0.5 mean a bandwidth increase of 50% compared to a factor of 1. So a bandwidth of 10@zoom1 computes to 15@zoom2.
  */
@js.native
trait BandwidthStop extends js.Object {
  var value: Double = js.native
  var zoom: Double = js.native
  var zoomIncrementFactor: js.UndefOr[Double] = js.native
}

object BandwidthStop {
  @scala.inline
  def apply(value: Double, zoom: Double): BandwidthStop = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandwidthStop]
  }
  @scala.inline
  implicit class BandwidthStopOps[Self <: BandwidthStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomIncrementFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIncrementFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomIncrementFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIncrementFactor")(js.undefined)
        ret
    }
  }
  
}

