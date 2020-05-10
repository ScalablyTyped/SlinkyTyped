package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResponse extends js.Object {
  /**
    * Limits that are related to concurrency and code storage.
    */
  var AccountLimit: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.AccountLimit] = js.native
  /**
    * The number of functions and amount of storage in use.
    */
  var AccountUsage: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.AccountUsage] = js.native
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  @scala.inline
  implicit class GetAccountSettingsResponseOps[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountLimit(value: AccountLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountUsage(value: AccountUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUsage")(js.undefined)
        ret
    }
  }
  
}

