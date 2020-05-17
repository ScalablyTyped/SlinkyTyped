package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountId extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** View (Profile) ID. */
  var profileId: js.UndefOr[String] = js.native
  /** View (Profile) name. */
  var profileName: js.UndefOr[String] = js.native
  /** Table ID for view (profile). */
  var tableId: js.UndefOr[String] = js.native
  /** Web Property ID to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object AccountId {
  @scala.inline
  def apply(): AccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountId]
  }
  @scala.inline
  implicit class AccountIdOps[Self <: AccountId] (val x: Self) extends AnyVal {
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
    def withInternalWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternalWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalWebPropertyId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableId")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

