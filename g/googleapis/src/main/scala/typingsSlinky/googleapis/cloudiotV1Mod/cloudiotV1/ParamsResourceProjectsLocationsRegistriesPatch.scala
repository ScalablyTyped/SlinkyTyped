package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsRegistriesPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The resource path name. For example,
    * `projects/example-project/locations/us-central1/registries/my-registry`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeviceRegistry] = js.native
  
  /**
    * Only updates the `device_registry` fields indicated by this mask. The
    * field mask must not be empty, and it must not contain fields that are
    * immutable or only set by the server. Mutable top-level fields:
    * `event_notification_config`, `http_config`, `mqtt_config`, and
    * `state_notification_config`.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsRegistriesPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesPatchMutableBuilder[Self <: ParamsResourceProjectsLocationsRegistriesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDeviceRegistry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
