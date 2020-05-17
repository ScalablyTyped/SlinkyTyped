package typingsSlinky.gyronorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alpha extends js.Object {
  var alpha: Double = js.native
  var beta: Double = js.native
  var gamma: Double = js.native
  var gx: Double = js.native
  var gy: Double = js.native
  var gz: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

object Alpha {
  @scala.inline
  def apply(
    alpha: Double,
    beta: Double,
    gamma: Double,
    gx: Double,
    gy: Double,
    gz: Double,
    x: Double,
    y: Double,
    z: Double
  ): Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], gx = gx.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any], gz = gz.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGamma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

