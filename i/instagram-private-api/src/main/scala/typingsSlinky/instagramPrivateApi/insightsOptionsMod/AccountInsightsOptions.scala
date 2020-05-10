package typingsSlinky.instagramPrivateApi.insightsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInsightsOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var activityTab: js.UndefOr[Boolean] = js.native
  var audienceTab: js.UndefOr[Boolean] = js.native
  var contentTab: js.UndefOr[Boolean] = js.native
  var gridMediaSize: js.UndefOr[Double] = js.native
  var userId: js.UndefOr[String] = js.native
}

object AccountInsightsOptions {
  @scala.inline
  def apply(): AccountInsightsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInsightsOptions]
  }
  @scala.inline
  implicit class AccountInsightsOptionsOps[Self <: AccountInsightsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTab")(js.undefined)
        ret
    }
    @scala.inline
    def withAudienceTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceTab")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTab")(js.undefined)
        ret
    }
    @scala.inline
    def withGridMediaSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMediaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridMediaSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridMediaSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

