package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request sent to the [ListAvailableOrgPolicyConstraints]
  * google.cloud.OrgPolicy.v1.ListAvailableOrgPolicyConstraints] method.
  */
@js.native
trait SchemaListAvailableOrgPolicyConstraintsRequest extends StObject {
  
  /**
    * Size of the pages to be returned. This is currently unsupported and will
    * be ignored. The server may at any point start using this field to limit
    * page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Page token used to retrieve the next page. This is currently unsupported
    * and will be ignored. The server may at any point start using this field.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object SchemaListAvailableOrgPolicyConstraintsRequest {
  
  @scala.inline
  def apply(): SchemaListAvailableOrgPolicyConstraintsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAvailableOrgPolicyConstraintsRequest]
  }
  
  @scala.inline
  implicit class SchemaListAvailableOrgPolicyConstraintsRequestMutableBuilder[Self <: SchemaListAvailableOrgPolicyConstraintsRequest] (val x: Self) extends AnyVal {
    
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
