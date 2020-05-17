package typingsSlinky.nodeHueApi.anon

import typingsSlinky.nodeHueApi.mod.ColorMode
import typingsSlinky.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bri extends js.Object {
  var bri: Double = js.native
  var colormode: ColorMode = js.native
  var ct: Double = js.native
  var effect: LightEffect = js.native
  var hue: Double = js.native
  var on: Boolean = js.native
  var sat: Double = js.native
  var xy: js.Tuple2[Double, Double] = js.native
}

object Bri {
  @scala.inline
  def apply(
    bri: Double,
    colormode: ColorMode,
    ct: Double,
    effect: LightEffect,
    hue: Double,
    on: Boolean,
    sat: Double,
    xy: js.Tuple2[Double, Double]
  ): Bri = {
    val __obj = js.Dynamic.literal(bri = bri.asInstanceOf[js.Any], colormode = colormode.asInstanceOf[js.Any], ct = ct.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], sat = sat.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bri]
  }
  @scala.inline
  implicit class BriOps[Self <: Bri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBri(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColormode(value: ColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colormode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffect(value: LightEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXy(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

