package typingsSlinky.contractProxyKit.anon

import typingsSlinky.ethers.utilsMod.types.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressZero extends js.Object {
  var AddressZero: String = js.native
  var HashZero: String = js.native
  var NegativeOne: BigNumber = js.native
  var One: BigNumber = js.native
  var Two: BigNumber = js.native
  var WeiPerEther: BigNumber = js.native
  var Zero: BigNumber = js.native
}

object AddressZero {
  @scala.inline
  def apply(
    AddressZero: String,
    HashZero: String,
    NegativeOne: BigNumber,
    One: BigNumber,
    Two: BigNumber,
    WeiPerEther: BigNumber,
    Zero: BigNumber
  ): AddressZero = {
    val __obj = js.Dynamic.literal(AddressZero = AddressZero.asInstanceOf[js.Any], HashZero = HashZero.asInstanceOf[js.Any], NegativeOne = NegativeOne.asInstanceOf[js.Any], One = One.asInstanceOf[js.Any], Two = Two.asInstanceOf[js.Any], WeiPerEther = WeiPerEther.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressZero]
  }
  @scala.inline
  implicit class AddressZeroOps[Self <: AddressZero] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HashZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeOne(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NegativeOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOne(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("One")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwo(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Two")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeiPerEther(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeiPerEther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZero(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Zero")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

