package typingsSlinky.googleapis.containerV1Mod.containerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The cluster (project, location, cluster id) to get the discovery document
    * for. Specified in the format 'projects/x/locations/x/clusters/x'.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfigurationMutableBuilder[Self <: ParamsResourceProjectsLocationsClustersWellKnownGetopenidconfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
