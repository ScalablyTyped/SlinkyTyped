package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLinkRequest extends StObject {
  
  /**
    * The upload and download speed in Mbps. 
    */
  var Bandwidth: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Bandwidth] = js.native
  
  /**
    * A description of the link. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  
  /**
    * The ID of the link.
    */
  var LinkId: String = js.native
  
  /**
    * The provider of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Provider: js.UndefOr[String] = js.native
  
  /**
    * The type of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Type: js.UndefOr[String] = js.native
}
object UpdateLinkRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String, LinkId: String): UpdateLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkRequest]
  }
  
  @scala.inline
  implicit class UpdateLinkRequestMutableBuilder[Self <: UpdateLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
