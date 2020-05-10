package typingsSlinky.bitcoinjsLib.psbtMod

import typingsSlinky.bip174.interfacesMod.PsbtOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtOutputExtendedAddress
  extends PsbtOutput
     with PsbtOutputExtended {
  var address: String = js.native
  var value: Double = js.native
}

object PsbtOutputExtendedAddress {
  @scala.inline
  def apply(address: String, value: Double): PsbtOutputExtendedAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtendedAddress]
  }
  @scala.inline
  implicit class PsbtOutputExtendedAddressOps[Self <: PsbtOutputExtendedAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

