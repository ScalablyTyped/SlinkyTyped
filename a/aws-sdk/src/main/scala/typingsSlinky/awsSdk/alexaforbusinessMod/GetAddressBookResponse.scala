package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAddressBookResponse extends js.Object {
  /**
    * The details of the requested address book.
    */
  var AddressBook: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.AddressBook] = js.native
}

object GetAddressBookResponse {
  @scala.inline
  def apply(): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAddressBookResponse]
  }
  @scala.inline
  implicit class GetAddressBookResponseOps[Self <: GetAddressBookResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressBook(value: AddressBook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressBook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressBook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressBook")(js.undefined)
        ret
    }
  }
  
}

