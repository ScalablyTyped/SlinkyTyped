package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebhookConversion describes how to call a conversion webhook
  */
@js.native
trait WebhookConversion extends StObject {
  
  /**
    * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
    */
  var clientConfig: WebhookClientConfig = js.native
  
  /**
    * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
    */
  var conversionReviewVersions: js.Array[String] = js.native
}
object WebhookConversion {
  
  @scala.inline
  def apply(clientConfig: WebhookClientConfig, conversionReviewVersions: js.Array[String]): WebhookConversion = {
    val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], conversionReviewVersions = conversionReviewVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookConversion]
  }
  
  @scala.inline
  implicit class WebhookConversionMutableBuilder[Self <: WebhookConversion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionReviewVersions(value: js.Array[String]): Self = StObject.set(x, "conversionReviewVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionReviewVersionsVarargs(value: String*): Self = StObject.set(x, "conversionReviewVersions", js.Array(value :_*))
  }
}
