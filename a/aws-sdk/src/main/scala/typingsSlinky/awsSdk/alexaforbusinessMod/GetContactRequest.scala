package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactRequest extends js.Object {
  /**
    * The ARN of the contact for which to request details.
    */
  var ContactArn: Arn = js.native
}

object GetContactRequest {
  @scala.inline
  def apply(ContactArn: Arn): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactRequest]
  }
  @scala.inline
  implicit class GetContactRequestOps[Self <: GetContactRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

