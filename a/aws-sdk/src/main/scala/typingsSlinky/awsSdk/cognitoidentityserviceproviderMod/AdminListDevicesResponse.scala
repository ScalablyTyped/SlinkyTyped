package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminListDevicesResponse extends StObject {
  
  /**
    * The devices in the list of devices response.
    */
  var Devices: js.UndefOr[DeviceListType] = js.native
  
  /**
    * The pagination token.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.native
}
object AdminListDevicesResponse {
  
  @scala.inline
  def apply(): AdminListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListDevicesResponse]
  }
  
  @scala.inline
  implicit class AdminListDevicesResponseMutableBuilder[Self <: AdminListDevicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: DeviceListType): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: DeviceType*): Self = StObject.set(x, "Devices", js.Array(value :_*))
    
    @scala.inline
    def setPaginationToken(value: SearchPaginationTokenType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
