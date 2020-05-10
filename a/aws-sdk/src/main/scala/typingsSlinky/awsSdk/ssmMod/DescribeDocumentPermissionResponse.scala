package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentPermissionResponse extends js.Object {
  /**
    * The account IDs that have permission to use this document. The ID can be either an AWS account or All.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.native
  /**
    * A list of of AWS accounts where the current document is shared and the version shared with each account.
    */
  var AccountSharingInfoList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AccountSharingInfoList] = js.native
}

object DescribeDocumentPermissionResponse {
  @scala.inline
  def apply(): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
  @scala.inline
  implicit class DescribeDocumentPermissionResponseOps[Self <: DescribeDocumentPermissionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountIds(value: AccountIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountSharingInfoList(value: AccountSharingInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSharingInfoList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountSharingInfoList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSharingInfoList")(js.undefined)
        ret
    }
  }
  
}

