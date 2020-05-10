package typingsSlinky.googleapis.v1Mod.abusiveexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  /**
    * The status of the site reviewed for the abusive experiences.
    */
  var abusiveStatus: js.UndefOr[String] = js.native
  /**
    * The date on which enforcement begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  /**
    * The abusive experience enforcement status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  /**
    * A link that leads to a full abusive experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
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
    def withAbusiveStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abusiveStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbusiveStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abusiveStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcementTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcementTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcementTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcementTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChangeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReportUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportUrl")(js.undefined)
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
    @scala.inline
    def withUnderReview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underReview")(js.undefined)
        ret
    }
  }
  
}

