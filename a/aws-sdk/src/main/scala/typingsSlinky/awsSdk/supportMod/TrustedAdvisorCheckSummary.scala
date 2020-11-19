package typingsSlinky.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategorySpecificSummary(value: TrustedAdvisorCategorySpecificSummary): Self = this.set("categorySpecificSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckId(value: String): Self = this.set("checkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesSummary(value: TrustedAdvisorResourcesSummary): Self = this.set("resourcesSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFlaggedResources(value: Boolean): Self = this.set("hasFlaggedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFlaggedResources: Self = this.set("hasFlaggedResources", js.undefined)
  }
}
