package typingsSlinky.adhan.mod

import typingsSlinky.adhan.anon.Asr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  var adjustments: Asr = js.native
  var fajrAngle: Double = js.native
  var highLatitudeRule: HighLatitudeRule = js.native
  var ishaAngle: Double = js.native
  var ishaInterval: Double = js.native
  var madhab: Madhab = js.native
  val method: String = js.native
}

object Parameter {
  @scala.inline
  def apply(
    adjustments: Asr,
    fajrAngle: Double,
    highLatitudeRule: HighLatitudeRule,
    ishaAngle: Double,
    ishaInterval: Double,
    madhab: Madhab,
    method: String
  ): Parameter = {
    val __obj = js.Dynamic.literal(adjustments = adjustments.asInstanceOf[js.Any], fajrAngle = fajrAngle.asInstanceOf[js.Any], highLatitudeRule = highLatitudeRule.asInstanceOf[js.Any], ishaAngle = ishaAngle.asInstanceOf[js.Any], ishaInterval = ishaInterval.asInstanceOf[js.Any], madhab = madhab.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustments(value: Asr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFajrAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fajrAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighLatitudeRule(value: HighLatitudeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highLatitudeRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIshaAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ishaAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIshaInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ishaInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMadhab(value: Madhab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("madhab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

