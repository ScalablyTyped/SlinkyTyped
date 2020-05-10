package typingsSlinky.decimalJs.decimalGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://mikemcl.github.io/decimal.js/#constructor-properties
@js.native
trait DecimalConfig extends js.Object {
  var crypto: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var maxE: js.UndefOr[Double] = js.native
  var minE: js.UndefOr[Double] = js.native
  var modulo: js.UndefOr[DecimalModulo] = js.native
  var precision: js.UndefOr[Double] = js.native
  var rounding: js.UndefOr[DecimalRounding] = js.native
  var toExpNeg: js.UndefOr[Double] = js.native
  var toExpPos: js.UndefOr[Double] = js.native
}

object DecimalConfig {
  @scala.inline
  def apply(): DecimalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalConfig]
  }
  @scala.inline
  implicit class DecimalConfigOps[Self <: DecimalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrypto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrypto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxE")(js.undefined)
        ret
    }
    @scala.inline
    def withMinE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minE")(js.undefined)
        ret
    }
    @scala.inline
    def withModulo(value: DecimalModulo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRounding(value: DecimalRounding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRounding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(js.undefined)
        ret
    }
    @scala.inline
    def withToExpNeg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpNeg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToExpNeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpNeg")(js.undefined)
        ret
    }
    @scala.inline
    def withToExpPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToExpPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpPos")(js.undefined)
        ret
    }
  }
  
}

