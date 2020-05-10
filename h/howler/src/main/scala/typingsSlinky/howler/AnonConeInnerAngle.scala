package typingsSlinky.howler

import typingsSlinky.howler.howlerStrings.HRTF
import typingsSlinky.howler.howlerStrings.equalpower
import typingsSlinky.howler.howlerStrings.inverse
import typingsSlinky.howler.howlerStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConeInnerAngle extends js.Object {
  var coneInnerAngle: js.UndefOr[Double] = js.native
  var coneOuterAngle: js.UndefOr[Double] = js.native
  var coneOuterGain: js.UndefOr[Double] = js.native
  var distanceModel: inverse | linear = js.native
  var maxDistance: Double = js.native
  var panningModel: HRTF | equalpower = js.native
  var refDistance: Double = js.native
  var rolloffFactor: Double = js.native
}

object AnonConeInnerAngle {
  @scala.inline
  def apply(
    distanceModel: inverse | linear,
    maxDistance: Double,
    panningModel: HRTF | equalpower,
    refDistance: Double,
    rolloffFactor: Double
  ): AnonConeInnerAngle = {
    val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance.asInstanceOf[js.Any], rolloffFactor = rolloffFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConeInnerAngle]
  }
  @scala.inline
  implicit class AnonConeInnerAngleOps[Self <: AnonConeInnerAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceModel(value: inverse | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanningModel(value: HRTF | equalpower): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRolloffFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloffFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConeInnerAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneInnerAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeInnerAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneInnerAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withConeOuterAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeOuterAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withConeOuterGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeOuterGain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterGain")(js.undefined)
        ret
    }
  }
  
}

