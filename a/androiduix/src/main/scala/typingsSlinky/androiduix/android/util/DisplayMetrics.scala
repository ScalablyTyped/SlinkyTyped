package typingsSlinky.androiduix.android.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayMetrics extends js.Object {
  var density: Double = js.native
  var densityDpi: Double = js.native
  var heightPixels: Double = js.native
  var scaledDensity: Double = js.native
  var widthPixels: Double = js.native
  var xdpi: Double = js.native
  var ydpi: Double = js.native
}

object DisplayMetrics {
  @scala.inline
  def apply(
    density: Double,
    densityDpi: Double,
    heightPixels: Double,
    scaledDensity: Double,
    widthPixels: Double,
    xdpi: Double,
    ydpi: Double
  ): DisplayMetrics = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], densityDpi = densityDpi.asInstanceOf[js.Any], heightPixels = heightPixels.asInstanceOf[js.Any], scaledDensity = scaledDensity.asInstanceOf[js.Any], widthPixels = widthPixels.asInstanceOf[js.Any], xdpi = xdpi.asInstanceOf[js.Any], ydpi = ydpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMetrics]
  }
  @scala.inline
  implicit class DisplayMetricsOps[Self <: DisplayMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDensityDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("densityDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaledDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaledDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXdpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xdpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYdpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ydpi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

