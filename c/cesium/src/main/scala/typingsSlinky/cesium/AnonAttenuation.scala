package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttenuation extends js.Object {
  var attenuation: js.UndefOr[Boolean] = js.native
  var backFaceCulling: js.UndefOr[Boolean] = js.native
  var baseResolution: js.UndefOr[Double] = js.native
  var eyeDomeLighting: js.UndefOr[Boolean] = js.native
  var eyeDomeLightingRadius: js.UndefOr[Double] = js.native
  var eyeDomeLightingStrength: js.UndefOr[Double] = js.native
  var geometricErrorScale: js.UndefOr[Double] = js.native
  var maximumAttenuation: js.UndefOr[Double] = js.native
  var normalShading: js.UndefOr[Boolean] = js.native
}

object AnonAttenuation {
  @scala.inline
  def apply(): AnonAttenuation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAttenuation]
  }
  @scala.inline
  implicit class AnonAttenuationOps[Self <: AnonAttenuation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttenuation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attenuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttenuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attenuation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackFaceCulling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backFaceCulling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackFaceCulling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backFaceCulling")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeDomeLighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeDomeLighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLighting")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeDomeLightingRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLightingRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeDomeLightingRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLightingRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withEyeDomeLightingStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLightingStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEyeDomeLightingStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeDomeLightingStrength")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometricErrorScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricErrorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometricErrorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometricErrorScale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAttenuation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAttenuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAttenuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAttenuation")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalShading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalShading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalShading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalShading")(js.undefined)
        ret
    }
  }
  
}

