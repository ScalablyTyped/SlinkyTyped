package typingsSlinky.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of the ad experience rating of a site for a specific platform.
  */
@js.native
trait SchemaPlatformSummary extends js.Object {
  /**
    * The status of the site reviewed for the Better Ads Standards.
    */
  var betterAdsStatus: js.UndefOr[String] = js.native
  /**
    * The date on which ad filtering begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  /**
    * The ad filtering status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  /**
    * The assigned regions for the site and platform.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  /**
    * A link that leads to a full ad experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
}

object SchemaPlatformSummary {
  @scala.inline
  def apply(): SchemaPlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformSummary]
  }
  @scala.inline
  implicit class SchemaPlatformSummaryOps[Self <: SchemaPlatformSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBetterAdsStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betterAdsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetterAdsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betterAdsStatus")(js.undefined)
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
    def withRegion(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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

