package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITunesConnectAnalytics extends js.Object {
  /** Affiliate token used to create affiliate-coded links. */
  var at: js.UndefOr[String] = js.native
  /**
    * Campaign text that developers can optionally add to any link in order to
    * track sales from a specific marketing campaign.
    */
  var ct: js.UndefOr[String] = js.native
  /** iTune media types, including music, podcasts, audiobooks and so on. */
  var mt: js.UndefOr[String] = js.native
  /**
    * Provider token that enables analytics for Dynamic Links from within iTunes
    * Connect.
    */
  var pt: js.UndefOr[String] = js.native
}

object ITunesConnectAnalytics {
  @scala.inline
  def apply(): ITunesConnectAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITunesConnectAnalytics]
  }
  @scala.inline
  implicit class ITunesConnectAnalyticsOps[Self <: ITunesConnectAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(js.undefined)
        ret
    }
    @scala.inline
    def withCt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(js.undefined)
        ret
    }
    @scala.inline
    def withMt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(js.undefined)
        ret
    }
    @scala.inline
    def withPt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(js.undefined)
        ret
    }
  }
  
}

