package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressRequest extends js.Object {
  /**
    * The address that you want the Snowball shipped to.
    */
  var Address: typingsSlinky.awsSdk.snowballMod.Address = js.native
}

object CreateAddressRequest {
  @scala.inline
  def apply(Address: Address): CreateAddressRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressRequest]
  }
  @scala.inline
  implicit class CreateAddressRequestOps[Self <: CreateAddressRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

