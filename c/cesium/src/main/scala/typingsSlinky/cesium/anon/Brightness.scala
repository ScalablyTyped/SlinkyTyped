package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.ImageryLayer
import typingsSlinky.cesium.mod.ImageryLayer.ValueFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brightness extends js.Object {
  var alpha: js.UndefOr[Double | ValueFunc] = js.native
  var brightness: js.UndefOr[Double | ValueFunc] = js.native
  var contrast: js.UndefOr[Double | ValueFunc] = js.native
  var gamma: js.UndefOr[Double | ValueFunc] = js.native
  var hue: js.UndefOr[Double | ValueFunc] = js.native
  var maximumAnisotropy: js.UndefOr[Double] = js.native
  var maximumTerrainLevel: js.UndefOr[Double] = js.native
  var minimumTerrainLevel: js.UndefOr[Double] = js.native
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  var saturation: js.UndefOr[Double | ValueFunc] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object Brightness {
  @scala.inline
  def apply(): Brightness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brightness]
  }
  @scala.inline
  implicit class BrightnessOps[Self <: Brightness] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAlpha(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightnessFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withBrightness(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withContrast(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
    @scala.inline
    def withGammaFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGamma(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(js.undefined)
        ret
    }
    @scala.inline
    def withHueFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withHue(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAnisotropy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAnisotropy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAnisotropy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAnisotropy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumTerrainLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTerrainLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumTerrainLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumTerrainLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumTerrainLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTerrainLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumTerrainLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumTerrainLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: typingsSlinky.cesium.mod.Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturationFunction5(
      value: (/* frameState */ js.Any, /* layer */ ImageryLayer, /* x */ Double, /* y */ Double, /* level */ Double) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withSaturation(value: Double | ValueFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

