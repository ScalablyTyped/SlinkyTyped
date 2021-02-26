package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the `SearchOrganizations` method.
  */
@js.native
trait SchemaSearchOrganizationsRequest extends StObject {
  
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
    * A pagination token returned from a previous call to `SearchOrganizations`
    * that indicates from where listing should continue. This field is
    * optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object SchemaSearchOrganizationsRequest {
  
  @scala.inline
  def apply(): SchemaSearchOrganizationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchOrganizationsRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchOrganizationsRequestMutableBuilder[Self <: SchemaSearchOrganizationsRequest] (val x: Self) extends AnyVal {
    
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
