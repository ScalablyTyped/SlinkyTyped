package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.linear
import typingsSlinky.mapboxGl.mapboxGlStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterPaint extends AnyPaint {
  var `circle-sort-key`: js.UndefOr[Double] = js.native
  var `raster-brightness-max`: js.UndefOr[Double | Expression] = js.native
  var `raster-brightness-max-transition`: js.UndefOr[Transition] = js.native
  var `raster-brightness-min`: js.UndefOr[Double | Expression] = js.native
  var `raster-brightness-min-transition`: js.UndefOr[Transition] = js.native
  var `raster-contrast`: js.UndefOr[Double | Expression] = js.native
  var `raster-contrast-transition`: js.UndefOr[Transition] = js.native
  var `raster-fade-duration`: js.UndefOr[Double | Expression] = js.native
  var `raster-hue-rotate`: js.UndefOr[Double | Expression] = js.native
  var `raster-hue-rotate-transition`: js.UndefOr[Transition] = js.native
  var `raster-opacity`: js.UndefOr[Double | Expression] = js.native
  var `raster-opacity-transition`: js.UndefOr[Transition] = js.native
  var `raster-resampling`: js.UndefOr[linear | nearest] = js.native
  var `raster-saturation`: js.UndefOr[Double | Expression] = js.native
  var `raster-saturation-transition`: js.UndefOr[Transition] = js.native
}

object RasterPaint {
  @scala.inline
  def apply(): RasterPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterPaint]
  }
  @scala.inline
  implicit class RasterPaintOps[Self <: RasterPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withCircle-sort-key`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-sort-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCircle-sort-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle-sort-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-brightness-max`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-brightness-max`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-max")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-brightness-max-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-max-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-brightness-max-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-max-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-brightness-min`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-brightness-min`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-min")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-brightness-min-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-min-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-brightness-min-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-brightness-min-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-contrast`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-contrast`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-contrast")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-contrast-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-contrast-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-contrast-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-contrast-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-fade-duration`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-fade-duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-fade-duration`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-fade-duration")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-hue-rotate`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-hue-rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-hue-rotate`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-hue-rotate")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-hue-rotate-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-hue-rotate-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-hue-rotate-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-hue-rotate-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-opacity`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-opacity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-opacity")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-opacity-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-opacity-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-opacity-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-opacity-transition")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-resampling`(value: linear | nearest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-resampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-resampling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-resampling")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-saturation`(value: Double | Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-saturation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-saturation")(js.undefined)
        ret
    }
    @scala.inline
    def `withRaster-saturation-transition`(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-saturation-transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRaster-saturation-transition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raster-saturation-transition")(js.undefined)
        ret
    }
  }
  
}

