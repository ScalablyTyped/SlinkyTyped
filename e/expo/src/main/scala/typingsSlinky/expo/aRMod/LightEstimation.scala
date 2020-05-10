package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightEstimation extends js.Object {
  var ambientColorTemperature: Double = js.native
  var ambientIntensity: Double = js.native
  var primaryLightDirection: js.UndefOr[Vector3] = js.native
  var primaryLightIntensity: js.UndefOr[Double] = js.native
}

object LightEstimation {
  @scala.inline
  def apply(ambientColorTemperature: Double, ambientIntensity: Double): LightEstimation = {
    val __obj = js.Dynamic.literal(ambientColorTemperature = ambientColorTemperature.asInstanceOf[js.Any], ambientIntensity = ambientIntensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightEstimation]
  }
  @scala.inline
  implicit class LightEstimationOps[Self <: LightEstimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbientColorTemperature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientColorTemperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmbientIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambientIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryLightDirection(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLightDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLightDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLightDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryLightIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLightIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLightIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLightIntensity")(js.undefined)
        ret
    }
  }
  
}

