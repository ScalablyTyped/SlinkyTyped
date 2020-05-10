package typingsSlinky.reactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlue extends js.Object {
  var blue: js.UndefOr[Double] = js.native
  var brighten: js.UndefOr[Double] = js.native
  var darken: js.UndefOr[Double] = js.native
  var desaturate: js.UndefOr[Double] = js.native
  var green: js.UndefOr[Double] = js.native
  var greyscale: js.UndefOr[Double] = js.native
  var lighten: js.UndefOr[Double] = js.native
  var mix: js.UndefOr[AnonAmount] = js.native
  var red: js.UndefOr[Double] = js.native
  var saturate: js.UndefOr[Double] = js.native
  var shade: js.UndefOr[Double] = js.native
  var spin: js.UndefOr[Double] = js.native
  var tint: js.UndefOr[Double] = js.native
  var xor: js.UndefOr[Double] = js.native
}

object AnonBlue {
  @scala.inline
  def apply(): AnonBlue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBlue]
  }
  @scala.inline
  implicit class AnonBlueOps[Self <: AnonBlue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withBrighten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brighten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrighten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brighten")(js.undefined)
        ret
    }
    @scala.inline
    def withDarken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darken")(js.undefined)
        ret
    }
    @scala.inline
    def withDesaturate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desaturate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesaturate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desaturate")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withGreyscale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreyscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greyscale")(js.undefined)
        ret
    }
    @scala.inline
    def withLighten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighten")(js.undefined)
        ret
    }
    @scala.inline
    def withMix(value: AnonAmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mix")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturate")(js.undefined)
        ret
    }
    @scala.inline
    def withShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shade")(js.undefined)
        ret
    }
    @scala.inline
    def withSpin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spin")(js.undefined)
        ret
    }
    @scala.inline
    def withTint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tint")(js.undefined)
        ret
    }
    @scala.inline
    def withXor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xor")(js.undefined)
        ret
    }
  }
  
}

