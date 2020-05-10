package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePartnerEventSourceRequest extends js.Object {
  /**
    * The AWS account ID of the AWS customer that the event source was created for.
    */
  var Account: AccountId = js.native
  /**
    * The name of the event source to delete.
    */
  var Name: EventSourceName = js.native
}

object DeletePartnerEventSourceRequest {
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): DeletePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePartnerEventSourceRequest]
  }
  @scala.inline
  implicit class DeletePartnerEventSourceRequestOps[Self <: DeletePartnerEventSourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: EventSourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

