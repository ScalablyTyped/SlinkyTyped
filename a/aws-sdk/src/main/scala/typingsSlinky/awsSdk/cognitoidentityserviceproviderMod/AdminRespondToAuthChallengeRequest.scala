package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminRespondToAuthChallengeRequest extends js.Object {
  /**
    * The analytics metadata for collecting Amazon Pinpoint metrics for AdminRespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.native
  /**
    * The challenge name. For more information, see .
    */
  var ChallengeName: ChallengeNameType = js.native
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).    ADMIN_NO_SRP_AUTH: PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret).     NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME, SECRET_HASH (if app client is configured with client secret).    The value of the USERNAME attribute must be the user's actual username, not an alias (such as email address or phone number). To make this easier, the AdminInitiateAuth response includes the actual username value in the USERNAMEUSER_ID_FOR_SRP attribute, even if you specified an alias in your call to AdminInitiateAuth.
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.native
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType = js.native
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the AdminRespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following triggers: pre sign-up, custom message, post authentication, user migration, pre token generation, define auth challenge, create auth challenge, and verify auth challenge response. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your AdminRespondToAuthChallenge request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var ContextData: js.UndefOr[ContextDataType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * The ID of the Amazon Cognito user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object AdminRespondToAuthChallengeRequest {
  @scala.inline
  def apply(ChallengeName: ChallengeNameType, ClientId: ClientIdType, UserPoolId: UserPoolIdType): AdminRespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminRespondToAuthChallengeRequest]
  }
  @scala.inline
  implicit class AdminRespondToAuthChallengeRequestOps[Self <: AdminRespondToAuthChallengeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeName(value: ChallengeNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: ClientIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalyticsMetadata(value: AnalyticsMetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withChallengeResponses(value: ChallengeResponsesType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeResponses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponses")(js.undefined)
        ret
    }
    @scala.inline
    def withClientMetadata(value: ClientMetadataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withContextData(value: ContextDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextData")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: SessionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(js.undefined)
        ret
    }
  }
  
}

