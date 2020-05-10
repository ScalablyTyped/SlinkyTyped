package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateContactFromAddressBookRequest extends js.Object {
  /**
    * The ARN of the address from which to disassociate the contact.
    */
  var AddressBookArn: Arn = js.native
  /**
    * The ARN of the contact to disassociate from an address book.
    */
  var ContactArn: Arn = js.native
}

object DisassociateContactFromAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn, ContactArn: Arn): DisassociateContactFromAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any], ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateContactFromAddressBookRequest]
  }
  @scala.inline
  implicit class DisassociateContactFromAddressBookRequestOps[Self <: DisassociateContactFromAddressBookRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withContactArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

