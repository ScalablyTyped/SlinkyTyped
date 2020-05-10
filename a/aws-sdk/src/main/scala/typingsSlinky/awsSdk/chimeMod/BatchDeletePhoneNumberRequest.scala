package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeletePhoneNumberRequest extends js.Object {
  /**
    * List of phone number IDs.
    */
  var PhoneNumberIds: NonEmptyStringList = js.native
}

object BatchDeletePhoneNumberRequest {
  @scala.inline
  def apply(PhoneNumberIds: NonEmptyStringList): BatchDeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberIds = PhoneNumberIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
  }
  @scala.inline
  implicit class BatchDeletePhoneNumberRequestOps[Self <: BatchDeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumberIds(value: NonEmptyStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

