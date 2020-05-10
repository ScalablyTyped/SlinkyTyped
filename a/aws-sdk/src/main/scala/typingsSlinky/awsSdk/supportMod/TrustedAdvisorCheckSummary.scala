package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckSummary extends js.Object {
  /**
    * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
    */
  var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary = js.native
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  /**
    * Specifies whether the Trusted Advisor check has flagged resources.
    */
  var hasFlaggedResources: js.UndefOr[Boolean] = js.native
  var resourcesSummary: TrustedAdvisorResourcesSummary = js.native
  /**
    * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
    */
  var status: String = js.native
  /**
    * The time of the last refresh of the check.
    */
  var timestamp: String = js.native
}

object TrustedAdvisorCheckSummary {
  @scala.inline
  def apply(
    categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
    checkId: String,
    resourcesSummary: TrustedAdvisorResourcesSummary,
    status: String,
    timestamp: String
  ): TrustedAdvisorCheckSummary = {
    val __obj = js.Dynamic.literal(categorySpecificSummary = categorySpecificSummary.asInstanceOf[js.Any], checkId = checkId.asInstanceOf[js.Any], resourcesSummary = resourcesSummary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckSummary]
  }
  @scala.inline
  implicit class TrustedAdvisorCheckSummaryOps[Self <: TrustedAdvisorCheckSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategorySpecificSummary(value: TrustedAdvisorCategorySpecificSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorySpecificSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcesSummary(value: TrustedAdvisorResourcesSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasFlaggedResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFlaggedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFlaggedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFlaggedResources")(js.undefined)
        ret
    }
  }
  
}

