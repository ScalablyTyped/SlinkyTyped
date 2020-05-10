package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureScoreControlProfile extends Entity {
  // Control action type (Config, Review, Behavior).
  var actionType: js.UndefOr[String] = js.native
  // URL to where the control can be actioned.
  var actionUrl: js.UndefOr[String] = js.native
  // GUID string for tenant ID.
  var azureTenantId: js.UndefOr[String] = js.native
  var complianceInformation: js.UndefOr[js.Array[ComplianceInformation]] = js.native
  // Control action category (Identity, Data, Device, Apps, Infrastructure).
  var controlCategory: js.UndefOr[String] = js.native
  var controlStateUpdates: js.UndefOr[js.Array[SecureScoreControlStateUpdate]] = js.native
  // Flag to indicate if a control is depreciated.
  var deprecated: js.UndefOr[Boolean] = js.native
  // Resource cost of implemmentating control (low, moderate, high).
  var implementationCost: js.UndefOr[String] = js.native
  // Time at which the control profile entity was last modified. The Timestamp type represents date and time
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // max attainable score for the control.
  var maxScore: js.UndefOr[Double] = js.native
  // Microsoft's stack ranking of control.
  var rank: js.UndefOr[Double] = js.native
  // Description of what the control will help remediate.
  var remediation: js.UndefOr[String] = js.native
  // Description of the impact on users of the remediation.
  var remediationImpact: js.UndefOr[String] = js.native
  // Service that owns the control (Exchange, Sharepoint, Azure AD).
  var service: js.UndefOr[String] = js.native
  // List of threats the control mitigates (accountBreach,dataDeletion,dataExfiltration,dataSpillage,
  var threats: js.UndefOr[js.Array[String]] = js.native
  var tier: js.UndefOr[String] = js.native
  // Title of the control.
  var title: js.UndefOr[String] = js.native
  var userImpact: js.UndefOr[String] = js.native
  var vendorInformation: js.UndefOr[SecurityVendorInformation] = js.native
}

object SecureScoreControlProfile {
  @scala.inline
  def apply(): SecureScoreControlProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureScoreControlProfile]
  }
  @scala.inline
  implicit class SecureScoreControlProfileOps[Self <: SecureScoreControlProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withActionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureTenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceInformation(value: js.Array[ComplianceInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complianceInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withControlCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withControlStateUpdates(value: js.Array[SecureScoreControlStateUpdate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlStateUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlStateUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlStateUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementationCost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementationCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationCost")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScore")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withRemediation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediation")(js.undefined)
        ret
    }
    @scala.inline
    def withRemediationImpact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediationImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remediationImpact")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withThreats(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threats")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUserImpact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userImpact")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorInformation(value: SecurityVendorInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorInformation")(js.undefined)
        ret
    }
  }
  
}

