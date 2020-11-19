package typingsSlinky.pulumiAws.apiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.apigatewayv2.ApiCorsConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiArgs extends js.Object {
  
  /**
    * An [API key selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions).
    * Valid values: `$context.authorizer.usageIdentifierKey`, `$request.header.x-api-key`. Defaults to `$request.header.x-api-key`.
    * Applicable for WebSocket APIs.
    */
  val apiKeySelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * The cross-origin resource sharing (CORS) [configuration](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html). Applicable for HTTP APIs.
    */
  val corsConfiguration: js.UndefOr[Input[ApiCorsConfiguration]] = js.native
  
  /**
    * Part of _quick create_. Specifies any credentials required for the integration. Applicable for HTTP APIs.
    */
  val credentialsArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the API.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the API.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The API protocol. Valid values: `HTTP`, `WEBSOCKET`.
    */
  val protocolType: Input[String] = js.native
  
  /**
    * Part of _quick create_. Specifies any [route key](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-routes.html). Applicable for HTTP APIs.
    */
  val routeKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The [route selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-selection-expressions) for the API.
    * Defaults to `$request.method $request.path`.
    */
  val routeSelectionExpression: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the API.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Part of _quick create_. Quick create produces an API with an integration, a default catch-all route, and a default stage which is configured to automatically deploy changes.
    * For HTTP integrations, specify a fully qualified URL. For Lambda integrations, specify a function ARN.
    * The type of the integration will be `HTTP_PROXY` or `AWS_PROXY`, respectively. Applicable for HTTP APIs.
    */
  val target: js.UndefOr[Input[String]] = js.native
  
  /**
    * A version identifier for the API.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object ApiArgs {
  
  @scala.inline
  def apply(protocolType: Input[String]): ApiArgs = {
    val __obj = js.Dynamic.literal(protocolType = protocolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiArgs]
  }
  
  @scala.inline
  implicit class ApiArgsOps[Self <: ApiArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProtocolType(value: Input[String]): Self = this.set("protocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySelectionExpression(value: Input[String]): Self = this.set("apiKeySelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySelectionExpression: Self = this.set("apiKeySelectionExpression", js.undefined)
    
    @scala.inline
    def setCorsConfiguration(value: Input[ApiCorsConfiguration]): Self = this.set("corsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorsConfiguration: Self = this.set("corsConfiguration", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: Input[String]): Self = this.set("credentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsArn: Self = this.set("credentialsArn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRouteKey(value: Input[String]): Self = this.set("routeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteKey: Self = this.set("routeKey", js.undefined)
    
    @scala.inline
    def setRouteSelectionExpression(value: Input[String]): Self = this.set("routeSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSelectionExpression: Self = this.set("routeSelectionExpression", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTarget(value: Input[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
