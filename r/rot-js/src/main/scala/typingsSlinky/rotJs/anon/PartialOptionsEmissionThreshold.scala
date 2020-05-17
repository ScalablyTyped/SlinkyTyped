package typingsSlinky.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/lighting.Options> */
@js.native
trait PartialOptionsEmissionThreshold extends js.Object {
  var emissionThreshold: js.UndefOr[Double] = js.native
  var passes: js.UndefOr[Double] = js.native
  var range: js.UndefOr[Double] = js.native
}

object PartialOptionsEmissionThreshold {
  @scala.inline
  def apply(): PartialOptionsEmissionThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsEmissionThreshold]
  }
  @scala.inline
  implicit class PartialOptionsEmissionThresholdOps[Self <: PartialOptionsEmissionThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmissionThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmissionThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emissionThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withPasses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

