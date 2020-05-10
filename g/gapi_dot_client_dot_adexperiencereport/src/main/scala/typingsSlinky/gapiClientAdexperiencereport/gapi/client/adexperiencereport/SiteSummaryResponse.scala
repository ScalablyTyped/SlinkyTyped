package typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteSummaryResponse extends js.Object {
  /** Summary for the desktop review of the site. */
  var desktopSummary: js.UndefOr[PlatformSummary] = js.native
  /** Summary for the mobile review of the site. */
  var mobileSummary: js.UndefOr[PlatformSummary] = js.native
  /** The name of the site reviewed. */
  var reviewedSite: js.UndefOr[String] = js.native
}

object SiteSummaryResponse {
  @scala.inline
  def apply(): SiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSummaryResponse]
  }
  @scala.inline
  implicit class SiteSummaryResponseOps[Self <: SiteSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktopSummary(value: PlatformSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktopSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktopSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileSummary(value: PlatformSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withReviewedSite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewedSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReviewedSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviewedSite")(js.undefined)
        ret
    }
  }
  
}

