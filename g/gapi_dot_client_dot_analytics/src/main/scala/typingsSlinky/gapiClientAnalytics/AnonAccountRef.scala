package typingsSlinky.gapiClientAnalytics

import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.AccountRef
import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.ProfileRef
import typingsSlinky.gapiClientAnalytics.gapi.client.analytics.WebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountRef extends js.Object {
  /** Account for this link. */
  var accountRef: js.UndefOr[AccountRef] = js.native
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  /** Web property for this link. */
  var webPropertyRef: js.UndefOr[WebPropertyRef] = js.native
}

object AnonAccountRef {
  @scala.inline
  def apply(): AnonAccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccountRef]
  }
  @scala.inline
  implicit class AnonAccountRefOps[Self <: AnonAccountRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountRef(value: AccountRef): Self = {
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
    def withWebPropertyRef(value: WebPropertyRef): Self = {
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

