package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAddressBookRequest extends js.Object {
  /**
    * The ARN of the room to update.
    */
  var AddressBookArn: Arn = js.native
  /**
    * The updated description of the room.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  /**
    * The updated name of the room.
    */
  var Name: js.UndefOr[AddressBookName] = js.native
}

object UpdateAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): UpdateAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAddressBookRequest]
  }
  @scala.inline
  implicit class UpdateAddressBookRequestOps[Self <: UpdateAddressBookRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withName(value: AddressBookName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

