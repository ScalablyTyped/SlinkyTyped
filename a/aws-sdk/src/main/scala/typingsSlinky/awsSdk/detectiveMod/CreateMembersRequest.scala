package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersRequest extends js.Object {
  /**
    * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the account list contains the account identifier and the AWS account root user email address.
    */
  var Accounts: AccountList = js.native
  /**
    * The ARN of the behavior graph to invite the member accounts to contribute their data to.
    */
  var GraphArn: typingsSlinky.awsSdk.detectiveMod.GraphArn = js.native
  /**
    * Customized message text to include in the invitation email message to the invited member accounts.
    */
  var Message: js.UndefOr[EmailMessage] = js.native
}

object CreateMembersRequest {
  @scala.inline
  def apply(Accounts: AccountList, GraphArn: GraphArn): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(Accounts = Accounts.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
  @scala.inline
  implicit class CreateMembersRequestOps[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: AccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphArn(value: GraphArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: EmailMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

