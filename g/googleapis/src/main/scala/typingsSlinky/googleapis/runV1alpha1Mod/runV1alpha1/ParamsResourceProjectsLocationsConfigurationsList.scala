package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsConfigurationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional encoded string to continue paging.
    */
  var continue: js.UndefOr[String] = js.native
  
  /**
    * Allows to filter resources based on a specific value for a field name.
    * Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not
    * currently used by Cloud Run.
    */
  var fieldSelector: js.UndefOr[String] = js.native
  
  /**
    * Not currently used by Cloud Run.
    */
  var includeUninitialized: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows to filter resources based on a label. Supported operations are =,
    * !=, exists, in, and notIn.
    */
  var labelSelector: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records that should be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The project ID or project number from which the configurations should be
    * listed.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The baseline resource version from which the list or watch operation
    * should start. Not currently used by Cloud Run.
    */
  var resourceVersion: js.UndefOr[String] = js.native
  
  /**
    * Flag that indicates that the client expects to watch this resource as
    * well. Not currently used by Cloud Run.
    */
  var watch: js.UndefOr[Boolean] = js.native
}
object ParamsResourceProjectsLocationsConfigurationsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsConfigurationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConfigurationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsConfigurationsListMutableBuilder[Self <: ParamsResourceProjectsLocationsConfigurationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setContinue(value: String): Self = StObject.set(x, "continue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUndefined: Self = StObject.set(x, "continue", js.undefined)
    
    @scala.inline
    def setFieldSelector(value: String): Self = StObject.set(x, "fieldSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldSelectorUndefined: Self = StObject.set(x, "fieldSelector", js.undefined)
    
    @scala.inline
    def setIncludeUninitialized(value: Boolean): Self = StObject.set(x, "includeUninitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUninitializedUndefined: Self = StObject.set(x, "includeUninitialized", js.undefined)
    
    @scala.inline
    def setLabelSelector(value: String): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSelectorUndefined: Self = StObject.set(x, "labelSelector", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setResourceVersion(value: String): Self = StObject.set(x, "resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceVersionUndefined: Self = StObject.set(x, "resourceVersion", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
