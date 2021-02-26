package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookDefinition extends StObject {
  
  /**
    * Supported options are GITHUB_HMAC, IP, and UNAUTHENTICATED.   For information about the authentication scheme implemented by GITHUB_HMAC, see Securing your webhooks on the GitHub Developer website.    IP rejects webhooks trigger requests unless they originate from an IP address in the IP range whitelisted in the authentication configuration.    UNAUTHENTICATED accepts all webhook trigger requests regardless of origin.  
    */
  var authentication: WebhookAuthenticationType = js.native
  
  /**
    * Properties that configure the authentication applied to incoming webhook trigger requests. The required properties depend on the authentication type. For GITHUB_HMAC, only the SecretToken property must be set. For IP, only the AllowedIPRange property must be set to a valid CIDR range. For UNAUTHENTICATED, no properties can be set.
    */
  var authenticationConfiguration: WebhookAuthConfiguration = js.native
  
  /**
    * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must pass for the request to be accepted and the pipeline started.
    */
  var filters: WebhookFilters = js.native
  
  /**
    * The name of the webhook.
    */
  var name: WebhookName = js.native
  
  /**
    * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
    */
  var targetAction: ActionName = js.native
  
  /**
    * The name of the pipeline you want to connect to the webhook.
    */
  var targetPipeline: PipelineName = js.native
}
object WebhookDefinition {
  
  @scala.inline
  def apply(
    authentication: WebhookAuthenticationType,
    authenticationConfiguration: WebhookAuthConfiguration,
    filters: WebhookFilters,
    name: WebhookName,
    targetAction: ActionName,
    targetPipeline: PipelineName
  ): WebhookDefinition = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any], authenticationConfiguration = authenticationConfiguration.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetAction = targetAction.asInstanceOf[js.Any], targetPipeline = targetPipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookDefinition]
  }
  
  @scala.inline
  implicit class WebhookDefinitionMutableBuilder[Self <: WebhookDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: WebhookAuthenticationType): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationConfiguration(value: WebhookAuthConfiguration): Self = StObject.set(x, "authenticationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: WebhookFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: WebhookFilterRule*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setName(value: WebhookName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAction(value: ActionName): Self = StObject.set(x, "targetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPipeline(value: PipelineName): Self = StObject.set(x, "targetPipeline", value.asInstanceOf[js.Any])
  }
}
