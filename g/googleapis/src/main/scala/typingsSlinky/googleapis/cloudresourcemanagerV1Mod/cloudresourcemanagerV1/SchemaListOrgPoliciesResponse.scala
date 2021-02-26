package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response returned from the ListOrgPolicies method. It will be empty if
  * no `Policies` are set on the resource.
  */
@js.native
trait SchemaListOrgPoliciesResponse extends StObject {
  
  /**
    * Page token used to retrieve the next page. This is currently not used,
    * but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The `Policies` that are set on the resource. It will be empty if no
    * `Policies` are set.
    */
  var policies: js.UndefOr[js.Array[SchemaOrgPolicy]] = js.native
}
object SchemaListOrgPoliciesResponse {
  
  @scala.inline
  def apply(): SchemaListOrgPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOrgPoliciesResponse]
  }
  
  @scala.inline
  implicit class SchemaListOrgPoliciesResponseMutableBuilder[Self <: SchemaListOrgPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPolicies(value: js.Array[SchemaOrgPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: SchemaOrgPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
