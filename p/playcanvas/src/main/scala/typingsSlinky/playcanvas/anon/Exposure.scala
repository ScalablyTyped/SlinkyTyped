package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exposure extends js.Object {
  var exposure: Double = js.native
  var fog: String = js.native
  var fog_color: js.Array[Double] = js.native
  var fog_density: Double = js.native
  var fog_end: Double = js.native
  var fog_start: Double = js.native
  var gamma_correction: Double = js.native
  var global_ambient: js.Array[Double] = js.native
  var lightmapMaxResolution: Double = js.native
  var lightmapMode: Double = js.native
  var lightmapSizeMultiplier: Double = js.native
  var skybox: js.UndefOr[Double | Null] = js.native
  var skyboxIntensity: Double = js.native
  var skyboxMip: Double = js.native
  var tonemapping: Double = js.native
}

object Exposure {
  @scala.inline
  def apply(
    exposure: Double,
    fog: String,
    fog_color: js.Array[Double],
    fog_density: Double,
    fog_end: Double,
    fog_start: Double,
    gamma_correction: Double,
    global_ambient: js.Array[Double],
    lightmapMaxResolution: Double,
    lightmapMode: Double,
    lightmapSizeMultiplier: Double,
    skyboxIntensity: Double,
    skyboxMip: Double,
    tonemapping: Double
  ): Exposure = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], fog = fog.asInstanceOf[js.Any], fog_color = fog_color.asInstanceOf[js.Any], fog_density = fog_density.asInstanceOf[js.Any], fog_end = fog_end.asInstanceOf[js.Any], fog_start = fog_start.asInstanceOf[js.Any], gamma_correction = gamma_correction.asInstanceOf[js.Any], global_ambient = global_ambient.asInstanceOf[js.Any], lightmapMaxResolution = lightmapMaxResolution.asInstanceOf[js.Any], lightmapMode = lightmapMode.asInstanceOf[js.Any], lightmapSizeMultiplier = lightmapSizeMultiplier.asInstanceOf[js.Any], skyboxIntensity = skyboxIntensity.asInstanceOf[js.Any], skyboxMip = skyboxMip.asInstanceOf[js.Any], tonemapping = tonemapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exposure]
  }
  @scala.inline
  implicit class ExposureOps[Self <: Exposure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog_color(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog_density(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog_density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFog_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fog_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamma_correction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma_correction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal_ambient(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global_ambient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightmapMaxResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmapMaxResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightmapMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightmapSizeMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightmapSizeMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkyboxIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkyboxMip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skyboxMip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTonemapping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tonemapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkybox(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skybox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkybox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skybox")(js.undefined)
        ret
    }
    @scala.inline
    def withSkyboxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skybox")(null)
        ret
    }
  }
  
}

