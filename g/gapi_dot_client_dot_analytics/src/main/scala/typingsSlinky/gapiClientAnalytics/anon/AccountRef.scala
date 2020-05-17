package typingsSlinky.gapiClientAnalytics.anon

import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.ProfileRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRef extends js.Object {
  /** Account for this link. */
  var accountRef: js.UndefOr[typingsSlinky.gapiClientAnalytics.gapi.client.analytics.AccountRef] = js.native
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[typingsSlinky.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef] = js.native
}

object AccountRef {
  @scala.inline
  def apply(): AccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRef]
  }
  @scala.inline
  implicit class AccountRefOps[Self <: AccountRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountRef(value: typingsSlinky.gapiClientAnalytics.gapi.client.analytics.AccountRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountRef")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileRef(value: ProfileRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyRef(value: typingsSlinky.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyRef")(js.undefined)
        ret
    }
  }
  
}

