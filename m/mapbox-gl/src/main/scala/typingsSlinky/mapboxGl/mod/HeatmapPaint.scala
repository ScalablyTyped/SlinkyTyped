package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapPaint extends AnyPaint {
  var `heatmap-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  var `heatmap-intensity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `heatmap-intensity-transition`: js.UndefOr[Transition] = js.native
  var `heatmap-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `heatmap-opacity-transition`: js.UndefOr[Transition] = js.native
  var `heatmap-radius`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  var `heatmap-radius-transition`: js.UndefOr[Transition] = js.native
  var `heatmap-weight`: js.UndefOr[Double | StyleFunction | Expression] = js.native
}

object HeatmapPaint {
  @scala.inline
  def apply(): HeatmapPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapPaint]
  }
  @scala.inline
  implicit class HeatmapPaintOps[Self <: HeatmapPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withHeatmap-color`(value: String | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-intensity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-intensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-intensity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-intensity")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-intensity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-intensity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-intensity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-intensity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-opacity`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-radius`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-radius`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-radius")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-radius-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-radius-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-radius-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-radius-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withHeatmap-weight`(value: Double | StyleFunction | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutHeatmap-weight`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatmap-weight")(js.undefined)
        ret
    }
  }
  
}

