package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEnterprisesPullnotificationset extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The request mode for pulling notifications. Specifying
    * waitForNotifications will cause the request to block and wait until one
    * or more notifications are present, or return an empty notification list
    * if no notifications are present after some time. Speciying
    * returnImmediately will cause the request to immediately return the
    * pending notifications, or an empty list if no notifications are present.
    * If omitted, defaults to waitForNotifications.
    */
  var requestMode: js.UndefOr[String] = js.native
}

object ParamsResourceEnterprisesPullnotificationset {
  @scala.inline
  def apply(): ParamsResourceEnterprisesPullnotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPullnotificationset]
  }
  @scala.inline
  implicit class ParamsResourceEnterprisesPullnotificationsetOps[Self <: ParamsResourceEnterprisesPullnotificationset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMode")(js.undefined)
        ret
    }
  }
  
}

