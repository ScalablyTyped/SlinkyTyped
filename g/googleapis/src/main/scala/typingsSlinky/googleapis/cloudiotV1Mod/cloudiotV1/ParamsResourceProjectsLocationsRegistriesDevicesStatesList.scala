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
trait ParamsResourceProjectsLocationsRegistriesDevicesStatesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the device. For example,
    * `projects/p0/locations/us-central1/registries/registry0/devices/device0`
    * or
    * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The number of states to list. States are listed in descending order of
    * update time. The maximum number of states retained is 10. If this value
    * is zero, it will return all the states available.
    */
  var numStates: js.UndefOr[Double] = js.native
}
object ParamsResourceProjectsLocationsRegistriesDevicesStatesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesDevicesStatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesDevicesStatesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesDevicesStatesListMutableBuilder[Self <: ParamsResourceProjectsLocationsRegistriesDevicesStatesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumStates(value: Double): Self = StObject.set(x, "numStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumStatesUndefined: Self = StObject.set(x, "numStates", js.undefined)
  }
}
