package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  /**
    * This property is part of quick create. It specifies the credentials required for the integration, if any. For a Lambda integration, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null. Currently, this property is not used for HTTP integrations. If provided, this value replaces the credentials associated with the quick create integration. Supported only for HTTP APIs.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * This property is part of quick create. If not specified, the route created using quick create is kept. Otherwise, this value replaces the route key of the quick create route. Additional routes may still be added after the API is updated. Supported only for HTTP APIs.
    */
  var RouteKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * This property is part of quick create. For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will be HTTP_PROXY or AWS_PROXY, respectively. The value provided updates the integration URI and integration type. You can update a quick-created target, but you can't remove it from an API. Supported only for HTTP APIs.
    */
  var Target: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
}

object UpdateApiRequest {
  @scala.inline
  def apply(ApiId: string): UpdateApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiRequest]
  }
  @scala.inline
  implicit class UpdateApiRequestOps[Self <: UpdateApiRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiKeySelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKeySelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKeySelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiKeySelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCorsConfiguration(value: Cors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialsArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialsArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialsArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSchemaValidation(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableSchemaValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSchemaValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableSchemaValidation")(js.undefined)
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
    @scala.inline
    def withRouteKey(value: SelectionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteSelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteSelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteSelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteSelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: UriWithLengthBetween1And2048): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

