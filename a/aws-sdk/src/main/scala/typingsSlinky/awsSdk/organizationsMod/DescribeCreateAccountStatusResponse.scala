package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCreateAccountStatusResponse extends js.Object {
  /**
    * A structure that contains the current status of an account creation request.
    */
  var CreateAccountStatus: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}

object DescribeCreateAccountStatusResponse {
  @scala.inline
  def apply(): DescribeCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
  }
  @scala.inline
  implicit class DescribeCreateAccountStatusResponseOps[Self <: DescribeCreateAccountStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAccountStatus(value: CreateAccountStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAccountStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateAccountStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAccountStatus")(js.undefined)
        ret
    }
  }
  
}

