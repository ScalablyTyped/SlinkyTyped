package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book to delete.
    */
  var AddressBookArn: Arn = js.native
}

object DeleteAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): DeleteAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAddressBookRequest]
  }
  @scala.inline
  implicit class DeleteAddressBookRequestOps[Self <: DeleteAddressBookRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressBookArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressBookArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

