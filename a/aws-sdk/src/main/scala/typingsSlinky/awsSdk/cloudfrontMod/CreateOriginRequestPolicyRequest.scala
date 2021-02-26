package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOriginRequestPolicyRequest extends StObject {
  
  /**
    * An origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typingsSlinky.awsSdk.cloudfrontMod.OriginRequestPolicyConfig = js.native
}
object CreateOriginRequestPolicyRequest {
  
  @scala.inline
  def apply(OriginRequestPolicyConfig: OriginRequestPolicyConfig): CreateOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginRequestPolicyRequest]
  }
  
  @scala.inline
  implicit class CreateOriginRequestPolicyRequestMutableBuilder[Self <: CreateOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
}
