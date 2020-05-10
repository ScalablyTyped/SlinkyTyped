package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfilesRequest extends js.Object {
  /**
    * An array of IAM or federated user ARNs that identify the users to be described.
    */
  var IamUserArns: js.UndefOr[Strings] = js.native
}

object DescribeUserProfilesRequest {
  @scala.inline
  def apply(): DescribeUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfilesRequest]
  }
  @scala.inline
  implicit class DescribeUserProfilesRequestOps[Self <: DescribeUserProfilesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamUserArns(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUserArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArns")(js.undefined)
        ret
    }
  }
  
}

