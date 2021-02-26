package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  /**
    * The ARN of the certificate associated with the device.
    */
  var CertificateArn: string = js.native
  
  /**
    * A descriptive or arbitrary ID for the device. This value must be unique within the device definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string = js.native
  
  /**
    * If true, the device's local shadow will be automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[boolean] = js.native
  
  /**
    * The thing ARN of the device.
    */
  var ThingArn: string = js.native
}
object Device {
  
  @scala.inline
  def apply(CertificateArn: string, Id: string, ThingArn: string): Device = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: string): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncShadow(value: boolean): Self = StObject.set(x, "SyncShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncShadowUndefined: Self = StObject.set(x, "SyncShadow", js.undefined)
    
    @scala.inline
    def setThingArn(value: string): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
  }
}
