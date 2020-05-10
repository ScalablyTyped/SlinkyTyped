package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePagespeedapiRunpagespeed extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A Lighthouse category to run; if none are given, only Performance
    * category will be run
    */
  var category: js.UndefOr[js.Array[String]] = js.native
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The analysis strategy (desktop or mobile) to use, and desktop is the
    * default
    */
  var strategy: js.UndefOr[String] = js.native
  /**
    * The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Campaign name for analytics.
    */
  var utm_campaign: js.UndefOr[String] = js.native
  /**
    * Campaign source for analytics.
    */
  var utm_source: js.UndefOr[String] = js.native
}

object ParamsResourcePagespeedapiRunpagespeed {
  @scala.inline
  def apply(): ParamsResourcePagespeedapiRunpagespeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
  }
  @scala.inline
  implicit class ParamsResourcePagespeedapiRunpagespeedOps[Self <: ParamsResourcePagespeedapiRunpagespeed] (val x: Self) extends AnyVal {
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
    def withCategory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_campaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_campaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_campaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_campaign")(js.undefined)
        ret
    }
    @scala.inline
    def withUtm_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtm_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_source")(js.undefined)
        ret
    }
  }
  
}

