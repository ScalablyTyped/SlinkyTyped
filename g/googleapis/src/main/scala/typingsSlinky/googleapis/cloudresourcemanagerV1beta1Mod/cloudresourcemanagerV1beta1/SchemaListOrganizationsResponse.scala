package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response returned from the `ListOrganizations` method.
  */
@js.native
trait SchemaListOrganizationsResponse extends StObject {
  
  /**
    * A pagination token to be used to retrieve the next page of results. If
    * the result is too large to fit within the page size specified in the
    * request, this field will be set with a token that can be used to fetch
    * the next page of results. If this field is empty, it indicates that this
    * response contains the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of Organizations that matched the list query, possibly
    * paginated.
    */
  var organizations: js.UndefOr[js.Array[SchemaOrganization]] = js.native
}
object SchemaListOrganizationsResponse {
  
  @scala.inline
  def apply(): SchemaListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrganizationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListOrganizationsResponseMutableBuilder[Self <: SchemaListOrganizationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOrganizations(value: js.Array[SchemaOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOrganizationsVarargs(value: SchemaOrganization*): Self = StObject.set(x, "organizations", js.Array(value :_*))
  }
}
