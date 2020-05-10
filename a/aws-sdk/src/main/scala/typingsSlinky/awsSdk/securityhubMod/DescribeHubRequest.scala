package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHubRequest extends js.Object {
  /**
    * The ARN of the Hub resource to retrieve.
    */
  var HubArn: js.UndefOr[NonEmptyString] = js.native
}

object DescribeHubRequest {
  @scala.inline
  def apply(): DescribeHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHubRequest]
  }
  @scala.inline
  implicit class DescribeHubRequestOps[Self <: DescribeHubRequest] (val x: Self) extends AnyVal {
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
  }
  
}

