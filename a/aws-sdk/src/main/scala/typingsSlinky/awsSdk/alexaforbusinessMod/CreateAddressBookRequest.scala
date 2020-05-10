package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressBookRequest extends js.Object {
  /**
    * A unique, user-specified identifier for the request that ensures idempotency.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  /**
    * The name of the address book.
    */
  var Name: AddressBookName = js.native
}

object CreateAddressBookRequest {
  @scala.inline
  def apply(Name: AddressBookName): CreateAddressBookRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAddressBookRequest]
  }
  @scala.inline
  implicit class CreateAddressBookRequestOps[Self <: CreateAddressBookRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: AddressBookName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: AddressBookDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

