package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatus extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.native
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.native
  var kind: js.UndefOr[String] = js.native
  var products: js.UndefOr[js.Array[AccountStatusProducts]] = js.native
  var websiteClaimed: js.UndefOr[Boolean] = js.native
}

object AccountStatus {
  @scala.inline
  def apply(): AccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatus]
  }
  @scala.inline
  implicit class AccountStatusOps[Self <: AccountStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountLevelIssues(value: js.Array[AccountStatusAccountLevelIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLevelIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountLevelIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountLevelIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withDataQualityIssues(value: js.Array[AccountStatusDataQualityIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataQualityIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataQualityIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProducts(value: js.Array[AccountStatusProducts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteClaimed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteClaimed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteClaimed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteClaimed")(js.undefined)
        ret
    }
  }
  
}

