package typingsSlinky.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeviceRequest extends StObject {
  
  /**
    * A description of the device. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  
  /**
    * The location of the device.
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Location] = js.native
  
  /**
    * The model of the device. Length Constraints: Maximum length of 128 characters.
    */
  var Model: js.UndefOr[String] = js.native
  
  /**
    * The serial number of the device. Length Constraints: Maximum length of 128 characters.
    */
  var SerialNumber: js.UndefOr[String] = js.native
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of the device.
    */
  var Type: js.UndefOr[String] = js.native
  
  /**
    * The vendor of the device. Length Constraints: Maximum length of 128 characters.
    */
  var Vendor: js.UndefOr[String] = js.native
}
object CreateDeviceRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String): CreateDeviceRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeviceRequest]
  }
  
  @scala.inline
  implicit class CreateDeviceRequestMutableBuilder[Self <: CreateDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
  }
}
