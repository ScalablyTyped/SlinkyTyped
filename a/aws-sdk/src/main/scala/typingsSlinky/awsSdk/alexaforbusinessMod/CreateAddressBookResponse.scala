package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressBookResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
}

object CreateAddressBookResponse {
  @scala.inline
  def apply(): CreateAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressBookResponse]
  }
  @scala.inline
  implicit class CreateAddressBookResponseOps[Self <: CreateAddressBookResponse] (val x: Self) extends AnyVal {
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
    def withoutAddressBookArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressBookArn")(js.undefined)
        ret
    }
  }
  
}

