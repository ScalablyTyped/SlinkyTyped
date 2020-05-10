package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportApiResponse extends js.Object {
  /**
    * The URI of the API, of the form {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically appended to this URI to form a complete path to a deployed API stage.
    */
  var ApiEndpoint: js.UndefOr[string] = js.native
  /**
    * The API ID.
    */
  var ApiId: js.UndefOr[Id] = js.native
  /**
    * An API key selection expression. Supported only for WebSocket APIs. See API Key Selection Expressions.
    */
  var ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * A CORS configuration. Supported only for HTTP APIs.
    */
  var CorsConfiguration: js.UndefOr[Cors] = js.native
  /**
    * The timestamp when the API was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The description of the API.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Avoid validating models when creating a deployment. Supported only for WebSocket APIs.
    */
  var DisableSchemaValidation: js.UndefOr[boolean] = js.native
  /**
    * The validation information during API import. This may include particular properties of your OpenAPI definition which are ignored during import. Supported only for HTTP APIs.
    */
  var ImportInfo: js.UndefOr[listOfString] = js.native
  /**
    * The name of the API.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * The API protocol.
    */
  var ProtocolType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ProtocolType] = js.native
  /**
    * The route selection expression for the API. For HTTP APIs, the routeSelectionExpression must be ${request.method} ${request.path}. If not provided, this will be the default for HTTP APIs. This property is required for WebSocket APIs.
    */
  var RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * A collection of tags associated with the API.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * A version identifier for the API.
    */
  var Version: js.UndefOr[StringWithLengthBetween1And64] = js.native
  /**
    * The warning messages reported when failonwarnings is turned on during API import.
    */
  var Warnings: js.UndefOr[listOfString] = js.native
}

object ImportApiResponse {
  @scala.inline
  def apply(): ImportApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportApiResponse]
  }
  @scala.inline
  implicit class ImportApiResponseOps[Self <: ImportApiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withApiId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(js.undefined)
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
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
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
    def withImportInfo(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportInfo")(js.undefined)
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
    def withProtocolType(value: ProtocolType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtocolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtocolType")(js.undefined)
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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
    @scala.inline
    def withWarnings(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(js.undefined)
        ret
    }
  }
  
}

