package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * An optional query string used to filter the Organizations to return in
    * the response. Filter rules are case-insensitive.   Organizations may be
    * filtered by `owner.directoryCustomerId` or by `domain`, where the domain
    * is a G Suite domain, for example:  |Filter|Description|
    * |------|-----------| |owner.directorycustomerid:123456789|Organizations
    * with `owner.directory_customer_id` equal to `123456789`.|
    * |domain:google.com|Organizations corresponding to the domain
    * `google.com`.|  This field is optional.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of Organizations to return in the response. This field
    * is optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A pagination token returned from a previous call to `ListOrganizations`
    * that indicates from where listing should continue. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsList {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsListMutableBuilder[Self <: ParamsResourceOrganizationsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
