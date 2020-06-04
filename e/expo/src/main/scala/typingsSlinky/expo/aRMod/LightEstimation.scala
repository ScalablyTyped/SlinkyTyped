package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightEstimation extends js.Object {
  var ambientColorTemperature: Double
  var ambientIntensity: Double
  var primaryLightDirection: js.UndefOr[Vector3] = js.undefined
  var primaryLightIntensity: js.UndefOr[Double] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmbientColorTemperature(value: Double): Self = this.set("ambientColorTemperature", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmbientIntensity(value: Double): Self = this.set("ambientIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryLightDirection(value: Vector3): Self = this.set("primaryLightDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLightDirection: Self = this.set("primaryLightDirection", js.undefined)
    @scala.inline
    def setPrimaryLightIntensity(value: Double): Self = this.set("primaryLightIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryLightIntensity: Self = this.set("primaryLightIntensity", js.undefined)
  }
  
}

