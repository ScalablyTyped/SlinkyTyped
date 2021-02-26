package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsMonitoredresourcedescriptorsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The monitored resource descriptor to get. The format is
    * "projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}".
    * The {resource_type} is a predefined type, such as cloudsql_database.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsMonitoredresourcedescriptorsGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsMonitoredresourcedescriptorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMonitoredresourcedescriptorsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsMonitoredresourcedescriptorsGetMutableBuilder[Self <: ParamsResourceProjectsMonitoredresourcedescriptorsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
