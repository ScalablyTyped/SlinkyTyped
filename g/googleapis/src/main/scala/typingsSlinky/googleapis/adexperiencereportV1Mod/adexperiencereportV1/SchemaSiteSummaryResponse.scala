package typingsSlinky.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  /**
    * Summary for the desktop review of the site.
    */
  var desktopSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  /**
    * Summary for the mobile review of the site.
    */
  var mobileSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
}

object SchemaSiteSummaryResponse {
  @scala.inline
  def apply(): SchemaSiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSummaryResponse]
  }
  @scala.inline
  implicit class SchemaSiteSummaryResponseOps[Self <: SchemaSiteSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktopSummary(value: SchemaPlatformSummary): Self = {
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
    def withMobileSummary(value: SchemaPlatformSummary): Self = {
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

