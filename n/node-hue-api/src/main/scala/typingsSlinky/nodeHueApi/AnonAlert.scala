package typingsSlinky.nodeHueApi

import typingsSlinky.nodeHueApi.mod.ColorMode
import typingsSlinky.nodeHueApi.mod.LightAlert
import typingsSlinky.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlert extends js.Object {
  var alert: LightAlert = js.native
  var bri: Double = js.native
  var colormode: js.UndefOr[ColorMode] = js.native
  var ct: js.UndefOr[Double] = js.native
  var effect: js.UndefOr[LightEffect] = js.native
  var hue: js.UndefOr[Double] = js.native
  var on: Boolean = js.native
  var reachable: Boolean = js.native
  var rgb: js.UndefOr[js.Array[Double]] = js.native
  var sat: js.UndefOr[Double] = js.native
  var xy: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object AnonAlert {
  @scala.inline
  def apply(alert: LightAlert, bri: Double, on: Boolean, reachable: Boolean): AnonAlert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], bri = bri.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
  @scala.inline
  implicit class AnonAlertOps[Self <: AnonAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: LightAlert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReachable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColormode(value: ColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colormode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColormode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colormode")(js.undefined)
        ret
    }
    @scala.inline
    def withCt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: LightEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
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
    def withRgb(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.undefined)
        ret
    }
    @scala.inline
    def withSat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sat")(js.undefined)
        ret
    }
    @scala.inline
    def withXy(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(js.undefined)
        ret
    }
  }
  
}

