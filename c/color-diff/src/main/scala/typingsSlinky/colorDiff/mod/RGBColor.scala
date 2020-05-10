package typingsSlinky.colorDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColor extends js.Object {
  var A: js.UndefOr[Double] = js.native
  var B: Double = js.native
  var G: Double = js.native
  var R: Double = js.native
}

object RGBColor {
  @scala.inline
  def apply(B: Double, G: Double, R: Double): RGBColor = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  @scala.inline
  implicit class RGBColorOps[Self <: RGBColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("B")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("G")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A")(js.undefined)
        ret
    }
  }
  
}

