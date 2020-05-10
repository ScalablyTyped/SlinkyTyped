package typingsSlinky.pulumiAws.authorizerMod

import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerState extends js.Object {
  /**
    * The credentials required for the authorizer.
    * To specify an IAM Role for API Gateway to assume, use the IAM Role ARN.
    */
  val authorizerCredentials: js.UndefOr[Input[String]] = js.native
  /**
    * The TTL of cached authorizer results in seconds.
    * Defaults to `300`.
    */
  val authorizerResultTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI).
    * This must be a well-formed Lambda function URI in the form of `arn:aws:apigateway:{region}:lambda:path/{service_api}`,
    * e.g. `arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:012345678912:function:my-function/invocations`
    */
  val authorizerUri: js.UndefOr[Input[String]] = js.native
  /**
    * The source of the identity in an incoming request.
    * Defaults to `method.request.header.Authorization`. For `REQUEST` type, this may be a comma-separated list of values, including headers, query string parameters and stage variables - e.g. `"method.request.header.SomeHeaderName,method.request.querystring.SomeQueryStringName,stageVariables.SomeStageVariableName"`
    */
  val identitySource: js.UndefOr[Input[String]] = js.native
  /**
    * A validation expression for the incoming identity.
    * For `TOKEN` type, this value should be a regular expression. The incoming token from the client is matched
    * against this expression, and will proceed if the token matches. If the token doesn't match,
    * the client receives a 401 Unauthorized response.
    */
  val identityValidationExpression: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the authorizer
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the Amazon Cognito user pool ARNs.
    * Each element is of this format: `arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}`.
    */
  val providerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  /**
    * The type of the authorizer. Possible values are `TOKEN` for a Lambda function using a single authorization token submitted in a custom header, `REQUEST` for a Lambda function using incoming request parameters, or `COGNITO_USER_POOLS` for using an Amazon Cognito user pool.
    * Defaults to `TOKEN`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object AuthorizerState {
  @scala.inline
  def apply(): AuthorizerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerState]
  }
  @scala.inline
  implicit class AuthorizerStateOps[Self <: AuthorizerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerCredentials(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerResultTtlInSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerResultTtlInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerResultTtlInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerResultTtlInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerUri(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentitySource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identitySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentitySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identitySource")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityValidationExpression(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityValidationExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityValidationExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityValidationExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

