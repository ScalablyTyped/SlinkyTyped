package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountQuota extends js.Object {
  /**
    * The name of the AWS DMS quota for this AWS account.
    */
  var AccountQuotaName: js.UndefOr[String] = js.native
  /**
    * The maximum allowed value for the quota.
    */
  var Max: js.UndefOr[Long] = js.native
  /**
    * The amount currently used toward the quota maximum.
    */
  var Used: js.UndefOr[Long] = js.native
}

object AccountQuota {
  @scala.inline
  def apply(): AccountQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountQuota]
  }
  @scala.inline
  implicit class AccountQuotaOps[Self <: AccountQuota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountQuotaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountQuotaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountQuotaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountQuotaName")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Max")(js.undefined)
        ret
    }
    @scala.inline
    def withUsed(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Used")(js.undefined)
        ret
    }
  }
  
}

