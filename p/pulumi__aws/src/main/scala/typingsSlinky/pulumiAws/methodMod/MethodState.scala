package typingsSlinky.pulumiAws.methodMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodState extends js.Object {
  /**
    * Specify if the method requires an API key
    */
  val apiKeyRequired: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
    */
  val authorization: js.UndefOr[Input[String]] = js.native
  /**
    * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
    */
  val authorizationScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
    */
  val authorizerId: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * A map of the API models used for the request's content type
    * where key is the content type (e.g. `application/json`)
    * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
    */
  val requestModels: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
    * For example: `requestParameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
    */
  val requestParameters: js.UndefOr[Input[StringDictionary[Input[Boolean]]]] = js.native
  /**
    * The ID of a `aws.apigateway.RequestValidator`
    */
  val requestValidatorId: js.UndefOr[Input[String]] = js.native
  /**
    * The API resource ID
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
}

object MethodState {
  @scala.inline
  def apply(): MethodState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodState]
  }
  @scala.inline
  implicit class MethodStateOps[Self <: MethodState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKeyRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKeyRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKeyRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorization(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationScopes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationScopes")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizerId")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestModels(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestModels")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestParameters(value: Input[StringDictionary[Input[Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestValidatorId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestValidatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: Input[String]): Self = {
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
  }
  
}

