package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceType extends StObject {
  
  /**
    * The device attributes.
    */
  var DeviceAttributes: js.UndefOr[AttributeListType] = js.native
  
  /**
    * The creation date of the device.
    */
  var DeviceCreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
  
  /**
    * The date in which the device was last authenticated.
    */
  var DeviceLastAuthenticatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The last modified date of the device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.native
}
object DeviceType {
  
  @scala.inline
  def apply(): DeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceType]
  }
  
  @scala.inline
  implicit class DeviceTypeMutableBuilder[Self <: DeviceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceAttributes(value: AttributeListType): Self = StObject.set(x, "DeviceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAttributesUndefined: Self = StObject.set(x, "DeviceAttributes", js.undefined)
    
    @scala.inline
    def setDeviceAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "DeviceAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCreateDate(value: js.Date): Self = StObject.set(x, "DeviceCreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCreateDateUndefined: Self = StObject.set(x, "DeviceCreateDate", js.undefined)
    
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceKeyUndefined: Self = StObject.set(x, "DeviceKey", js.undefined)
    
    @scala.inline
    def setDeviceLastAuthenticatedDate(value: js.Date): Self = StObject.set(x, "DeviceLastAuthenticatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLastAuthenticatedDateUndefined: Self = StObject.set(x, "DeviceLastAuthenticatedDate", js.undefined)
    
    @scala.inline
    def setDeviceLastModifiedDate(value: js.Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
  }
}
