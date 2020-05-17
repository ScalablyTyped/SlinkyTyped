package typingsSlinky.asmcryptoJs.rsaMod

import typingsSlinky.asmcryptoJs.bignumMod.BigNumber
import typingsSlinky.asmcryptoJs.bignumMod.Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait key extends js.Object {
  var `0`: Modulus = js.native
  var `1`: BigNumber = js.native
  var `2`: js.UndefOr[BigNumber] = js.native
  var `3`: js.UndefOr[Modulus] = js.native
  var `4`: js.UndefOr[Modulus] = js.native
  var `5`: js.UndefOr[BigNumber] = js.native
  var `6`: js.UndefOr[BigNumber] = js.native
  var `7`: js.UndefOr[BigNumber] = js.native
}

object key {
  @scala.inline
  def apply(`0`: Modulus, `1`: BigNumber): key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[key]
  }
  @scala.inline
  implicit class keyOps[Self <: key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: Modulus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(js.undefined)
        ret
    }
    @scala.inline
    def with3(value: Modulus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(js.undefined)
        ret
    }
    @scala.inline
    def with4(value: Modulus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(js.undefined)
        ret
    }
    @scala.inline
    def with5(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(js.undefined)
        ret
    }
    @scala.inline
    def with6(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(js.undefined)
        ret
    }
    @scala.inline
    def with7(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(js.undefined)
        ret
    }
  }
  
}

