package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceRoleForAccountResponse extends js.Object {
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
  /**
    * The ARN of the role which is associated with the account.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object GetServiceRoleForAccountResponse {
  @scala.inline
  def apply(): GetServiceRoleForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceRoleForAccountResponse]
  }
  @scala.inline
  implicit class GetServiceRoleForAccountResponseOps[Self <: GetServiceRoleForAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
  }
  
}

