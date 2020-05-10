package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSeriesMembershipGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of maximum results per page to be included in the response.
    */
  var page_size: js.UndefOr[Double] = js.native
  /**
    * The value of the nextToken from the previous page.
    */
  var page_token: js.UndefOr[String] = js.native
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[String] = js.native
}

object ParamsResourceSeriesMembershipGet {
  @scala.inline
  def apply(): ParamsResourceSeriesMembershipGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesMembershipGet]
  }
  @scala.inline
  implicit class ParamsResourceSeriesMembershipGetOps[Self <: ParamsResourceSeriesMembershipGet] (val x: Self) extends AnyVal {
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
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_token")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series_id")(js.undefined)
        ret
    }
  }
  
}

