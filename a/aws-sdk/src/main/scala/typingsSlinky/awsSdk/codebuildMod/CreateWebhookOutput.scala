package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebhookOutput extends StObject {
  
  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  var webhook: js.UndefOr[Webhook] = js.native
}
object CreateWebhookOutput {
  
  @scala.inline
  def apply(): CreateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebhookOutput]
  }
  
  @scala.inline
  implicit class CreateWebhookOutputMutableBuilder[Self <: CreateWebhookOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
