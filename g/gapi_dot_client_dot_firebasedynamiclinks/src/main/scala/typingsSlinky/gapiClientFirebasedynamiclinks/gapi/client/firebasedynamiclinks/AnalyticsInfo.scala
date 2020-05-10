package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsInfo extends js.Object {
  /** Google Play Campaign Measurements. */
  var googlePlayAnalytics: js.UndefOr[GooglePlayAnalytics] = js.native
  /** iTunes Connect App Analytics. */
  var itunesConnectAnalytics: js.UndefOr[ITunesConnectAnalytics] = js.native
}

object AnalyticsInfo {
  @scala.inline
  def apply(): AnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsInfo]
  }
  @scala.inline
  implicit class AnalyticsInfoOps[Self <: AnalyticsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGooglePlayAnalytics(value: GooglePlayAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlayAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlayAnalytics")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesConnectAnalytics(value: ITunesConnectAnalytics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesConnectAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesConnectAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesConnectAnalytics")(js.undefined)
        ret
    }
  }
  
}

