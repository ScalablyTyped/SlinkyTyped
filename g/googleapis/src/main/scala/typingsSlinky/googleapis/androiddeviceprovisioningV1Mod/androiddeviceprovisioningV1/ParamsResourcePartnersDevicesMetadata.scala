package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePartnersDevicesMetadata extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * Required. The owner of the newly set metadata. Set this to the partner
    * ID.
    */
  var metadataOwnerId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateDeviceMetadataRequest] = js.native
}
object ParamsResourcePartnersDevicesMetadata {
  
  @scala.inline
  def apply(): ParamsResourcePartnersDevicesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesMetadata]
  }
  
  @scala.inline
  implicit class ParamsResourcePartnersDevicesMetadataMutableBuilder[Self <: ParamsResourcePartnersDevicesMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setMetadataOwnerId(value: String): Self = StObject.set(x, "metadataOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataOwnerIdUndefined: Self = StObject.set(x, "metadataOwnerId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaUpdateDeviceMetadataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
