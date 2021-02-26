package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateMetadataOption extends StObject {
  
  /**
    * The state of the metadata service: `enabled`, `disabled`.
    */
  var httpEndpoint: String = js.native
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests.
    */
  var httpPutResponseHopLimit: Double = js.native
  
  /**
    * If session tokens are required: `optional`, `required`.
    */
  var httpTokens: String = js.native
}
object GetLaunchTemplateMetadataOption {
  
  @scala.inline
  def apply(httpEndpoint: String, httpPutResponseHopLimit: Double, httpTokens: String): GetLaunchTemplateMetadataOption = {
    val __obj = js.Dynamic.literal(httpEndpoint = httpEndpoint.asInstanceOf[js.Any], httpPutResponseHopLimit = httpPutResponseHopLimit.asInstanceOf[js.Any], httpTokens = httpTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateMetadataOption]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateMetadataOptionMutableBuilder[Self <: GetLaunchTemplateMetadataOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEndpoint(value: String): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPutResponseHopLimit(value: Double): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTokens(value: String): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
  }
}
