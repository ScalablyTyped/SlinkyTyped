package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignIn extends Entity {
  // App name displayed in the Azure Portal.
  var appDisplayName: js.UndefOr[String] = js.native
  // Unique GUID representing the app ID in the Azure Active Directory.
  var appId: js.UndefOr[String] = js.native
  var appliedConditionalAccessPolicies: js.UndefOr[js.Array[AppliedConditionalAccessPolicy]] = js.native
  /**
    * Identifies the legacy client used for sign-in activity. Includes Browser, Exchange Active Sync, modern clients, IMAP,
    * MAPI, SMTP, and POP.
    */
  var clientAppUsed: js.UndefOr[String] = js.native
  /**
    * Reports status of an activated conditional access policy. Possible values are: success, failure, notApplied, and
    * unknownFutureValue.
    */
  var conditionalAccessStatus: js.UndefOr[ConditionalAccessStatus] = js.native
  // The request ID sent from the client when the sign-in is initiated; used to troubleshoot sign-in activity.
  var correlationId: js.UndefOr[String] = js.native
  // Date and time (UTC) the sign-in was initiated. Example: midnight on Jan 1, 2014 is reported as '2014-01-01T00:00:00Z'.
  var createdDateTime: js.UndefOr[String] = js.native
  // Device information from where the sign-in occurred; includes device ID, operating system, and browser.
  var deviceDetail: js.UndefOr[DeviceDetail] = js.native
  // IP address of the client used to sign in.
  var ipAddress: js.UndefOr[String] = js.native
  // Indicates if a sign-in is interactive or not.
  var isInteractive: js.UndefOr[Boolean] = js.native
  // Provides the city, state, and country code where the sign-in originated.
  var location: js.UndefOr[SignInLocation] = js.native
  // Name of the resource the user signed into.
  var resourceDisplayName: js.UndefOr[String] = js.native
  // ID of the resource that the user signed into.
  var resourceId: js.UndefOr[String] = js.native
  /**
    * Provides the 'reason' behind a specific state of a risky user, sign-in or a risk event. The possible values are: none,
    * adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset,
    * adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser,
    * adminConfirmedSigninCompromised, unknownFutureValue. The value none means that no action has been performed on the user
    * or sign-in so far. Note: Details for this property require an Azure AD Premium P2 license. Other licenses return the
    * value hidden.
    */
  var riskDetail: js.UndefOr[RiskDetail] = js.native
  /**
    * Risk event types associated with the sign-in. The possible values are: unlikelyTravel, anonymizedIPAddress,
    * maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials,
    * investigationsThreatIntelligence, generic, and unknownFutureValue.
    */
  var riskEventTypes: js.UndefOr[js.Array[RiskEventType]] = js.native
  /**
    * Aggregated risk level. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelAggregated: js.UndefOr[RiskLevel] = js.native
  /**
    * Risk level during sign-in. The possible values are: none, low, medium, high, hidden, and unknownFutureValue. The value
    * hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Note: Details for this property are
    * only available for Azure AD Premium P2 customers. All other customers will be returned hidden.
    */
  var riskLevelDuringSignIn: js.UndefOr[RiskLevel] = js.native
  /**
    * Reports status of the risky user, sign-in, or a risk event. The possible values are: none, confirmedSafe, remediated,
    * dismissed, atRisk, confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[RiskState] = js.native
  // Sign-in status. Possible values include Success and Failure.
  var status: js.UndefOr[SignInStatus] = js.native
  // Display name of the user that initiated the sign-in.
  var userDisplayName: js.UndefOr[String] = js.native
  // ID of the user that initiated the sign-in.
  var userId: js.UndefOr[String] = js.native
  // User principal name of the user that initiated the sign-in.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object SignIn {
  @scala.inline
  def apply(): SignIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignIn]
  }
  @scala.inline
  implicit class SignInOps[Self <: SignIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedConditionalAccessPolicies(value: js.Array[AppliedConditionalAccessPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedConditionalAccessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedConditionalAccessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedConditionalAccessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withClientAppUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAppUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAppUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAppUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalAccessStatus(value: ConditionalAccessStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalAccessStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalAccessStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalAccessStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceDetail(value: DeviceDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: SignInLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskDetail(value: RiskDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskEventTypes(value: js.Array[RiskEventType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskEventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskEventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskLevelAggregated(value: RiskLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskLevelAggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskLevelAggregated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskLevelAggregated")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskLevelDuringSignIn(value: RiskLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskLevelDuringSignIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskLevelDuringSignIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskLevelDuringSignIn")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskState(value: RiskState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskState")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SignInStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
  }
  
}

