package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAcceleratorRequest extends StObject {
  
  /**
    * Indicates whether an accelerator is enabled. The value is true or false. The default value is true.  If the value is set to true, an accelerator cannot be deleted. If set to false, the accelerator can be deleted.
    */
  var Enabled: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of an accelerator.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  
  /**
    * The value for the address type must be IPv4. 
    */
  var IpAddressType: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddressType] = js.native
  
  /**
    * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP addresses when you create an accelerator. You can specify one or two addresses, separated by a comma. Do not include the /32 suffix. Only one IP address from each of your IP address ranges can be used for each accelerator. If you specify only one IP address from your IP address range, Global Accelerator assigns a second static IP address for the accelerator from the AWS IP address pool.  Note that you can't update IP addresses for an existing accelerator. To change them, you must create a new accelerator with the new addresses. For more information, see Bring Your Own IP Addresses (BYOIP) in the AWS Global Accelerator Developer Guide.
    */
  var IpAddresses: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  
  /**
    * The name of an accelerator. The name can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens (-), and must not begin or end with a hyphen.
    */
  var Name: GenericString = js.native
  
  /**
    * Create tags for an accelerator. For more information, see Tagging in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Tags] = js.native
}
object CreateAcceleratorRequest {
  
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, Name: GenericString): CreateAcceleratorRequest = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcceleratorRequest]
  }
  
  @scala.inline
  implicit class CreateAcceleratorRequestMutableBuilder[Self <: CreateAcceleratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: GenericBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
    
    @scala.inline
    def setIpAddresses(value: IpAddresses): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "IpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setName(value: GenericString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
