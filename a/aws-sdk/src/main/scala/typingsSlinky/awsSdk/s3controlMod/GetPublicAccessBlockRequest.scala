package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicAccessBlockRequest extends js.Object {
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to retrieve.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
}

object GetPublicAccessBlockRequest {
  @scala.inline
  def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
  @scala.inline
  implicit class GetPublicAccessBlockRequestOps[Self <: GetPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

