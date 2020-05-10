package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceReportsGetfile extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The index of the report fragment to download.
    */
  var reportFragment: js.UndefOr[Double] = js.native
  /**
    * ID of the report.
    */
  var reportId: js.UndefOr[String] = js.native
}

object ParamsResourceReportsGetfile {
  @scala.inline
  def apply(): ParamsResourceReportsGetfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGetfile]
  }
  @scala.inline
  implicit class ParamsResourceReportsGetfileOps[Self <: ParamsResourceReportsGetfile] (val x: Self) extends AnyVal {
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
    def withReportFragment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withReportId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportId")(js.undefined)
        ret
    }
  }
  
}

