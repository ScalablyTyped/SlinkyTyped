package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizerResponse extends js.Object {
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: js.UndefOr[Id] = js.native
  /**
    * Authorizer caching is not currently supported. Don't specify this value for authorizers.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.native
  /**
    * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
    */
  var AuthorizerType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.AuthorizerType] = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI). ForREQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * The identity source for which authorization is requested. For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the specified request parameters. Currently, the identity source can be headers, query string parameters, stage variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related request parameters are present in the request, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling the Lambda function. For JWT, a single entry that specifies where to extract the JSON Web Token (JWT) from inbound requests. Currently only header-based and query parameter-based selections are supported, for example "$request.header.Authorization".
    */
  var IdentitySource: js.UndefOr[IdentitySourceList] = js.native
  /**
    * The validation expression does not apply to the REQUEST authorizer.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var JwtConfiguration: js.UndefOr[JWTConfiguration] = js.native
  /**
    * The name of the authorizer.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object GetAuthorizerResponse {
  @scala.inline
  def apply(): GetAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizerResponse]
  }
  @scala.inline
  implicit class GetAuthorizerResponseOps[Self <: GetAuthorizerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizerCredentialsArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerCredentialsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerCredentialsArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerCredentialsArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerResultTtlInSeconds(value: IntegerWithLengthBetween0And3600): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerResultTtlInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerResultTtlInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerResultTtlInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerType(value: AuthorizerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerType")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerUri(value: UriWithLengthBetween1And2048): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizerUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentitySource(value: IdentitySourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentitySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentitySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentitySource")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityValidationExpression(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityValidationExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityValidationExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityValidationExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withJwtConfiguration(value: JWTConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JwtConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJwtConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JwtConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: StringWithLengthBetween1And128): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

