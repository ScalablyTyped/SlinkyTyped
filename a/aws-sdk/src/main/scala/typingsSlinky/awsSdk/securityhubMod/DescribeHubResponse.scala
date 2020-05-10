package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHubResponse extends js.Object {
  /**
    * The ARN of the Hub resource that was retrieved.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when Security Hub was enabled in the account.
    */
  var SubscribedAt: js.UndefOr[NonEmptyString] = js.native
}

object DescribeHubResponse {
  @scala.inline
  def apply(): DescribeHubResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubResponse]
  }
  @scala.inline
  implicit class DescribeHubResponseOps[Self <: DescribeHubResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHubArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HubArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHubArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HubArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribedAt(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscribedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscribedAt")(js.undefined)
        ret
    }
  }
  
}

