package typingsSlinky.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressResponse extends StObject {
  
  /**
    * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * One IP address that the Resolver endpoint uses for DNS queries.
    */
  var Ip: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Ip] = js.native
  
  /**
    * The ID of one IP address.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * A status code that gives the current status of the request.
    */
  var Status: js.UndefOr[IpAddressStatus] = js.native
  
  /**
    * A message that provides additional information about the status of the request.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.StatusMessage] = js.native
  
  /**
    * The ID of one subnet.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.SubnetId] = js.native
}
object IpAddressResponse {
  
  @scala.inline
  def apply(): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressResponse]
  }
  
  @scala.inline
  implicit class IpAddressResponseMutableBuilder[Self <: IpAddressResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpId(value: ResourceId): Self = StObject.set(x, "IpId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpIdUndefined: Self = StObject.set(x, "IpId", js.undefined)
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    @scala.inline
    def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    @scala.inline
    def setStatus(value: IpAddressStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
