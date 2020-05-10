package typingsSlinky.googleapis.contentV2Mod.contentV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDatafeedstatusesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The country for which to get the datafeed status. If this parameter is
    * provided then language must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The ID of the datafeed.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The language for which to get the datafeed status. If this parameter is
    * provided then country must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the account that manages the datafeed. This account cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object ParamsResourceDatafeedstatusesGet {
  @scala.inline
  def apply(): ParamsResourceDatafeedstatusesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedstatusesGet]
  }
  @scala.inline
  implicit class ParamsResourceDatafeedstatusesGetOps[Self <: ParamsResourceDatafeedstatusesGet] (val x: Self) extends AnyVal {
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
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDatafeedId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatafeedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datafeedId")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
  }
  
}

