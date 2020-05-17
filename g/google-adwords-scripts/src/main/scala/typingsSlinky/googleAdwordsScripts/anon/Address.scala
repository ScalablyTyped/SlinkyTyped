package typingsSlinky.googleAdwordsScripts.anon

import typingsSlinky.googleAdwordsScripts.AddressObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: AddressObject = js.native
  var bidModifier: Double = js.native
}

object Address {
  @scala.inline
  def apply(address: AddressObject, bidModifier: Double): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bidModifier = bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: AddressObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBidModifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidModifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

