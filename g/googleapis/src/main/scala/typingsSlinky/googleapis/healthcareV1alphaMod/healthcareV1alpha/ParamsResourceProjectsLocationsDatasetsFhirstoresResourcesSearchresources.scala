package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the FHIR store to retrieve resources from.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource to search.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresourcesMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
